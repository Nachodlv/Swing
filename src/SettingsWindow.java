
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * A window model where the options setting are, such as sound, music and graphics.
 */
public class SettingsWindow extends JFrame {

    /**
     * it creates theSettingsWindow
     * <p>
     *     It creates a window with a borderLayout, where in the page start it is added a label
     *     with the name "Settings". In the center it start inserting a panel with a boxLayour in which
     *     it is assembled a panel with a grid layout. In the grid it is added the label sound and music
     *     with his respective Jradio buttons. Then, in the boxLayour it is inserted the Graphics label,
     *     and with another boxLayout with X.layout it is assembled the shadow and anti-aliasing button.
     *     At the page end of the border layout there it is the back button.
     * </p>
     * @param backListener for the back button. It returns to the Main Window
     * @param soundListenerTrue for the on button of the sound.
     * @param soundListenerFalse for the off button the sound.
     * @param musicListenerTrue for the on button of the music.
     * @param musicListenerFalse for the off button of the music.
     * @param shadowListener for the Shadow button
     * @param aListener for the anti-aliasing button
     */
    public SettingsWindow(ActionListener backListener, ActionListener soundListenerTrue,ActionListener soundListenerFalse,ActionListener musicListenerTrue, ActionListener musicListenerFalse, ActionListener shadowListener, ActionListener aListener){

        super("Settings");
        setMinimumSize(new Dimension(225,0));
        setResizable(false);


        BorderLayout borderLayout = new BorderLayout();
        JPanel panelPageStart = new JPanel();
        JLabel settings = new JLabel("Settings");

        panelPageStart.add(settings);
        settings.setAlignmentX(CENTER_ALIGNMENT);
        getContentPane().add(panelPageStart,borderLayout.PAGE_START);

        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));


        JPanel panelCenter1 = new JPanel();
        panelCenter1.setLayout(new GridLayout(2, 3));
        panelCenter.add(panelCenter1);

        JLabel sound = new JLabel("Sound:");
        JLabel music = new JLabel("Music:");
        JRadioButton on1 = new JRadioButton("ON", true);
        on1.addActionListener(soundListenerTrue);
        JRadioButton off1 = new JRadioButton("OFF");
        off1.addActionListener(soundListenerFalse);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(on1);
        buttonGroup1.add(off1);

        JRadioButton on2 = new JRadioButton("ON", true);
        on2.addActionListener(musicListenerTrue);
        JRadioButton off2 = new JRadioButton("OFF");
        off2.addActionListener(musicListenerFalse);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(on2);
        buttonGroup2.add(off2);

        panelCenter1.add(sound);
        panelCenter1.add(on1);
        panelCenter1.add(off1);
        panelCenter1.add(music);
        panelCenter1.add(on2);
        panelCenter1.add(off2);

        getContentPane().add(panelCenter,borderLayout.CENTER);



        JLabel graphics = new JLabel("Graphics:");
        JPanel panelCenter2 = new JPanel();
        panelCenter2.setAlignmentX(RIGHT_ALIGNMENT);
        panelCenter2.add(graphics);


        panelCenter.add(panelCenter2);


        JPanel panelCenter3 = new JPanel();
        panelCenter3.setLayout(new BoxLayout(panelCenter3, BoxLayout.X_AXIS));
        JCheckBox shadows = new JCheckBox("Shadows");
        shadows.addActionListener(shadowListener);
        JCheckBox antialiaising = new JCheckBox("Anti-aliasing");
        antialiaising.addActionListener(aListener);
        panelCenter3.add(shadows);
        panelCenter3.add(antialiaising);
        panelCenter.add(panelCenter3);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(backListener);
        backButton.setAlignmentX(CENTER_ALIGNMENT);
        getContentPane().add(backButton,borderLayout.PAGE_END);




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
