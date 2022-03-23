object LoginManager {
    private val loginApi by inject<LoginApiServicie>()

    suspend fun loginByEmail(mail: String, password: String) {
	// Hotfix this
        loginApi.emailLogin(mail, password).subscribe()
    }
}
