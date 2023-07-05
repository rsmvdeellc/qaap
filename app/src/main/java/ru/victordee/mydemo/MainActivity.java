package ru.victordee.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Цели и задачи тестирования");
        list.add("QA, QC, Testing");
        list.add("Принципы тестировния");
        list.add("Классификация тестирования");
        list.add("Верификация и валидация");
        list.add("Требования");
        list.add("Методологии разработки");
        list.add("SDLC, STLC");
        list.add("Техники тест-дизайна");
        list.add("Тестовая документация");
        list.add("Веб-приложения");
        list.add("API");
        list.add("Мобильные приложения");
        list.add("Базы данных");
        list.add("CI/CD");
        list.add("Дополнительно");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //clicked one

                    startActivity(new Intent(MainActivity.this, SecondActivity.class));

                }else if(position==1){
                    //clicked two

                    startActivity(new Intent(MainActivity.this, ThirdActivity.class));

                }else if(position==2){

                    startActivity(new Intent(MainActivity.this, FourthActivity.class));

                }else if(position==3){

                    startActivity(new Intent(MainActivity.this, FifthActivity.class));

                }else if(position==4){

                    startActivity(new Intent(MainActivity.this, VervalActivity.class));

                }else if(position==5){

                    startActivity(new Intent(MainActivity.this, RequarActivity.class));

                }else if(position==6){

                    startActivity(new Intent(MainActivity.this, MethodActivity.class));

                }else if(position==7){

                    startActivity(new Intent(MainActivity.this, SdlcActivity.class));

                }else if(position==8){

                    startActivity(new Intent(MainActivity.this, TechnActivity.class));

                }else if(position==9){

                    startActivity(new Intent(MainActivity.this, DocumActivity.class));

                }else if(position==10){

                    startActivity(new Intent(MainActivity.this, WebbActivity.class));

                }else if(position==11){

                    startActivity(new Intent(MainActivity.this, AppiActivity.class));

                }else if(position==12){

                    startActivity(new Intent(MainActivity.this, MobbActivity.class));

                }else if(position==13){

                    startActivity(new Intent(MainActivity.this, DabaseActivity.class));

                }else if(position==14){

                    startActivity(new Intent(MainActivity.this, CicdActivity.class));

                }else if(position==15){

                    startActivity(new Intent(MainActivity.this, DopolnActivity.class));

                }

            }
        });


    }
}