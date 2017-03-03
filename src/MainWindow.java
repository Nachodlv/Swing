package TPSwing;

import org.apache.batik.util.gui.LanguageDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by GonzaOK on 2/3/17.
 */
public class MainWindow extends JFrame{

    public MainWindow(ActionListener startGameListener, ActionListener exitListener, ActionListener settingListener) {

        super("Main Menu");

        BorderLayout borderLayout = new BorderLayout();

        JButton startGame = new JButton("Start Game");
        startGame.addActionListener(startGameListener);
        JButton settings = new JButton("Settings");
        settings.addActionListener(settingListener);
        JButton exit = new JButton("Exit");
        exit.addActionListener(exitListener);

        JPanel panelPageStart = new JPanel();
        JPanel panelCenter = new JPanel();


        JLabel trabajoPracticoSwing = new JLabel("Trabajo Practico Swing");
        trabajoPracticoSwing.setFont(new Font("serif", Font.BOLD, 14));
        panelPageStart.add(trabajoPracticoSwing);

        JLabel names = new JLabel("Ignacio de la Vega y Gonzalo de Achaval");
        panelPageStart.add(names);


        panelCenter.setLayout(new BoxLayout(panelCenter,BoxLayout.Y_AXIS));
        panelPageStart.setLayout(new BoxLayout(panelPageStart, BoxLayout.Y_AXIS));


        panelCenter.add(startGame);
        panelCenter.add(settings);
        panelCenter.add(exit);


        settings.setAlignmentX(CENTER_ALIGNMENT);
        startGame.setAlignmentX(CENTER_ALIGNMENT);
        exit.setAlignmentX(CENTER_ALIGNMENT);
        names.setAlignmentX(CENTER_ALIGNMENT);
        trabajoPracticoSwing.setAlignmentX(CENTER_ALIGNMENT);


        getContentPane().add(panelPageStart,borderLayout.PAGE_START);
        getContentPane().add(panelCenter, borderLayout.CENTER);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void showSelf(){
        setVisible(true);
    }

    public void hideSelf(){
        setVisible(false);
    }


}
