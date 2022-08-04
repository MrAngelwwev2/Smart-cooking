package pe.uni.alarreateguic.smartcooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    Button continuar;
    EditText ingresaNombre;


    public void buttonPress(View view){
        Toast.makeText(PrincipalActivity.this, "Por favor, ingrese su nombre.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        continuar = (Button)findViewById(R.id.botonContinuar);
        ingresaNombre = findViewById(R.id.ingresaNombre);

        continuar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Bundle enviaDatos = new Bundle();
                enviaDatos.putString("keyDatos", ingresaNombre.getText().toString());
                Intent intent = new Intent(PrincipalActivity.this,InterfazUno.class);
                intent.putExtras(enviaDatos);
                startActivity(intent);
            }
        });

    }
}