package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Timer;

import Elementy.Elementy;

public class ObslugaMouse implements MouseListener {

    private ObszarRysowania obszarRysowania;
    private ObszarObliczenia obszarObliczenia;
    private Timer timer;
    public ObslugaMouse(ObszarRysowania obszarRysowania, ObszarObliczenia obszarObliczenia) {
        this.obszarRysowania = obszarRysowania;
        this.obszarObliczenia = obszarObliczenia;
        this.timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sprawdzNajechanie();
            }
        });
        this.timer.setRepeats(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        obszarRysowania.setX(x);
        obszarRysowania.setY(y);
        obszarRysowania.addFig();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        timer.start();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        timer.stop();
    }

    private void sprawdzNajechanie() {
        int x = obszarRysowania.getMousePosition().x;
        int y = obszarRysowania.getMousePosition().y;

        for (int i = 0; i < obszarRysowania.elementyList.size(); i++) {
            Elementy element = obszarRysowania.getElement(i);
            if (element != null && element.zawieraPunkt(x, y)) {
                obszarObliczenia.updateInfoLabel(element.getWynik());
                break;
            }
        }
    }
}
