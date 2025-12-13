package singleton;

import java.util.ArrayList;

/**
 * A JukeBox that can play songs.
 *
 * @author Samuel Wu
 */
public class JukeBox {
  private static JukeBox jukeBox;

  /**
   * Gets the singular instance of the JukeBox. If there is no JukeBox, then create and return a new
   * JukeBox.
   *
   * @return A jukebox.
   */
  public static JukeBox getInstance() {
    if (jukeBox == null) {
      jukeBox = new JukeBox();
    }

    return jukeBox;
  }

  private ArrayList<Song> songs;

  /** Creates a new JukeBox. */
  private JukeBox() {
    songs = DataLoader.getSongs();
  }

  /**
   * Gets all the songs that is stored in a JukeBox.
   *
   * @return All the songs in the jukebox.
   */
  public ArrayList<Song> getAllSongs() {
    return songs;
  }

  /**
   * Plays a Song that is in the jukeBox.
   *
   * @param num The index of the song.
   */
  public void requestSong(int num) {
    Song song = songs.get(num);

    System.out.println("Playing " + song + ".");

    song.play();
  }
}
