package cordero.gustavo.alkewallet.model

data class Accountresponse(
    val creationDate : String,
    val money : Double,
    val isBlocked : Boolean,
    val userId : Int,
    val error : Int,
    val status : Int
)
