
package mobileDevelopment.tarea2botones;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    // Objects:
    Button continue_button;
    EditText inserted_name_input;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Elementos Visuales
        continue_button = findViewById(R.id.continue_button);
        inserted_name_input = findViewById(R.id.edit_text_name);


        continue_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String insertedName = inserted_name_input.getText().toString().trim();
                if(insertedName.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"El campo nombre no puede estar vacio",Toast.LENGTH_SHORT).show();
                }else
                {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("userName", insertedName);
                    startActivity(intent);
                }
            }
        });
    }
}