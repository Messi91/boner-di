package implicits

class Heater extends OnOffDevice {

  override def on = println("heater.on")

  override def off = println("heater.off")
}

class PotSensor extends SensorDevice {

  override def isCoffeePresent = true
}
