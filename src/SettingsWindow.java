
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by GonzaOK on 2/3/17.
 */
public class SettingsWindow extends JFrame {

    public SettingsWindow(ActionListener backListener, ActionListener soundListener, ActionListener musicListener, ActionListener shadowListener, ActionListener aListener){

        super("Settings");

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
        on1.addActionListener(soundListener);
        JRadioButton off1 = new JRadioButton("OFF");
        off1.addActionListener(soundListener);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(on1);
        buttonGroup1.add(off1);

        JRadioButton on2 = new JRadioButton("ON", true);
        on2.addActionListener(musicListener);
        JRadioButton off2 = new JRadioButton("OFF");
        off2.addActionListener(musicListener);
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

    public void showSelf(){
        setVisible(true);
    }

    public void hideSelf(){
        setVisible(false);
    }
}
