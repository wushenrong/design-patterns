package singleton;

/**
 * A Song class that can be played in a JukeBox.
 *
 * @author Samuel Wu
 */
public class Song {
  private String title;
  private String artist;
  private String filePath;

  /**
   * Creates a new Song.
   *
   * @param title The title of the song.
   * @param artist The artist of the song.
   * @param filePath The path to the song.
   */
  public Song(String title, String artist, String filePath) {
    this.title = title;
    this.artist = artist;
    this.filePath = filePath;
  }

  /** Play the song. */
  public void play() {
    SongPlayer.play(filePath);
  }

  /** Returns the string representation of the song. */
  @Override
  public String toString() {
    return title + " by " + artist;
  }
}
