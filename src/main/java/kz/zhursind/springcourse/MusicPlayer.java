package kz.zhursind.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

  private List<Music> musicList = new ArrayList<>();

  private String name;
  private int volume;

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(final int volume) {
    this.volume = volume;
  }

  // IoC
//  public MusicPlayer(Music music) {
//    this.music = music;
//  }

  public MusicPlayer() {}

  public void setMusicList(final List<Music> musicList) {
    this.musicList = musicList;
  }

  public void playMusicList() {
    for (Music music : musicList) {
      System.out.println("Playing: " + music.getSong());
    }
  }
}
