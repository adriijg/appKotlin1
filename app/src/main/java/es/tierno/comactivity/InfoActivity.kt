package es.tierno.comactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_info)

        val btn : Button = findViewById(R.id.btnBack)

        val extras = intent.extras
        val nombre = extras!!.getString("nombre")
        val apellidos = extras!!.getString("apellidos")
        val dni = extras!!.getString("dni")

        val editNombre: EditText = findViewById(R.id.txtName2)
        val editApellido: EditText = findViewById(R.id.txtApellidos2)
        val editDni: EditText = findViewById(R.id.txtDNI2)

        editNombre.setText(nombre)
        editApellido.setText(apellidos)
        editDni.setText(dni)


        btn.setOnClickListener { view ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        }
    }
}