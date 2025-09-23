package iterator;

import java.util.Iterator;
import java.util.Random;

public class ShuffleIterator implements Iterator<Song> {
  private Song[] songs;
  private Random random;

  public ShuffleIterator(Song[] songs) {
    this.songs = songs;
    this.random = new Random();
  }

  @Override
  public boolean hasNext() {
    for (Song song : songs) {
      if (song != null) {
        return true;
      }
    }

    return false;
  }

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
