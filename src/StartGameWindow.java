
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by GonzaOK on 2/3/17.
 */
public class StartGameWindow extends JFrame {
    JLabel labelForImage;
    public StartGameWindow(ActionListener backListener){

        super("Start Game");


        BorderLayout borderLayout = new BorderLayout();
        JPanel panelPageEnd = new JPanel();

        JButton back = new JButton("Back");
        back.addActionListener(backListener);
        back.setAlignmentX(CENTER_ALIGNMENT);

        panelPageEnd.add(back);

        getContentPane().add(panelPageEnd,borderLayout.PAGE_END);

        ImageIcon imageIcon = new ImageIcon("src/Image/pacman.png");
        labelForImage = new JLabel();
        labelForImage.setIcon(imageIcon);

        getContentPane().add(labelForImage,borderLayout.PAGE_START);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void showSelf(){
        setVisible(true);
        labelForImage.setVisible(true);
    }

    public void hideSelf(){
        setVisible(false);
    }

}
