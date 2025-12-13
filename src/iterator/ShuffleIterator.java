package iterator;

import java.util.Iterator;
import java.util.Random;

/**
 * An Iterator that plays songs in a random order.
 *
 * @author Samuel Wu
 */
public class ShuffleIterator implements Iterator<Song> {
  private Song[] songs;
  private Random random;

  /**
   * Creates a new ShuffleIterator for songs.
   *
   * @param songs The list of songs to play randomly.
   */
  public ShuffleIterator(Song[] songs) {
    this.songs = songs.clone();
    random = new Random();
  }

  /**
   * Returns {@code true} if there are more songs to play.
   */
  @Override
  public boolean hasNext() {
    for (Song song : songs) {
      if (song != null) {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns the next Song randomly if there are more songs to play, otherwise return {@code null}.
   */
  @Override
  public Song next() {
    if (!hasNext()) {
      return null;
    }

    int position = random.nextInt(songs.length);

    while (songs[position] == null) {
      position = random.nextInt(songs.length);
    }

    Song song = songs[position];

    songs[position] = null;

    return song;
  }
}
