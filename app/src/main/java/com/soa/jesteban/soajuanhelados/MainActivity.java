package com.soa.jesteban.soajuanhelados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.soa.jesteban.soajuanhelados.utils.HeladoFactory;
import com.soa.jesteban.soajuanhelados.utils.IHeladoFactory;

public class MainActivity extends AppCompatActivity {

    String[] sabores = {"COCO","FRESA","MANí"};
    String valorSeleccionado = "";
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner selectorHelados = (Spinner) findViewById(R.id.saboresSpinner);
        selectorHelados.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sabores));
        final TextView resultTextView = (TextView) findViewById(R.id.heladoResultado);

        Button button = (Button) findViewById(R.id.btnGenerarHelado);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";
                HeladoFactory factory = new HeladoFactory();

                switch (index){
                    case 0:
                        result = factory.fabricar(IHeladoFactory.Sabor.COCO).obtenerIngredientes();
                        break;
                    case 1:
                        result = factory.fabricar(IHeladoFactory.Sabor.FRESA).obtenerIngredientes();
                        break;
                    case 2:
                        result = factory.fabricar(IHeladoFactory.Sabor.MANI).obtenerIngredientes();
                        break;

                }
                resultTextView.setText(result);




            }
        });

        selectorHelados.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id)
            {
                Toast.makeText(adapterView.getContext(),
                        (String) adapterView.getItemAtPosition(pos), Toast.LENGTH_SHORT).show();
                        valorSeleccionado = (String) adapterView.getItemAtPosition(pos);
                        index = pos;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {    }
        });
    }



}
