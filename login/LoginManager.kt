object LoginManager {
    private val loginApi by inject<LoginApiServicie>()

    suspend fun loginByEmail(mail: String, password: String) {
        loading = true
        loginApi.emailLogin(mail, password).subscribe()
        loading = false
    }
}
