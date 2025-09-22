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
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Song next() {
    // TODO Auto-generated method stub
    return null;
  }
}
