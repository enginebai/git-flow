object LoginManager {
    private val loginApi by inject<LoginApiServicie>()

    suspend fun loginByEmail(mail: String, password: String) {
<<<<<<< HEAD
        loginApi.emailLogin(mail, password)
=======
        loading = true
        loginApi.emailLogin(mail, password).subscribe()
        loading = false
>>>>>>> 7d87c3d (Fix login API call site)
    }
}
