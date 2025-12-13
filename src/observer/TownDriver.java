package observer;

import java.util.Scanner;

public class TownDriver {
  private static final String YES = "y";
  private static final String NO = "n";

  public static void clear() {
    System.out.print("\033[H\033[2J");
  }

  public static void main(String[] args) {
    new TownDriver().run();
  }

  private Scanner reader;

  public TownDriver() {
    reader = new Scanner(System.in);
  }

  public int getNotice() {
    while (true) {
      System.out.println("Tell us what the Guards see:");
      System.out.println("1. A messenger is coming.");
      System.out.println("2. Royalty is approaching.");
      System.out.println("3. An army is approaching.");
      System.out.println("4. Our city has been breached");

      int number = Integer.parseInt(reader.nextLine());

      if (number < 1 || number > 4) {
        System.out.println("Not a valid choice.");
        continue;
      }

      return number;
    }
  }

  public void run() {
    clear();
    System.out.println("A Happy Little City");
    Watchman watchman = new Watchman();
    Greeter greeter = new Greeter();
    new ShopOwner(watchman, greeter);
    new Teacher(watchman, greeter);
    new Knight(watchman, greeter);

    while (true) {
      int notice = getNotice();
      clear();

      if (notice <= 2) {
        greeter.issueNotice(notice);
      } else {
        watchman.issueNotice(notice - 2);
      }

      if (!playAgain()) {
        break;
      }
    }

    System.out.println("Goodbye");
  }

  private boolean playAgain() {
    while (true) {
      System.out.print("\nDo you want to continue (Y)es or (N)o: ");
      String command = reader.nextLine().toLowerCase().trim();

      if (command.equals(YES)) {
        return true;
      }
      if (command.equals(NO)) {
        return false;
      }
      System.out.println("Sorry, that's not a valid command");
    }
  }
}
