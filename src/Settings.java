
/**
 * Created by GonzaOK on 2/3/17.
 */
public class Settings {
    boolean sound = true;
    boolean music = true;
    boolean shadows = false;
    boolean antialiasing = false;

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

    public void changeSound(){
        sound = !sound;
        print();
    }

    public void changeMusic(){
        music = !music;
        print();
    }

    public void changeShadows(){
        shadows = !shadows;
        print();
    }

    public void changeAntialiasing(){
        antialiasing = !antialiasing;
        print();
    }


}
