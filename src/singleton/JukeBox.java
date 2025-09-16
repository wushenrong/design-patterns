package singleton;

import java.util.ArrayList;

public class JukeBox {
  private static JukeBox jukeBox;
  private ArrayList<Song> songs;

  private JukeBox() {
    this.songs = DataLoader.getSongs();
  }

  public static JukeBox getInstance() {
    if (jukeBox == null) {
      jukeBox = new JukeBox();
    }

    return jukeBox;
  }

  public ArrayList<Song> getAllSongs() {
    return songs;
  }

  public void requestSong(int num) {
    Song song = songs.get(num);

    System.out.println("Playing " + song + ".");

    song.play();
  }
}
