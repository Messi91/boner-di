package guice

trait OnOffDevice {
  def on: Unit
  def off: Unit
}

trait SensorDevice {
  def isCoffeePresent: Boolean
}

trait IWarmer {
  def trigger
}

trait Client
