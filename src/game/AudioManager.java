package game;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioManager {
    File hollowRoar;
    Clip hollowRoarClip;

    public AudioManager() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        addAllAudio();
    }

    public void addAllAudio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        hollowRoar = new File("src/game/hollowroar.wav");
        AudioInputStream hollowRoarStream = AudioSystem.getAudioInputStream(hollowRoar);
        hollowRoarClip = AudioSystem.getClip();
        hollowRoarClip.open(hollowRoarStream);
    }

    public void playHollowRoar(){
        hollowRoarClip.start();
    }

}
