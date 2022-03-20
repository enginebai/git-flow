interface LoginApiService {
    suspend fun loginByEmail(mail: String, password: String): BaseResponse<LoginResult>
}