package cl.bootcamp.myapplication4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextPassword, editTextEmail;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar los componentes
        editTextName = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        textView4 = findViewById(R.id.textView4);
        Button buttonMostrar = findViewById(R.id.buttonMostrar);

        // Configurar el botón
        buttonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarInformacion();
            }
        });
    }

    private void validarInformacion() {
        String name = editTextName.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();

        // Validación simple
        if (name.isEmpty() || password.isEmpty() || email.isEmpty()) {
            textView4.setText("Por favor completa todos los campos.");
        } else {
            // Mostrar la información ingresada
            String info = "Nombre: " + name + "\nContraseña: " + password + "\nEmail: " + email;
            textView4.setText(info);

            // Notificación de éxito
            Toast.makeText(this, "Información ingresada correctamente", Toast.LENGTH_LONG).show();
        }
    }
}