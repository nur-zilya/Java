import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import Simulation._
import com.typesafe.config.ConfigFactory

class LoadTest extends Simulation {
  val config = ConfigFactory.load("application.conf")

  val httpConf = http.baseUrl(config.getString("conf.baseUrl"))

  setUp(
    getOrdersScen.inject(
      constantUsersPerSec(config.getInt("conf.users")) during(config.getInt("conf.during"))
    ).protocols(httpConf)
  )

}
