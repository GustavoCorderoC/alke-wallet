package cordero.gustavo.alkewallet.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cordero.gustavo.alkewallet.model.rec.CajitaRetro
import cordero.gustavo.alkewallet.model.rec.CrearCuentaServ
import cordero.gustavo.alkewallet.model.RegisterRequest
import cordero.gustavo.alkewallet.model.RegisterResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterViewModel : ViewModel() {

    val RegistrationValid = MutableLiveData<Boolean>()
    /*  val isRegistrationValid: LiveData<Boolean> get() = RegistrationValid
      fun crearUsuario(firstName: String, lastName: String, email: String, password: String, password1: String) {
          RegistrationValid.value = firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && password1.isNotEmpty()

          }*/

    fun hacerRegistro(firstName: String, lastName: String, email: String, password: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                //Llamar a la API
                if (firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                    //   RegistrationValid.postValue(true)
                    val crearUsuario = CajitaRetro.retrofit.create(CrearCuentaServ::class.java)
                    val llamadaCreacion = crearUsuario.crearUsuario(
                        RegisterRequest(
                            firstName,
                            lastName,
                            email,
                            password,
                            2,
                            100
                        )
                    )
// ahora llamamos
                    llamadaCreacion.enqueue(object: Callback<RegisterResponse>{
                        override fun onResponse(
                            call: Call<RegisterResponse>,
                            response: Response<RegisterResponse>
                        ) {

                            if (response.isSuccessful)
                                RegistrationValid.postValue(true)
                            else{
                                RegistrationValid.postValue(false)
                            }
                        }

                        override fun onFailure(p0: Call<RegisterResponse>, p1: Throwable) {

                            RegistrationValid.postValue(false)
                        }


                    })



                } else {
                    RegistrationValid.postValue(false)
                }

            } catch (e: Exception) {
                //aqui si hay un error se ejecuta este codigo
                RegistrationValid.postValue(false)
            }
        }
    }

}




