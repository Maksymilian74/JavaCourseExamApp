package Gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import Elementy.Elementy;

public class ObszarRysowania extends JPanel {
    protected List<Elementy> elementyList;
    private int typElementu;
    private Elementy elementy;
    private int x,y;
    public ObszarRysowania() {
        setBackground(new Color(215,215,215));
        setPreferredSize(new Dimension(750, 600));
        requestFocusInWindow();
        typElementu =0;
        x = 0;
        y = 0;
        elementyList = new CopyOnWriteArrayList<>();
    }

    public void setTypElementu(int typElementu) {
        this.typElementu = typElementu;
    }

    public Elementy getElement(int index) {
        return elementyList.get(index);
    }

    void addFig() {
        if(typElementu==1) {
            elementy = new Elementy(x, y, 20, Color.RED,1);
            elementyList.add(elementy);
            new Thread(elementy).start();
        } else if (typElementu ==2) {
            elementy = new Elementy(x, y, 30, Color.GREEN,2);
            elementyList.add(elementy);
            new Thread(elementy).start();
        }
        repaint();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Elementy figura : elementyList) {
            figura.rysuj(g);
        }
    }
}
