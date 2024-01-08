package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObszarObliczenia extends JPanel {
    private ObszarRysowania obszarRysowania;
    private JLabel infoLabel;
    private JLabel chooseLabel;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private int typElementu;
    public ObszarObliczenia(ObszarRysowania obszarRysowania) {
        setBackground(new Color(120,120,120));
        setPreferredSize(new Dimension(170, 600));
        setLayout(null);
        typElementu = 0;
        this.obszarRysowania = obszarRysowania;

        chooseLabel = new JLabel("Wybór elementu:");
        chooseLabel.setBounds(25,0,120,30);
        add(chooseLabel);

        radioButton1 = new JRadioButton("Element 1");
        radioButton1.setBounds(10, 40, 120, 30);
        add(radioButton1);
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("element1");
                typElementu = 1;
                obszarRysowania.setTypElementu(typElementu);
            }
        });

        radioButton2 = new JRadioButton("Element 2");
        radioButton2.setBounds(10, 70, 120, 30);
        add(radioButton2);
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("element2");
                typElementu = 2;
                obszarRysowania.setTypElementu(typElementu);
            }
        });

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        infoLabel = new JLabel("Wyniki:");
        infoLabel.setBounds(35,120,120,30);
        add(infoLabel);


    }
}
