package com.designpattern.www.iterator.adapterpattern;

/**
 * @ClassName MediaAdapter
 * @Author：Mayuan
 * @Date 2020/7/6 17:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * // 媒体播放的接口的适配器的值。
 **/
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.palyMp4(fileName);
        }
    }
}
