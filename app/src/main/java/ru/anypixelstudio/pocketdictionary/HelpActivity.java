package ru.anypixelstudio.pocketdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    String version;
    TextView VersionProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        /* Выводит версию программы для пользователя*/
        VersionProgram = (TextView)findViewById(R.id.VersionProgram);
        version = "1.0.1";
        VersionProgram.setText("Version " + version + "");
    }
}
