package Gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ObslugaMouse implements MouseListener {

    private ObszarRysowania obszarRysowania;
    public ObslugaMouse(ObszarRysowania obszarRysowania) {
        this.obszarRysowania = obszarRysowania;

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Współrzędne kliknięcia: (" + x + ", " + y + ")");
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
