package Elementy;

import java.awt.*;

public class Elementy implements Runnable {
    private int x,y,rozmiar;
    private Color kolor;
    private int typ;
    private int wynik;

    public Elementy (int x, int y, int rozmiar, Color kolor, int typ) {
        this.x = x;
        this.y = y;
        this.rozmiar = rozmiar;
        this.kolor = Color.BLACK;
        this.typ = typ;
        wynik =0;
    }

//    public void rysuj(Graphics g) {
//            g.setColor(kolor);
//            g.drawRect(x,y,rozmiar,rozmiar);
//    }


    @Override
    public void run() {
        for (int i = 0; i <= 100; i+=5) {
            wynik +=i;
        }
    }
}
