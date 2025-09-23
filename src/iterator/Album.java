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

  public Iterator<Song> createInOrderIterator() {
    return new InOrderIterator(songs);
  }

  public Iterator<Song> createShuffleIterator() {
    return new ShuffleIterator(songs);
  }

  public String getName() {
    return name;
  }
}
