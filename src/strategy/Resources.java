package strategy;

import java.util.concurrent.TimeUnit;

public class Resources {
  /** Clears the console */
  public static void clear() {
    System.out.print("\033[H\033[2J");
  }

  /**
   * Pauses the program
   *
   * @param num The milliseconds to pause the program for
   */
  public static void sleep(int num) {
    try {
      TimeUnit.MILLISECONDS.sleep(num);
    } catch (Exception e) {
      System.out.println("Timer error");
    }
  }
}
