package game;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioManager {
    File wendigoRoar;
    Clip wendigoRoarClip;
    public AudioManager() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        addAllAudio();
    }

    public void addAllAudio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        wendigoRoar = new File("src/game/wendigoroar.wav");
        AudioInputStream hollowRoarStream = AudioSystem.getAudioInputStream(wendigoRoar);
        wendigoRoarClip = AudioSystem.getClip();
        wendigoRoarClip.open(hollowRoarStream);
    }

    public void playWendigoRoar(){
        wendigoRoarClip.start();
    }

}
