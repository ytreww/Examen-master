package com.uabc.lsc.a01128619.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
    private Intent intent;
    private Button btnIniciar;
    private Button btnPuntuacion;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, Juego.class);
        btnIniciar= (Button) findViewById(R.id.btnInciar);
        btnPuntuacion = (Button)findViewById(R.id.btnPuntuacion);
        btnSalir = (Button) findViewById( R.id.btnSalir);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }


}
