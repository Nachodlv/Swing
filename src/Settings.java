
/**
 * Created by GonzaOK on 2/3/17.
 */

/**
 * The class is created as an auxiliary of the SettingsWindow, by stocking different variables.
 */
public class Settings {
    boolean sound = true;
    boolean music = true;
    boolean shadows = false;
    boolean antialiasing = false;

    /**
     * Print on screen the variables and their respective states
     */
    public void print(){
        if(sound) System.out.println("Sound on\n");
        else System.out.println("Sound off\n");

        if(music) System.out.println("Music on\n");
        else System.out.println("Music off\n");

        if(shadows) System.out.println("Shadows on\n");
        else System.out.println("Shadows off\n");

        if(antialiasing) System.out.println("Antialiasing on\n");
        else System.out.println("Antialiasing off\n");
    }

    /**
     * Changes the sound to the value
     * @param value A boolean which will represent the state of the sound
     */
    public void changeSound(boolean value){
        sound = value;
        print();
    }

    /**
     * Change the music to the value
     * @param value A boolean which will represent the state of the music
     */
    public void changeMusic(boolean value){
        music = value;
        print();
    }

    /**
     * Changes the shadow state to its opposite value
     */
    public void changeShadows(){
        shadows = !shadows;
        print();
    }

    /**
     * Changes the anti-aliasing state to its opposite value
     */
    public void changeAntialiasing(){
        antialiasing = !antialiasing;
        print();
    }


}
