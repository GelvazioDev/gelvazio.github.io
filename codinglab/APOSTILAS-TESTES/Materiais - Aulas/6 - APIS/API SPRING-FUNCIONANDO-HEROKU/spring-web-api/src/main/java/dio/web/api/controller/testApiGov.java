package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.net.HttpURLConnection;

import java.net.URL;

public class testApiGov {

    //public void testApi(){

    //}

    @GetMapping ("/api")
    public void testApi(String[] args) throws IOException {

        URL url = new URL("http://api.portaldatransparencia.gov.br/api-de-dados/orgaos-siafi?pagina=1");


        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        connection.setRequestProperty("Accept", "application/json");

        connection.setRequestProperty("chave-api-dados", "1d5r8yt963h2v4g5h6j3k138sbfiec21");


        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String output;

        while ((output = buffer.readLine()) != null) {

            System.out.println(output);

        }

        connection.disconnect();

    }
}
