package br.com.up.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button buttonAction;
    private ArrayList<String> massages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        massages.add("I´ll do what I must!");
        massages.add("Kill them I must!");
        massages.add("Don't forget me!");
        massages.add("Hummm GAY they are!");
        massages.add("General Kenobi!!!");

        textViewTitle = (TextView) findViewById(R.id.fts);
        buttonAction = (Button) findViewById(R.id.explode);

        textViewTitle.setText("Hello there!");

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position = new Random().nextInt(massages.size());
                String message = massages.get(position);
                textViewTitle.setText(message);
            }
        };

        buttonAction.setOnClickListener(listener);

    }
}