package singleton;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicDriver {
  public static void clear() {
    System.out.print("\033[H\033[2J");
  }

  public static void main(String[] args) {
    new MusicDriver().run();
  }

  private Scanner reader;
  private JukeBox jukeBox;

  public MusicDriver() {
    reader = new Scanner(System.in);
    jukeBox = JukeBox.getInstance();
  }

  public void displaySongList() {
    ArrayList<Song> songs = jukeBox.getAllSongs();

    System.out.println("\nSong List:");

    for (int i = 0; i < songs.size(); i++) {
      System.out.println(i + 1 + ". " + songs.get(i));
    }
  }

  public void requestSong() {
    while (true) {
      System.out.print("Enter Song Number to Play: ");
      int num = Integer.parseInt(reader.nextLine());

      if (num < 1 || num > JukeBox.getInstance().getAllSongs().size()) {
        System.out.println("Invalid number");
        continue;
      }

      clear();
      JukeBox.getInstance().requestSong(num - 1);
      return;
    }
  }

  public void run() {
    clear();
    System.out.println("***** Juke Box *****");

    displaySongList();

    requestSong();
  }
}
