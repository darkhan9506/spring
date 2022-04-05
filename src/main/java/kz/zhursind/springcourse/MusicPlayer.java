package kz.zhursind.springcourse;

public class MusicPlayer {

  private Music music;

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
  public MusicPlayer(Music music) {
    this.music = music;
  }

  public MusicPlayer() {}

  public void setMusic(final Music music) {
    this.music = music;
  }

  public void playMusic() {
    System.out.println("Playing: " + music.getSong());
  }
}
