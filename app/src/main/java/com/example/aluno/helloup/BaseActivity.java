package com.example.aluno.helloup;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    protected Context getContext() {
        return this;
    }

    protected void alert(int s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(s);
        builder.setMessage(s);
        AlertDialog alerta = builder.create();
        alerta.show();
    }
}
