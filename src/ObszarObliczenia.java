import javax.swing.*;
import java.awt.*;

public class ObszarObliczenia extends JPanel {
    private JLabel infoLabel;
    private JLabel chooseLabel;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    public ObszarObliczenia() {
        setBackground(new Color(120,120,120));
        setPreferredSize(new Dimension(170, 600));
        setLayout(null);

        infoLabel = new JLabel("Wybór elementu:");
        infoLabel.setBounds(25,0,120,30);
        add(infoLabel);

        radioButton1 = new JRadioButton("Element 1");
        radioButton1.setBounds(10, 40, 120, 30);
        add(radioButton1);

        radioButton2 = new JRadioButton("Element 2");
        radioButton2.setBounds(10, 70, 120, 30);
        add(radioButton2);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        infoLabel = new JLabel("Wyniki:");
        infoLabel.setBounds(35,120,120,30);
        add(infoLabel);


    }
}
