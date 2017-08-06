package guice

import com.google.inject.Inject

class Heater extends OnOffDevice {

  override def on = println("heater.on")

  override def off = println("heater.off")
}

class PotSensor extends SensorDevice {

  override def isCoffeePresent = true
}

@Inject
class Warmer(
  val onOff: OnOffDevice,
  val sensor: SensorDevice
) extends IWarmer {
  def trigger = {
    if (sensor.isCoffeePresent) onOff.on
    else onOff.off
  }
}
