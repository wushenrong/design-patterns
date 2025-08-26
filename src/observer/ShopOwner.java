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
  }
}
