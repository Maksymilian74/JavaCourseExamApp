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
        this.kolor = kolor;
        this.typ = typ;
        wynik =0;
    }

    public void rysuj(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(kolor);
        g2d.fillRect(x, y, rozmiar, rozmiar);
    }


    @Override
    public void run() {
        for (int i = 0; i <= 100; i+=5) {
            wynik +=i;
        }
    }
}
