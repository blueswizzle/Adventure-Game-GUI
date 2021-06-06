package game;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AudioManager {
    File wendigoRoar;
    Clip wendigoRoarClip;

    File fireballCharge;
    Clip fireballChargeClip;
    File fireballShoot;
    Clip fireballShootClip;
    File fireballImpact;
    Clip fireballImpactClip;

    File lightAttack1;
    Clip lightAttack1Clip;
    File lightAttack2;
    Clip lightAttack2Clip;
    File lightAttack3;
    Clip lightAttack3Clip;
    File lightAttack4;
    Clip lightAttack4Clip;
    ArrayList<Clip> lightAttackClipList = new ArrayList<>();

    File heavyAttack1;
    Clip heavyAttack1Clip;
    File heavyAttack2;
    Clip heavyAttack2Clip;
    File heavyAttack3;
    Clip heavyAttack3Clip;
    ArrayList<Clip> heavyAttackClipList = new ArrayList<>();

    public AudioManager() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        addAllAudio();
    }

    public void addAllAudio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        wendigoRoar = new File("src/game/sound/wendigoroar.wav");
        AudioInputStream hollowRoarStream = AudioSystem.getAudioInputStream(wendigoRoar);
        wendigoRoarClip = AudioSystem.getClip();
        wendigoRoarClip.open(hollowRoarStream);

        fireballCharge = new File("src/game/sound/firebolt charge.wav");
        AudioInputStream fireballChargeStream = AudioSystem.getAudioInputStream(fireballCharge);
        fireballChargeClip = AudioSystem.getClip();
        fireballChargeClip.open(fireballChargeStream);

        fireballShoot = new File("src/game/sound/firebolt fire.wav");
        AudioInputStream fireballShootStream = AudioSystem.getAudioInputStream(fireballShoot);
        fireballShootClip = AudioSystem.getClip();
        fireballShootClip.open(fireballShootStream);

        fireballImpact = new File("src/game/sound/firebolt impact.wav");
        AudioInputStream fireballImpactStream = AudioSystem.getAudioInputStream(fireballImpact);
        fireballImpactClip = AudioSystem.getClip();
        fireballImpactClip.open(fireballImpactStream);

        lightAttack1 = new File("src/game/sound/light attack 1.wav");
        AudioInputStream lightAttack1Stream = AudioSystem.getAudioInputStream(lightAttack1);
        lightAttack1Clip = AudioSystem.getClip();
        lightAttack1Clip.open(lightAttack1Stream);

        lightAttack2 = new File("src/game/sound/light attack 2.wav");
        AudioInputStream lightAttack2Stream = AudioSystem.getAudioInputStream(lightAttack2);
        lightAttack2Clip = AudioSystem.getClip();
        lightAttack2Clip.open(lightAttack2Stream);

        lightAttack3 = new File("src/game/sound/light attack 3.wav");
        AudioInputStream lightAttack3Stream = AudioSystem.getAudioInputStream(lightAttack3);
        lightAttack3Clip = AudioSystem.getClip();
        lightAttack3Clip.open(lightAttack3Stream);

        lightAttack4 = new File("src/game/sound/light attack 4.wav");
        AudioInputStream lightAttack4Stream = AudioSystem.getAudioInputStream(lightAttack4);
        lightAttack4Clip = AudioSystem.getClip();
        lightAttack4Clip.open(lightAttack4Stream);
        lightAttackClipList.add(lightAttack1Clip);
        lightAttackClipList.add(lightAttack2Clip);
        lightAttackClipList.add(lightAttack3Clip);
        lightAttackClipList.add(lightAttack4Clip);


    }

    public void playWendigoRoar(){
        FloatControl gainControl = (FloatControl) wendigoRoarClip.getControl(FloatControl.Type.MASTER_GAIN);
        double gain = 0.1;
        float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
        gainControl.setValue(dB);
        wendigoRoarClip.start();
    }

    public void playFireball() throws InterruptedException {
        fireballChargeClip.setMicrosecondPosition(0);
        fireballShootClip.setMicrosecondPosition(0);
        fireballImpactClip.setMicrosecondPosition(0);

        fireballChargeClip.start();
        Thread.sleep(1000);
        fireballShootClip.start();
        Thread.sleep(800);
        fireballImpactClip.start();
    }
    public void playLightAttack() throws InterruptedException {
        for(int i =0; i < lightAttackClipList.size(); i++){
            lightAttackClipList.get(i).setMicrosecondPosition(0);
            Thread.sleep(200);
            lightAttackClipList.get(i).start();
        }
    }



}
