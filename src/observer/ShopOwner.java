package observer;

/**
 * A medieval ShopOwner that is selling produce.
 *
 * @author Samuel Wu
 */
public class ShopOwner implements Observer {
  /**
   * Creates a ShopOwner and register itself to get notices from a Watchman and Greeter.
   *
   * @param watchman The watchman to get warnings from.
   * @param greeter The greeter to get notices from.
   */
  public ShopOwner(Subject watchman, Subject greeter) {
    watchman.registerObserver(this);
    greeter.registerObserver(this);
  }

  @Override
  public void update(boolean warning, int note) {
    System.out.print("ShopOwner: ");

    if (warning) {
      if (note == 1) {
        System.out.println("Hiding all the produce!");
      } else if (note == 2) {
        System.out.println("Running away from the shop!");
      }
    } else if (note == 1) {
      System.out.println("Continue to sell produce.");
    } else if (note == 2) {
      System.out.println("Greeting the Royal family.");
    }
  }
}
