package dev.ifrspoa;

public class VolumeUtil {

    private AudioManager audioManager;
    
    public Object setVolume;

    public void maximizeVolume(int max) {

        audioManager.setVolume(max);
    }
}

