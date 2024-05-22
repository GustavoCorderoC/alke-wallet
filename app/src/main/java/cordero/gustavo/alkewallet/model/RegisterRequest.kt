package cordero.gustavo.alkewallet.model

data class RegisterRequest(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val roleID: Long,
    val points: Long
)
