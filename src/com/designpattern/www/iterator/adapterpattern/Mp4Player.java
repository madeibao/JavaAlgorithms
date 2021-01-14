package com.designpattern.www.iterator.adapterpattern;

/**
 * @ClassName Mp4Player
 * @Author：Mayuan
 * @Date 2020/7/6 17:30
 * @Description TODO
 * @Version 1.0
 **/
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void palyMp4(String fileName) {
        System.out.println("Playing the mp4 file" + fileName);
    }

    @Override
    public void playVlc(String fileName) {
        // 什么也不用干。
    }
}
