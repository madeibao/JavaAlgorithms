package com.designpattern.www.iterator.adapterpattern;

/**
 * @ClassName Client
 * @Author：Mayuan
 * @Date 2020/7/6 17:41
 * @Description TODO
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "百花香.mp3");
        audioPlayer.play("vlc", "你好.vlc");
        audioPlayer.play("mp4", "泰坦尼克号.mp4");
        audioPlayer.play("avi", "not mented.avi");
    }
}
