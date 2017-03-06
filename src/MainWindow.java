


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * The main window of the program. Contains the Start Game, Settings and Exit buttons.
 */
public class MainWindow extends JFrame{

    /**
     * Constructor for the MainWindow class.
     * <p>
     *     Adds the "Main Menu" title to the main window. The layout of the frame is a borderLayout. The title "Trabajo Practico
     *     Swing" is added within the PageStart with a subtitle containing the names of the member of the group.
     *     In the Center of the borderLayout there it is a panel with a boxLayout and inside of it there are three buttons,
     *     "Start Game, Settings and Exit" which are centered.
     *</p>
     *@param startGameListener Start Game: go to the Start Game window.
     *@param settingListener  go to the setting window.
     *@param exitListener Exit: close the program.
     */

    public MainWindow(ActionListener startGameListener, ActionListener exitListener, ActionListener settingListener) {

        super("Main Menu");
        setResizable(false);

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

    /**
     * Show the MainWindow
     */
    public void showSelf(){
        setVisible(true);
    }

    /**
     * Hide the MainWindows
     */
    public void hideSelf(){
        setVisible(false);
    }


}
