package com.example.dm2.ejercicioslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lstPaises;
    private TextView habitantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] llamadas = new String[]{"Alemania", "Francia", "Inglaterra", "España", "Belgica"};
        final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, llamadas);

        lstPaises = (ListView) findViewById(R.id.listaPaises);
        habitantes=(TextView)findViewById(R.id.habitantes);

        lstPaises.setAdapter(adaptador);
        lstPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s=adaptador.getItem(position);
                switch (position)
                {
                    case 0:
                        habitantes.setText("Pais: "+s+" "+"habitantes: "+"80 millones");
                        break;
                    case 1:
                        habitantes.setText("Pais: "+s+" "+"habitantes: "+"67 millones");
                        break;
                    case 2:
                        habitantes.setText("Pais: "+s+" "+"habitantes: "+"53 millones");
                        break;
                    case 3:
                        habitantes.setText("Pais: "+s+" "+"habitantes: "+"47 millones");
                        break;
                    case 4:
                        habitantes.setText("Pais: "+s+" "+"habitantes: "+"11 millones");
                        break;
                }

            }
        });
    }
}
