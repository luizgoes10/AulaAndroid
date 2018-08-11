package com.example.aluno.helloup.domain;

import android.util.Log;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.example.aluno.helloup.utils.HttpHelpers;

public class LoginService {
    private static String url = "http://livrowebservices.com.br/rest/login";

    public static String login(String login, String senha) throws IOException {


        Map<String,String> params = new HashMap<>();
        params.put("login",login);
        params.put("senha",senha);
        String json = HttpHelpers.postForm(url,params);

        Log.d("up",json);

        return json;


    }
}
