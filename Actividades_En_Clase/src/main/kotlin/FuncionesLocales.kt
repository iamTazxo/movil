fun login(user: String, password: String): Boolean {
    fun validate(input: String): Boolean {
        if (input.isEmpty()) {
            return false
        }
        return true
    }

    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}