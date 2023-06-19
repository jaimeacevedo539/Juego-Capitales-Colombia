package com.example.demo;

public class juego {
    //constructor
    public juego(){}

    public int generarAleatorio(){
        int aleatorio = (int) (Math.random() * 30 + 1);
        return aleatorio;
    }
}

