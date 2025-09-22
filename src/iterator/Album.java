package iterator;

import java.util.Iterator;

public class Album {
  private Song[] songs;
  private int count;
  private String name;

  public Album(String name) {
    this.name = name;
    this.count = 0;
    this.songs = null;
  }

  public boolean addSong(String name, String artist, double length, Genre genre) {
    return false;
  }

  public Iterator<Song> createInOrderIterator() {
    return null;
  }

  public Iterator<Song> createShuffleIterator() {
    return null;
  }

  public String getName() {
    return name;
  }
}
