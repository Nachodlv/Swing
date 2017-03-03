
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by GonzaOK on 2/3/17.
 */
public class Controller {

    MainWindow mainWindow;
    SettingsWindow settingsWindow;
    StartGameWindow startGameWindow;
    Settings settings = new Settings();

    public Controller(){
        mainWindow = new MainWindow(startGameListener, exitListener, settingListener);
        startGameWindow = new StartGameWindow(backListener);
        settingsWindow = new SettingsWindow(backListener, soundListener, musicListener, shadowListener, antiAliasingListener);
        mainWindow.showSelf();
    }

    ActionListener startGameListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainWindow.hideSelf();
            startGameWindow.showSelf();
        }
    };

    ActionListener backListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            startGameWindow.hideSelf();
            settingsWindow.hideSelf();
            mainWindow.showSelf();
        }
    };

    ActionListener settingListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainWindow.hideSelf();
            settingsWindow.showSelf();
        }
    };

    ActionListener exitListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainWindow.hideSelf();
            System.exit(0);
        }
    };

    ActionListener soundListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeSound();
        }
    };

    ActionListener musicListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeMusic();
        }
    };

    ActionListener shadowListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeShadows();
        }
    };

    ActionListener antiAliasingListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.changeAntialiasing();
        }
    };
}
