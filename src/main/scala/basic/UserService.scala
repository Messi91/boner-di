package basic

class UserService(userRepository: UserRepository) {

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
