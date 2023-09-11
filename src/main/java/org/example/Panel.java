package org.example;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){
        this.setBounds(0,0,700,700);
        GetRequest getRequest = Unirest.get("https://v2.jokeapi.dev/joke/"+"Any"+"?format=txt");
        try {
            System.out.println(getRequest.asString().getBody());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    }

