package iterator;

/**
 * A Song by an artist
 */
public class Song {
  private String name;
  private String artist;
  private double length;
  private Genre genre;

  public Song(String name, String artist, double length, Genre genre) {
    this.name = name;
    this.artist = artist;
    this.length = length;
    this.genre = genre;
  }

  @Override
  public String toString() {
    return name + " by " + artist + ", Genre: " + genre + ", Duration: " + length + "mins";
  }
}
