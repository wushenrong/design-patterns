package iterator;

import java.util.Iterator;

/**
 * A Album class that stores a list of songs to play.
 *
 * @author Samuel Wu
 */
public class Album {
  private Song[] songs;
  private int count;
  private String name;

  /**
   * Creates a new Album.
   *
   * @param name The name of the album.
   */
  public Album(String name) {
    this.name = name;
    count = 0;
    songs = null;
  }

  /**
   * Adds a new Song to the Album.
   *
   * @param name The name of the song.
   * @param artist The artist of the song.
   * @param length The length of the song in minutes.
   * @param genre The genre of the song.
   */
  public void addSong(String name, String artist, double length, Genre genre) {
    if (songs == null) {
      songs = new Song[1];
    }

    if (count >= songs.length) {
      Song[] temp = songs;
      songs = new Song[songs.length * 2];

      for (int i = 0; i < temp.length; i++) {
        songs[i] = temp[i];
      }
    }

    songs[count] = new Song(name, artist, length, genre);
    count++;
  }

  /**
   * Returns the songs in the album in added order.
   */
  public Iterator<Song> createInOrderIterator() {
    return new InOrderIterator(songs);
  }

  /**
   * Returns the songs in the album in a shuffled order.
   */
  public Iterator<Song> createShuffleIterator() {
    return new ShuffleIterator(songs);
  }

  /**
   * Returns the name of the album.
   */
  public String getName() {
    return name;
  }
}
