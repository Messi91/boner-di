package structural

trait OnOffDevice {
  def on: Unit
  def off: Unit
}

trait SensorDevice {
  def isCoffeePresent: Boolean
}
