package singleton;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to read song data.
 *
 * @author Samuel Wu
 */
public class DataLoader {
  public static final String SONGS_FOLDER = "bin/singleton/songs/";
  public static final String SONG_LIST = "bin/singleton/txt/songs.txt";
  public static final int NUM_OF_ENTRIES = 3;

  /**
   * Gets a list of songs from a text file in text/songs.txt.
   *
   * @return A list of songs.
   */
  public static ArrayList<Song> getSongs() {
    ArrayList<Song> songs = new ArrayList<>();

    try {
      File songListFile = new File(SONG_LIST);
      Scanner fileScanner = new Scanner(songListFile);

      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        String[] entries = line.split(", ");

        if (entries.length != NUM_OF_ENTRIES) {
          continue;
        }

        songs.add(new Song(entries[0], entries[1], SONGS_FOLDER + entries[2]));
      }

      fileScanner.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return songs;
  }
}
