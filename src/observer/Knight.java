package observer;

/**
 * A medieval Knight that is protecting the town.
 *
 * @author Samuel Wu
 */
public class Knight implements Observer {
  /**
   * Creates a Knight and register itself to get notices from a Watchman and Greeter.
   *
   * @param watchman The watchman to get warnings from.
   * @param greeter The greeter to get notices from.
   */
  public Knight(Subject watchman, Subject greeter) {
    watchman.registerObserver(this);
    greeter.registerObserver(this);
  }

  @Override
  public void update(boolean warning, int note) {
    System.out.print("Knight: ");

    if (warning) {
      if (note == 1) {
        System.out.println("Preparing for battle!");
      } else if (note == 2) {
        System.out.println("Evacuating the town!");
      }
    } else if (note == 1) {
      System.out.println("Guiding the messenger.");
    } else if (note == 2) {
      System.out.println("Protecting the Royal family.");
    }
  }
}
