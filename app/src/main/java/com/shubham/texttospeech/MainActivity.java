package com.shubham.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{
EditText e1;
Button b1;
String s1;
TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tts=new TextToSpeech(MainActivity.this,this);
        e1=findViewById(R.id.edit2);
        b1=findViewById(R.id.loginbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                tts.speak(s1,TextToSpeech.QUEUE_ADD,null);
            }
        });

    }

    @Override
    public void onInit(int status){
        tts.setLanguage(Locale.ENGLISH);
        tts.setSpeechRate(0.8f);

    }
}
