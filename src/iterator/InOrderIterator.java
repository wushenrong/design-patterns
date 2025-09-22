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
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Song next() {
    // TODO Auto-generated method stub
    return null;
  }
}
