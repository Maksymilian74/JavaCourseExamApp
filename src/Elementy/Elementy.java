package Elementy;

import java.awt.*;

public class Elementy implements Runnable {
    private int x,y,rozmiar;
    private Color kolor;
    private int typ;
    private int wynik;
    private int czasObliczen;


    public Elementy (int x, int y, int rozmiar, Color kolor, int typ) {
        this.x = x;
        this.y = y;
        this.rozmiar = rozmiar;
        this.kolor = kolor;
        this.typ = typ;
        this.wynik = 0;
        if(typ == 1) {
            this.czasObliczen = 10;
        } else if (typ == 2) {
            this.czasObliczen = 20;
        }
    }

    public int getWynik() {
        return wynik;
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

            try {
                Thread.sleep(czasObliczen);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean zawieraPunkt(int px, int py) {
        return px >= x && px <= x + rozmiar && py >= y && py <= y + rozmiar;
    }
}
