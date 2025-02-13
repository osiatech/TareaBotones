
package mobileDevelopment.tarea2botones;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity
{
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonConvertir, buttonLimpiar;
    EditText piesInput, resultado_input;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        piesInput = findViewById(R.id.pies_input);
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        buttonConvertir = findViewById(R.id.button_convertir);
        buttonLimpiar = findViewById(R.id.button_limpiar);
        resultado_input = findViewById(R.id.metros_input_result);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.append("9");
            }
        });

        buttonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                piesInput.setText("");
                resultado_input.setText("");
            }
        });

        buttonConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String pies_input = piesInput.getText().toString();
                double pies = Double.parseDouble(pies_input);
                double pies_to_metros = pies * 0.3048;
                String pies_to_metros_str = pies_to_metros+"";
                resultado_input.setText(pies_to_metros_str);
            }
        });
    }
}