package com.example.estacionvl_tc_014.vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button sumar, restar, div, mul;
    TextView resultado;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Vincula el Activity con el Layout
        setContentView(R.layout.activity_main);

        sumar = (Button) findViewById(R.id.sumar);
        restar = (Button) findViewById(R.id.restar);
        div = (Button) findViewById(R.id.div);
        mul = (Button) findViewById(R.id.mul);

        resultado = (TextView) findViewById(R.id.resultado);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        sumar.setOnClickListener(this);

        Log.i("ciclovida","Entro en onCreate");
    }


    //region Metodos del ciclo de vida
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclovida", "Entro en onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclovida", "Entro en onResume");
    }

    @Override
    protected void onPause() {
        Log.i("ciclovida", "Entro en onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("ciclovida", "Entro en onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclovida", "Entro en onRestart");
    }

    @Override
    protected void onDestroy() {
        Log.i("ciclovida", "Entro en onDestroy");
        super.onDestroy();
    }
    //endregion


    @Override
    public void onClick(View v) {

    }
}
