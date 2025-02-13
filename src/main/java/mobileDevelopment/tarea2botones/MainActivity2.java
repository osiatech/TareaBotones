
package mobileDevelopment.tarea2botones;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity
{
    //Objectos
    TextView userName;
    Button metros_to_pies_button, pies_to_metros_button, kilogramos_to_libras_button, libras_to_kilogramos_button
            ,celsius_to_fahrenheit, fahrenheit_to_celsius;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        pies_to_metros_button = findViewById(R.id.button1);
        metros_to_pies_button = findViewById(R.id.button2);
        kilogramos_to_libras_button = findViewById(R.id.button3);
        libras_to_kilogramos_button = findViewById(R.id.button4);
        celsius_to_fahrenheit = findViewById(R.id.button5);
        fahrenheit_to_celsius = findViewById(R.id.button6);


        userName = findViewById(R.id.welcome_username);
        String textRecibido = getIntent().getStringExtra("userName");


        if(textRecibido != null)
        {
            String texto = "Bienvenido "+textRecibido;
            userName.setText(texto);
        }


        pies_to_metros_button.setOnClickListener(view ->
        {
            Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(intent);
        });


        metros_to_pies_button.setOnClickListener(view ->
        {
            Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
            startActivity(intent);
        });


        kilogramos_to_libras_button.setOnClickListener(view ->
        {
           Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
           startActivity(intent);
        });


        libras_to_kilogramos_button.setOnClickListener(view ->
        {
           Intent intent = new Intent(MainActivity2.this, MainActivity6.class);
           startActivity(intent);
        });


        celsius_to_fahrenheit.setOnClickListener(view ->
        {
           Intent intent = new Intent(MainActivity2.this,MainActivity7.class);
           startActivity(intent);
        });

        fahrenheit_to_celsius.setOnClickListener(view ->
        {
           Intent intent = new Intent(MainActivity2.this,MainActivity8.class);
           startActivity(intent);
        });
    }
}