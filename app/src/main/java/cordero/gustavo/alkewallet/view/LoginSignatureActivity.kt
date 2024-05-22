package cordero.gustavo.alkewallet.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cordero.gustavo.alkewallet.databinding.ActivityLoginSignatureBinding

class LoginSignatureActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginSignatureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityLoginSignatureBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //val btn_crearCuenta = findViewById<Button>(R.id.btn_creaCuenta)

        binding.btnCrearCuenta.setOnClickListener {
            val abrirPantallaTres = Intent(this, LoginPageActivity::class.java)
            startActivity(abrirPantallaTres)
        }


        binding.txtYaTieneCuenta.setOnClickListener {
            val abrirPantallaCuatro = Intent(this, SignupPageActivity::class.java)
            startActivity(abrirPantallaCuatro)
        }

    }
}