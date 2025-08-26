import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.javaapi.core.CheckBuilder.JsonPath


object Request {
  def getOrders = {
    exec(http("getOrders")
      .get("/?npr=1")
      .check(status.is(200))
    )
  }
  def postOrders = {
    exec(http("postOrders")
      .post("/post")
      .body(StringBody(
        """
          |{"test": "Hello!"}
          |""".stripMargin))
      .header("content-type", "application/json")
      .check(status.is(200))
      .check(jsonPath("$.id").saveAs("orderId"))
    )
  }
  def putOrder = {
    .exec(http("edit Order")
      .put(s"/edit/${orderId}")
      .body(StringBody(
        """
          |{"text":"Change"}
          |""".stripMargin))
      .header("content-type", "application/json")
      .check(status.is(200))
    )
  }
}
