
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * A window which has an image and a back button
 */
public class StartGameWindow extends JFrame {
    JLabel labelForImage;

    /**
     * It creates the StartGameWindow
     * <p>
     *     The frame has a borderLayour, in the pageStart there it is an image which is centered
     *     and in the pageEnd a back button
     * </p>
     * @param backListener is an ActionListener for the back button. It goes back to the MainWindow.
     */
    public StartGameWindow(ActionListener backListener){

        super("Start Game");
        setMinimumSize(new Dimension(230,0));
        setResizable(false);

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
        labelForImage.setAlignmentX(CENTER_ALIGNMENT);
        getContentPane().add(labelForImage,borderLayout.PAGE_START);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(false);
    }

    /**
     * Show the MainWindow
     */
    public void showSelf(){
        setVisible(true);
        labelForImage.setVisible(true);
    }

    /**
     * Hide the MainWindows
     */
    public void hideSelf(){
        setVisible(false);
    }

}
