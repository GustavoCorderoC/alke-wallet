package cordero.gustavo.alkewallet.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cordero.gustavo.alkewallet.databinding.ActivitySignupPageBinding

class SignupPageActivity : AppCompatActivity() {

    lateinit var binding: ActivitySignupPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivitySignupPageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //val btn_crearCuenta = findViewById<Button>(R.id.btn_creaCuenta)

        binding.btnCrearCuenta.setOnClickListener {
            val abrirPantallaTres = Intent(this, LoginPageActivity::class.java)
            startActivity(abrirPantallaTres)
        }

        binding.txtYaTieneCuenta.setOnClickListener {
            val irLogin = Intent(this, LoginPageActivity::class.java)
            startActivity(irLogin)
        }

    }
}