package es.tierno.comactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btnSend)
        
        val editTextNombre = findViewById<EditText>(R.id.txtName)
        val editTextApellido = findViewById<EditText>(R.id.txtApellidos)
        val editTextDNI = findViewById<EditText>(R.id.txtDNI)

        btn.setOnClickListener { view ->
            val intent = Intent(this, InfoActivity::class.java)

            val nombre : String = editTextNombre.text.toString()
            val apellido : String = editTextApellido.text.toString()
            val dni : String = editTextDNI.text.toString()

            intent.putExtra("nombre", nombre)
            intent.putExtra("apellidos", apellido)
            intent.putExtra("dni", dni)

            startActivity(intent);
        }
    }
}