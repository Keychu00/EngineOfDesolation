package main;

/**
 * This class handles the sound effects
 */

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class SoundEffect {

    Clip clip;
// TODO: Change the visibility of the `setFile()` method to `private` since it is used only within the class.

    void setFile(URL name){
// TODO: Handle specific exceptions (e.g., FileNotFoundException) and provide meaningful error messages.

        try{
            AudioInputStream sound = AudioSystem.getAudioInputStream(name);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    public void play(URL name){
        clip.setFramePosition(0);
        clip.start();
    }
}
