package ru.victordee.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CicdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cicd);
        this.setTitle("CI/CD");  // замена имени тайтла на активити
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}