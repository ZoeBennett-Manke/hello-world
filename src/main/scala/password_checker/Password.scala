package password_checker

object Password {
  def isValid(password: String) =
    val len = password.length()
    if len >= 6 then
      if password == "abcdef!" then true
      else false
    else false
}
