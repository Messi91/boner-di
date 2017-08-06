package implicits

class Warmer(
  implicit val onOff: OnOffDevice,
  implicit val sensor: SensorDevice
) {
  def trigger = {
    if (sensor.isCoffeePresent) onOff.on
    else onOff.off
  }
}
