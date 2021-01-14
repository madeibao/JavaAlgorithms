package com.designpattern.www.iterator.adapterpattern;

/**
 * @ClassName AudioPlayer
 * @Author：Mayuan
 * @Date 2020/7/6 17:36
 * @Description TODO
 * @Version 1.0
 **/
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("playing the mp3 file name" + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media  " + audioType + "  format  not suppported");
        }
    }
}
