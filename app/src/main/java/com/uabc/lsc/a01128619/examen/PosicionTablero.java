package com.uabc.lsc.a01128619.examen;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * Created by SoporteCEA on 29/03/2017.
 */

public class PosicionTablero extends AppCompatButton {
    private int posX;
    private int posY;

    public PosicionTablero(Context context) {

        super(context);
    }
    public PosicionTablero(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    public PosicionTablero(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);

    }


    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
