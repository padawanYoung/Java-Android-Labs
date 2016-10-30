package com.example.sergey.serogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(Event);
    }
    private View.OnClickListener Event = new View.OnClickListener() {
        public void onClick(View v) {
            txt1.setText("Кнопка была нажата!");
        }
    };
}
