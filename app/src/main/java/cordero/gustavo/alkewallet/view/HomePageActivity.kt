package cordero.gustavo.alkewallet.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import cordero.gustavo.alkewallet.databinding.ActivityHomePageBinding
import cordero.gustavo.alkewallet.viewModel.LoginViewModel

class HomePageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomePageBinding
    private lateinit var viewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Configuracion Binding
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Configuracion ViewModel
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)



        binding.button2.setOnClickListener{
            val i = Intent(this, RequestMoneyActivity::class.java)
            startActivity(i)
        }

        binding.button3.setOnClickListener{
            val i = Intent(this, RequestMoneyActivity::class.java)
            startActivity(i)
        }


    }
}