package com.example.ahorcado;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText letra;
    Button mandar;
    TextView palabra, palabra2, ganaste, contador;

    String[] palabras = {"Messi", "Checo", "Leclerc", "Lamine", "Rapinha", "Colapinto",
                            "Piedri", "Sainz", "Patito", "Lewandowski"};
    String aux1 = "";
    String aux2 = "";
    int random;
    String palabraSeleccionada;
    boolean acierto;
    int errores = 0;

    ImageView inicial, error1, error2, error3, error4, error5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        letra = findViewById(R.id.letra);
        mandar = findViewById(R.id.mandar);
        palabra = findViewById(R.id.palabra);
        palabra2 = findViewById(R.id.palabra2);
        ganaste = findViewById(R.id.ganaste);
        contador = findViewById(R.id.errores);
        inicial = findViewById(R.id.inicial);

        mandar.setOnClickListener(this);
        inicial.setImageResource(R.drawable.ahorcado_inicio);

        random = (int) (Math.random() * palabras.length);
        palabraSeleccionada = palabras[random];
        palabra.setText(palabraSeleccionada);
        contador.setText("Te quedan 6 errores restantes");
    }

    @Override
    public void onClick(View v) {
        if (letra.getText().length() > 0) {
            acierto = false;
            palabraSeleccionada = palabraSeleccionada.toLowerCase();
            char letraIngresada = letra.getText().toString().toLowerCase().charAt(0);
            aux1 = "";

            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                if (palabraSeleccionada.charAt(i) == letraIngresada) {
                    aux1 = aux1 + letraIngresada;
                    acierto = true;
                } else {
                    if (i < aux2.length()) {
                        aux1 = aux1 + aux2.charAt(i);
                    } else {
                        aux1 = aux1 + '-';
                    }
                }
            }
            aux2 = aux1;
            palabra2.setText(aux2);

            if (acierto==false)
                errores ++;

            if (errores == 1){
               inicial.setImageResource(R.drawable.ahorcadito1);
            }
            if (errores == 2){
               inicial.setImageResource(R.drawable.ahorcadito2);
            }
            if (errores == 3){
               inicial.setImageResource(R.drawable.ahorcadito3);
            }
            if (errores == 4){
               inicial.setImageResource(R.drawable.ahorcadito4);
            }
            if (errores == 5){
               inicial.setImageResource(R.drawable.ahorcadito5);
            }
            if (errores == 6){
               inicial.setImageResource(R.drawable.ahorcadito6);
            }
            if (aux2.equals(palabraSeleccionada)) {
                ganaste.setText("Ganaste el juego!!");
                mandar.setEnabled(false);
            } else if (errores == 6) {
                ganaste.setText("Perdiste, alcanzaste el límite de errores :(");
                mandar.setEnabled(false);
            }
            letra.setText("");

            contador.setText("Te quedan " + (6-errores) + " errores restantes");
        } else {
            Toast.makeText(this, "Ingrese una letra", Toast.LENGTH_SHORT).show();
        }
    }
}
