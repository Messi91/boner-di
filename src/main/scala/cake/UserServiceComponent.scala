package cake

trait UserServiceComponent { this: UserRepositoryComponent =>

  val userService: UserService

  class UserService {

    def authenticate(username: String, password: String): User = {
      userRepository.authenticate(username, password)
    }

    def create(user: User) = {
      userRepository.create(user)
    }

    def delete(user: User) = {
      userRepository.delete(user)
    }
  }
}
