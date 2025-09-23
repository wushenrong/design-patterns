package iterator;

import java.util.Iterator;

public class InOrderIterator implements Iterator<Song> {
  private Song[] songs;
  private int position;

  public InOrderIterator(Song[] songs) {
    this.songs = songs;
    this.position = 0;
  }

  @Override
  public boolean hasNext() {
    return position < songs.length && songs[position] != null;
  }

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
