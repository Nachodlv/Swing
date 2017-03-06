
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * It manages the models for the windows and controls the when they appear. It also
 * has the different listeners for the windows buttons.
 */
public class Controller {

    MainWindow mainWindow;
    SettingsWindow settingsWindow;
    StartGameWindow startGameWindow;
    Settings settings = new Settings();

    /**
     * Constructor for controller
     * <p>
     *     It creates a new instance of the mainWindow, startGameWindow and the settingsWindow. Also, it shows the mainWindow.
     * </p>
     */
    public Controller(){
        mainWindow = new MainWindow(startGameListener, exitListener, settingListener);
        startGameWindow = new StartGameWindow(backListener);
        settingsWindow = new SettingsWindow(backListener, soundListenerTrue, soundListenerFalse, musicListenerTrue, musicListenerFalse, shadowListener, antiAliasingListener);
        mainWindow.showSelf();
    }


    ActionListener startGameListener = new ActionListener() {
        @Override
        /**
         * ActionListener for the Start Game button in the main window
         * <p>
         *     It hides the mainWindow and shows the startGameWindow
         * </p>
         */
        public void actionPerformed(ActionEvent e) {
            mainWindow.hideSelf();
            startGameWindow.showSelf();
        }
    };

    /**
     * ActionListener for the back buttons
     * <p>
     *     It hides the startGameWindow and the settingsWindow and shows the mainWindow.
     *     It is used for the Back button in the StartGame window and the Settings window.
     * </p>
     */
    ActionListener backListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            startGameWindow.hideSelf();
            settingsWindow.hideSelf();
            mainWindow.showSelf();
        }
    };

    /**
     * ActionListener for the Settings button in the main window
     * <p>
     *     It hides the mainWindow and show the settingsWindow
     * </p>
     */
    ActionListener settingListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainWindow.hideSelf();
            settingsWindow.showSelf();
        }
    };

    /**
     * ActionListener for the exit button in the main window
     * <p>
     *     It hides the mainWindow and ends the program
     * </p>
     */
    ActionListener exitListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainWindow.hideSelf();
            System.exit(0);
        }
    };

    /**
     * ActionListener for the sound button in the settingWindow
     * <p>
     *     It change the value of the sound setting to true
     * </p>
     */
    ActionListener soundListenerTrue = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeSound(true);
        }
    };

    /**
     * ActionListener for the sound button in the settingWindow
     * <p>
     *     It changes the value of the sound setting to false
     * </p>
     */

    ActionListener soundListenerFalse = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeSound(false);
        }
    };


    /**
     * ActionListener for the music button in the settingWindow
     * <p>
     *     It changes the value of the music setting to true
     * </p>
     */
    ActionListener musicListenerTrue = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeMusic(true);
        }
    };

    /**
     * ActionListener for the music button in the settingWindow
     * <p>
     *     It changes the value of the music setting to false
     * </p>
     */
    ActionListener musicListenerFalse = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeMusic(false);
        }
    };

    /**
     * ActionListener for the shadow button in the settingWindow
     * <p>
     *     It changes the value of the shadow setting to its opposite
     * </p>
     */
    ActionListener shadowListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeShadows();
        }
    };

    /**
     * ActionListener for the anti-aliasing button in the settingWindow
     * <p>
     *     It changes the value of the anti-aliasing setting to its contrary
     * </p>
     */
    ActionListener antiAliasingListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeAntialiasing();
        }
    };
}
