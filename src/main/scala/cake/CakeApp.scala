package cake

object CakeApp extends App {
  val userService = ComponentRegistry.userService
  val user = User("savage", "devast8")
  userService.create(user)
  userService.authenticate("savage", "devast8")
  userService.delete(user)
}
