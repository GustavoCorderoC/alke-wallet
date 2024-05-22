package cordero.gustavo.alkewallet.model

data class RegisterResponse(
    val firstName: String?,
    val lastName: String?,
    val email: String?,
    val password: String?,
    val roleID: Long?,
    val points: Long?,
    val error: String?,
    val status: Long
)
