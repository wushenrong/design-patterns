package singleton;

public class Song {
  private String title;
  private String artist;
  private String filePath;

  /**
   * @param title
   * @param artist
   * @param filePath
   */
  public Song(String title, String artist, String filePath) {
    this.title = title;
    this.artist = artist;
    this.filePath = filePath;
  }

  @Override
  public String toString() {
    return title + " by " + artist;
  }

  public void play() {
    SongPlayer.play(filePath);
  }
}
