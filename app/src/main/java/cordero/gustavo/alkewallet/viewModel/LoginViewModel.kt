package cordero.gustavo.alkewallet.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {

    //variable que almacena el resultado del login
    val loginResultLiveData = MutableLiveData<Boolean>()

    /**
     * funcion que implementa una corrutina para
     */
    fun login(email: String, password: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                if (email == "admin@test.cl" && password == "admin") {
                    loginResultLiveData.postValue(true)
                } else {
                    loginResultLiveData.postValue(false)
                }

            } catch (e: Exception) {
                //codigo de erorr
                loginResultLiveData.postValue(false)

            }

        }

    }


}