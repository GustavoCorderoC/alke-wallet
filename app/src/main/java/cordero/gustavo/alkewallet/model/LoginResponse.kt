package cordero.gustavo.alkewallet.model

data class LoginResponse(
    val accessToken: String?,
    val error: String?,
    val status: Long?
)
