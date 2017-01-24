package edu.washington.vicky37.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int ButtonCounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonActivity();
    }

    public void ButtonActivity(){
        final Button GiantButton = (Button) findViewById(R.id.button);
        GiantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonCounter++;
                GiantButton.setText("You have pushed me "+ButtonCounter+" times!");
            }
        });
    }
}
