package cake

object ComponentRegistry extends UserRepositoryComponent with UserServiceComponent {
  val userService = new UserService
  val userRepository = new UserRepository
}
