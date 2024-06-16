package cordero.gustavo.alkewallet.viewModel

import android.app.Application
import cordero.gustavo.alkewallet.model.ListUserResponse

class AlkeApp : Application(){

    companion object{
        //Vamos a crear un objeto usuurio que va a estar global al proyecto
        var usuarioLogeado: ListUserResponse? = null
        //Vamos a crear un String que va a ser el Token
        var tokenAcesso: String? = ""
    }

    override fun onCreate() {
        super.onCreate()
        usuarioLogeado = null
        tokenAcesso= null
    }
}