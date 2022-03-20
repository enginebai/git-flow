object LoginManager {
    private val loginApi by inject<LoginApiServicie>()

    suspend fun loginByEmail(mail: String, password: String) {
        // FIXME: exchange the parameters
        loginApi.emailLogin(password, mail)
    }
}
