package implicits

object Services {
  implicit val heater = new Heater
  implicit val potSensor = new PotSensor
}

object ImplicitsApp extends App {
  import Services._

  val warmer = new Warmer
  warmer.trigger
}
