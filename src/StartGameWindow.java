package TPSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by GonzaOK on 2/3/17.
 */
public class StartGameWindow extends JFrame {

    public StartGameWindow(ActionListener backListener){

        super("Start Game");


        BorderLayout borderLayout = new BorderLayout();
        JPanel panelPageEnd = new JPanel();

        JButton back = new JButton("Back");
        back.addActionListener(backListener);
        back.setAlignmentX(CENTER_ALIGNMENT);

        panelPageEnd.add(back);

        getContentPane().add(panelPageEnd,borderLayout.PAGE_END);

        JPanel panelCenter = new JPanel();


        Imagen imagen = new Imagen();

        panelCenter.add(imagen);




        getContentPane().add(panelCenter,borderLayout.CENTER);

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
