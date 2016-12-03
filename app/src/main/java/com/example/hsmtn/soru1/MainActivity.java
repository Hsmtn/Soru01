package com.example.hsmtn.soru1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kurd k=new Kurd();
        Turk t=new Turk();
        Arab a=new Arab();

        k.speak("Merheba");
        t.speak("Merhaba");
        a.speak("merhebe");
    }
}
