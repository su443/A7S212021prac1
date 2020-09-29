package mx.edu.tesoem.isc.svj.comunicacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtnombre);
    }
    public void Pantalla1(View v){
        Intent intent = new Intent(this, frmUno.class);
        startActivity(intent);
        finish();

    }

    public void pantalla2(View v){
        Intent intent= new Intent(this, ParametroActivity.class);
        intent.putExtra("Nombre",txtnombre.getText().toString());
        startActivity(intent);
    }
}