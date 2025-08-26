import io.gatling.core.Predef.scenario
import Request._


object Simulation {
  def getOrdersScen = scenario("first scenario")
    .exec(getOrders)
    .exec(postOrders)
    .exec(putOrder)
}
