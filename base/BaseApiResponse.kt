open class BaseResponse<T> {
    @SerializedName("data")
    val data: T? = null

    @SerializedName("code")
    val code: ApiCode? = null

    @SerializedName("message")
    val message: String? = null
}
