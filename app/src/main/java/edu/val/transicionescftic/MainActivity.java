package edu.val.transicionescftic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void transicion(View view) {
        Intent i = new Intent(this, TransicionDestinoActivity.class);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
           //animaciones soportadas
            ActivityOptions ao = ActivityOptions.makeSceneTransitionAnimation(this);
            //así hago que se tengan en cuenta los atributos del tema
            startActivity(i, ao.toBundle());
        } else {

            startActivity(i); //un móvil triste, sin soporte de animaciones :S
        }
    }

    public void dePequeAGrande(View view) {

        Intent intent = new Intent(this, AndroidPequeActivity.class);
        startActivity(intent);
    }
}
