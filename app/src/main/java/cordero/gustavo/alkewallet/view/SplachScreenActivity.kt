package cordero.gustavo.alkewallet.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cordero.gustavo.alkewallet.R
import cordero.gustavo.alkewallet.databinding.SplachscreenactivityBinding
import java.util.Timer
import java.util.TimerTask

class SplachScreenActivity : AppCompatActivity() {
    lateinit var binding: SplachscreenactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //Esta es la linea que dice que xml va a mostrar
        binding = SplachscreenactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**
         * Abiendo la pantalla con un click

         */
        //Se declara la imagen como una variable
        binding.logoApp.setOnClickListener {
            val abrirPantallaLogin = Intent(this, LoginSignUpActivity::class.java)
            startActivity(abrirPantallaLogin)
            finish()
        }

        /**
         * Abiendo la pantalla con un timer
         */
        var task: TimerTask? = object : TimerTask() {
            override fun run() {
                val abrirPantallaLogin = Intent(baseContext, LoginSignUpActivity::class.java)
                startActivity(abrirPantallaLogin)
                finish()
            }
        }

        val timer = Timer()
        timer.schedule(task, 2000)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}