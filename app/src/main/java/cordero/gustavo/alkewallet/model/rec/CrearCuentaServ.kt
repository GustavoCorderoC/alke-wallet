package cordero.gustavo.alkewallet.model.rec


import cordero.gustavo.alkewallet.model.RegisterRequest
import cordero.gustavo.alkewallet.model.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface CrearCuentaServ {

    @POST("users")
    fun crearUsuario(@Body usuarioCreado: RegisterRequest): Call<RegisterResponse>

}