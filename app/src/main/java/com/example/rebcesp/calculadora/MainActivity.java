package com.example.rebcesp.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText et, et1;
    Button bt, bt1, bt2, bt3;
    TextView tx;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Llamamos a los edittext primeramente que son los numeros
        et = (EditText)findViewById(R.id.PNumero);
        et1 = (EditText)findViewById(R.id.SNumero);
        //Llamamos a los botones
        bt = (Button)findViewById(R.id.btnSuma);
        bt1 = (Button)findViewById(R.id.btnResta);
        bt2 = (Button)findViewById(R.id.btnMultiplicacion);
        bt3 = (Button)findViewById(R.id.btnDivision);

        //Llamamos al textView que sera nuestro resultado

        tx = (TextView)findViewById(R.id.txtResultado);








    }

    public void sumar(View view){

    int n1= Integer.parseInt(et.getText().toString()); //Aqui estariamos parseando el entero, LUEGO de tomar el dato del texto y pasarlo a string
       int n2 = Integer.parseInt(et1.getText().toString());

        int resultado = n1+n2;


        tx.setText(String.valueOf(resultado)); //Pasamos el entero a una cadena 


    }

    public void restar(View v) {


        int n1 = Integer.parseInt(et.getText().toString());
        int n2 = Integer.parseInt(et1.getText().toString());

        int resultado = n1 - n2;

        tx.setText(String.valueOf(resultado));

    }

    public void multiplicar(View v){
        int n1 = Integer.parseInt(et.getText().toString());
        int n2 = Integer.parseInt(et1.getText().toString());

        int resultado = n1*n2;

        tx.setText(String.valueOf(resultado));

    }
    public void dividir(View v){

    int n1 = Integer.parseInt(et.getText().toString());
    int n2 = Integer.parseInt(et1.getText().toString());

    int resultado = n1 - n2;

        tx.setText(String.valueOf(resultado));
}

}
