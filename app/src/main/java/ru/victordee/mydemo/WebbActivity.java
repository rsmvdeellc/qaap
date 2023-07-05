package ru.victordee.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class WebbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webb);
        this.setTitle("Веб-приложения");  // замена имени тайтла на активити
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
// code start
        ListView listView = findViewById(R.id.webb_activity);

        List<String> list = new ArrayList<>();
        list.add("Сетевая модель");
        list.add("Клиент-серверная архитектура");
        list.add("HTTP");
        list.add("WebSocket");
        list.add("DNS");
        list.add("Кэш, куки");
        list.add("Идентификация, аутентификация, авторизация");
        list.add("Веб-формы");
        list.add("DevTools");
        list.add("Дополнительно");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

// code end
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}