package com.example.aluno.helloup;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.aluno.helloup.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Boom");
        actionBar.setDisplayHomeAsUpEnabled(true);

        String nome = getIntent().
                getStringExtra("nome");
        TextView t =
                findViewById(R.id.textView);

        t.setText("O nome é " + nome);
    }
}
