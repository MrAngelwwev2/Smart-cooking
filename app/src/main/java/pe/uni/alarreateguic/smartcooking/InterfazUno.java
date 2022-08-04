package pe.uni.alarreateguic.smartcooking;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InterfazUno extends AppCompatActivity {

    TextView recibeNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_uno);

        recibeNombre = findViewById(R.id.recibeNombre);

        Bundle recibeDatos = getIntent().getExtras();
        String nombre = recibeDatos.getString("keyDatos");

        recibeNombre.setText("Hola " + nombre);
    }
}