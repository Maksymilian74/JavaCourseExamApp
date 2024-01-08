import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    private JPanel mainPanel;
    private ObszarRysowania obszarRysowania;
    private ObszarObliczenia obszarObliczenia;
    public App() {
        setTitle("Aplikacja");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int ww = 1000, wh = 600;
        setSize(ww, wh);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        setContentPane(mainPanel);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(120,120,120));

        obszarRysowania = new ObszarRysowania();
        mainPanel.add(obszarRysowania, BorderLayout.WEST);

        obszarObliczenia = new ObszarObliczenia();
        mainPanel.add(obszarObliczenia, BorderLayout.EAST);

        ObslugaMouse obslugaMouse = new ObslugaMouse(obszarRysowania);
        obszarRysowania.addMouseListener(obslugaMouse);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    App frame = new App();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}