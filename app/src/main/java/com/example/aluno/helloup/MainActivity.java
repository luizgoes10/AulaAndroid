package com.example.aluno.helloup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends BaseActivity {
    private TextView tLogin;
    private TextView tSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        /** inicializando **/
        Button btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(onClickLogin());

        tLogin = findViewById(R.id.tLogin);
        tSenha = findViewById(R.id.tSenha);
    }

    private View.OnClickListener onClickLogin() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if(login.trim().isEmpty()) {
                    alert(R.string.msg_informe_login);
                    return;
                }

                if("ricardo".equals(login) && "abc123".equals(senha)) {
                    //alert(R.string.msg_login_ok);

                    String nome = "Ricardo Lecheta";
                    Intent intent =
                            new Intent(getContext(),
                                    HomeActivity.class);
                    intent.putExtra("nome",nome);
                    startActivity(intent);
                } else {
                    alert(R.string.msg_login_error);
                }


            }
        };
    }
}
