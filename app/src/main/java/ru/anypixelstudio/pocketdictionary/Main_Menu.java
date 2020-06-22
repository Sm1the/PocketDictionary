package ru.anypixelstudio.pocketdictionary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main_Menu extends AppCompatActivity {
    /* Для мультиязычия на главной странице. */
    /*TextView labelOnMainScreen;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu);
        /*labelOnMainScreen = (TextView)findViewById(R.id.labelOnMainScreen);*/
        /*появитс в след. версии.*/
    }
/*Переход на xml форму - Search_List*/
    public void onTapBook(View v) {
        switch (v.getId()) {
            case R.id.imageView:
                Intent in = new Intent(this, Search_List.class);
                startActivity(in);
                break;
            default:
                break;
        }
    }
/*Переход на xml форму - HelpActivity*/
    public void onTapHelp(View v) {
        switch (v.getId()) {
            case R.id.imageHelp:
                Intent in = new Intent(this, HelpActivity.class);
                startActivity(in);
                break;
            default:
                break;
        }
    }
/* Метод открывает браузер на телефона и отправляет пользователя на сайт googleTranslate*/    
    public void onTapTranslate(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://translate.google.com"));
        startActivity(intent);
    }
/*Закрытие приложения по двойному клику кнопки "Назад"*/
    private static long back_pressed;
    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Toast.makeText(getBaseContext(), "Нажмите еще раз что-бы выйти!", Toast.LENGTH_SHORT).show();
        }
        back_pressed = System.currentTimeMillis();
    }

}
