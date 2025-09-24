package iterator;

/**
 * A Song to be added in an Album.
 *
 * @author Samuel Wu
 */
public class Song {
  private String name;
  private String artist;
  private double length;
  private Genre genre;

  /**
   * Creates a new Song.
   *
   * @param name The name of the song.
   * @param artist The artist of the song.
   * @param length The length of the song in minutes.
   * @param genre The genre of the song.
   */
  public Song(String name, String artist, double length, Genre genre) {
    this.name = name;
    this.artist = artist;
    this.length = length;
    this.genre = genre;
  }

  /**
   * Returns the string representation of the Song.
   */
  @Override
  public String toString() {
    return name + " by " + artist + ", Genre: " + genre + ", Duration: " + length + "mins";
  }
}
