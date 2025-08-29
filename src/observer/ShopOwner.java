package observer;

public class ShopOwner implements Observer {
  /**
   * Creates a ShopOwner Observer and register itself to a watchman and greeter.
   *
   * @param watchman
   * @param greeter
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
    } else {
      if (note == 1) {
        System.out.println("Continue to sell produce.");
      } else if (note == 2) {
        System.out.println("Greeting the Royal family.");
      }
    }
  }
}
