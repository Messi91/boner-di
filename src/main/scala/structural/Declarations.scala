package structural


class Warmer(env: {
  val heater: OnOffDevice
  val potSensor: SensorDevice
}) {
  def trigger = {
    if (env.potSensor.isCoffeePresent) env.heater.on
    else env.heater.off
  }
}

class Client(env: {
  val warmer: Warmer
}) {
  env.warmer.trigger
}
