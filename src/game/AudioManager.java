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

    File river;
    Clip riverClip;

    File forestSound;
    Clip forestSoundClip;

    File battleMusic;
    Clip battleMusicClip;

    File rustling;
    Clip rustlingClip;

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

        heavyAttack1 = new File("src/game/sound/heavy attack 1.wav");
        AudioInputStream heavyAttack1Stream = AudioSystem.getAudioInputStream(heavyAttack1);
        heavyAttack1Clip = AudioSystem.getClip();
        heavyAttack1Clip.open(heavyAttack1Stream);

        heavyAttack2 = new File("src/game/sound/heavy attack 2.wav");
        AudioInputStream heavyAttack2Stream = AudioSystem.getAudioInputStream(heavyAttack2);
        heavyAttack2Clip = AudioSystem.getClip();
        heavyAttack2Clip.open(heavyAttack2Stream);

        heavyAttack3 = new File("src/game/sound/heavy attack 3.wav");
        AudioInputStream heavyAttack3Stream = AudioSystem.getAudioInputStream(heavyAttack3);
        heavyAttack3Clip = AudioSystem.getClip();
        heavyAttack3Clip.open(heavyAttack3Stream);

        heavyAttackClipList.add(heavyAttack1Clip);
        heavyAttackClipList.add(heavyAttack2Clip);
        heavyAttackClipList.add(heavyAttack3Clip);

        battleMusic = new File("src/game/sound/fade to black.wav");
        AudioInputStream battleMusicStream = AudioSystem.getAudioInputStream(battleMusic);
        battleMusicClip = AudioSystem.getClip();
        battleMusicClip.open(battleMusicStream);

        forestSound = new File("src/game/sound/forest sound.wav");
        AudioInputStream forestSoundStream = AudioSystem.getAudioInputStream(forestSound);
        forestSoundClip = AudioSystem.getClip();
        forestSoundClip.open(forestSoundStream);

        river = new File("src/game/sound/river sound.wav");
        AudioInputStream riverStream = AudioSystem.getAudioInputStream(river);
        riverClip = AudioSystem.getClip();
        riverClip.open(riverStream);

        rustling = new File("src/game/sound/rustling sound.wav");
        AudioInputStream rustlingStream = AudioSystem.getAudioInputStream(rustling);
        rustlingClip = AudioSystem.getClip();
        rustlingClip.open(rustlingStream);
    }

    public void playWendigoRoar(){
        FloatControl gainControl = (FloatControl) wendigoRoarClip.getControl(FloatControl.Type.MASTER_GAIN);
        double gain = 1.0;
        float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
        gainControl.setValue(dB);
        wendigoRoarClip.setMicrosecondPosition(0);
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
            Thread.sleep(400);
            lightAttackClipList.get(i).start();
        }
    }
    public void playHeavyAttack() throws InterruptedException {
        for(int i =0; i < heavyAttackClipList.size(); i++){
            heavyAttackClipList.get(i).setMicrosecondPosition(0);
            Thread.sleep(600);
            heavyAttackClipList.get(i).start();
        }
    }
    public void playBattleMusic(){
        battleMusicClip.setMicrosecondPosition(0);
        battleMusicClip.start();
    }
    public void playforestSound(){
        FloatControl gainControl = (FloatControl) forestSoundClip.getControl(FloatControl.Type.MASTER_GAIN);
        double gain = 0.4;
        float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
        gainControl.setValue(dB);
        forestSoundClip.setMicrosecondPosition(0);
        forestSoundClip.start();
    }
    public void playRiver(){
        FloatControl gainControl = (FloatControl) riverClip.getControl(FloatControl.Type.MASTER_GAIN);
        double gain = 0.01;
        float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
        gainControl.setValue(dB);
        riverClip.setMicrosecondPosition(0);
        riverClip.loop(2);
    }
    public void playRustling(){
        rustlingClip.setMicrosecondPosition(0);
        rustlingClip.start();
    }




}
