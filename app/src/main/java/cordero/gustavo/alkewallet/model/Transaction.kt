package cordero.gustavo.alkewallet.model

import okhttp3.internal.threadName

data class Transaction(

    val name: String,
    val lastName: String,
    val date: String,
    val amount: String,
    val imgUrl: String? = null
)
