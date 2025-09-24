package iterator;

import java.util.Iterator;

/**
 * An Iterator that plays songs in the order they added.
 *
 * @author Samuel Wu
 */
public class InOrderIterator implements Iterator<Song> {
  private Song[] songs;
  private int position;

  /**
   * Creates a new InOrderIterator for songs.
   *
   * @param songs The list of songs to play in order.
   */
  public InOrderIterator(Song[] songs) {
    this.songs = songs;
    this.position = 0;
  }

  /**
   * Returns {@code true} if there are more songs to play.
   */
  @Override
  public boolean hasNext() {
    return position < songs.length && songs[position] != null;
  }

  /**
   * Returns the next Song in order if there are more songs to play, otherwise return {@code null}.
   */
  @Override
  public Song next() {
    if (!hasNext()) {
      return null;
    }

    Song song = songs[position];
    position++;
    return song;
  }
}
