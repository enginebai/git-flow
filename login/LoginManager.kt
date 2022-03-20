object LoginManager {
    private val loginApi by inject<LoginApiServicie>()

    suspend fun loginByEmail(mail: String, password: String) {
        loginApi.emailLogin(mail, password)
    }
}
