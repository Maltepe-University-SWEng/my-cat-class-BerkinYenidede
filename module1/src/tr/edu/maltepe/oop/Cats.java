package tr.edu.maltepe.oop;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public  class Cats {
    private String name;
    private int age;

    public Cats(String name, int age) {

        this.name = name;
        this.age = age;

    }
    public static void playMeowSound() {
        try {
            File soundFile = new File("/Users/berkin/Downloads/Cat meow sound effect.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();


            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }

    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    } }

