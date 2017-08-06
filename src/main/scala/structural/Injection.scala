package structural

object Config {
  lazy val heater = new Heater
  lazy val potSensor = new PotSensor
  lazy val warmer = new Warmer(this)
}

object StructuralApp extends App {
  new Client(Config)
}
