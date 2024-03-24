package com.designpattern.www.iterator.adapterpattern;

/**
 * @ClassName VlcPlayer
 * @Author：Mayuan
 * @Date 2020/7/6 17:26
 * @Description TODO
 * @Version 1.0
 **/
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file" + fileName);
    }

    @Override
    public void palyMp4(String fileName) {
        // 什么也不做。
    }
}
