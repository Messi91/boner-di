package basic

class UserRepository {

  def authenticate(username: String, password: String): User = {
    val user = User(username, password)
    println("authenticating user: " + user)
    user
  }

  def create(user: User) = {
    println("creating user: " + user)
  }

  def delete(user: User) = {
    println("deleting uer: " + user)
  }
}
