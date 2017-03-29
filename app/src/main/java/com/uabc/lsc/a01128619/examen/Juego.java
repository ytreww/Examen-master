package com.uabc.lsc.a01128619.examen;

import android.app.DialogFragment;
import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Juego extends AppCompatActivity implements View.OnClickListener{

    // Posiciones del tablero
    private PosicionTablero x00;
    private PosicionTablero x01;
    private PosicionTablero x02;
    private PosicionTablero x10;
    private PosicionTablero x11;
    private PosicionTablero x12;
    private PosicionTablero x20;
    private PosicionTablero x21;
    private PosicionTablero x22;
    private int turno = 0;
    private int jugadorUnoPuntos=0;
    private int jugadorDosPuntos=0;
    private String jugadorUnoMovimiento;
    private String jugadorDosMovimiento;
    boolean juegoTerminado=true;
    DialogFragment framentoAviso = new FragmentoAvisos();
    Comunicacion comunicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        // Inicializacion de los botones
        x00 = (PosicionTablero) findViewById(R.id.button_1);
        x01 = (PosicionTablero) findViewById(R.id.button_2);
        x02 = (PosicionTablero) findViewById(R.id.button_3);
        x10 = (PosicionTablero) findViewById(R.id.button_4);
        x11 = (PosicionTablero) findViewById(R.id.button_5);
        x12 = (PosicionTablero) findViewById(R.id.button_6);
        x20 = (PosicionTablero) findViewById(R.id.button_7);
        x21 = (PosicionTablero) findViewById(R.id.button_8);
        x22 = (PosicionTablero) findViewById(R.id.button_9);
        x00.setOnClickListener(this);
        x01.setOnClickListener(this);
        x02.setOnClickListener(this);
        x10.setOnClickListener(this);
        x11.setOnClickListener(this);
        x12.setOnClickListener(this);
        x20.setOnClickListener(this);
        x21.setOnClickListener(this);
        x22.setOnClickListener(this);
        comunicacion = new Comunicacion();
        actualizar();
        setCoords();
    }

    @Override
    public void onClick(View v) {
        PosicionTablero button = (PosicionTablero) v;

        String jugadorUno = "X";
        String jugadorDos = "O";
        int x = button.getPosX();
        int y = button.getPosY();
        String numero="5556";
        String mensaje=x+","+y;
        SmsManager smsManager= SmsManager.getDefault();
        smsManager.sendTextMessage(numero,null,mensaje,null,null);



    }

    public void enviarMovimiento(){

    }

    public void setCoords(){
        x00.setPosX(0);
        x00.setPosY(0);
        x01.setPosX(0);
        x01.setPosY(1);
        x02.setPosX(0);
        x02.setPosY(2);
        x10.setPosX(1);
        x10.setPosY(0);
        x11.setPosX(1);
        x11.setPosY(1);
        x12.setPosX(1);
        x12.setPosY(2);
        x20.setPosX(2);
        x20.setPosY(0);
        x21.setPosX(2);
        x21.setPosY(1);
        x22.setPosX(2);
        x22.setPosY(2);

    }


    public void actualizar(){
        framentoAviso.show(getFragmentManager(), "Aviso");
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getJugadorUnoPuntos() {
        return jugadorUnoPuntos;
    }

    public void setJugadorUnoPuntos(int jugadorUnoPuntos) {
        this.jugadorUnoPuntos = jugadorUnoPuntos;
    }

    public int getJugadorDosPuntos() {
        return jugadorDosPuntos;
    }

    public void setJugadorDosPuntos(int jugadorDosPuntos) {
        this.jugadorDosPuntos = jugadorDosPuntos;
    }

    public String getJugadorUnoMovimiento() {
        return jugadorUnoMovimiento;
    }

    public void setJugadorUnoMovimiento(String jugadorUnoMovimiento) {
        this.jugadorUnoMovimiento = jugadorUnoMovimiento;
    }

    public String getJugadorDosMovimiento() {
        return jugadorDosMovimiento;
    }

    public void setJugadorDosMovimiento(String jugadorDosMovimiento) {
        this.jugadorDosMovimiento = jugadorDosMovimiento;
    }
}
