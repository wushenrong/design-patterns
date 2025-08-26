package observer;

public class ShopOwner implements Observer {
  /**
   * Creates a ShopOwner Observer and register itself to a watchman and greeter.
   * 
   * @param watchman
   * @param Greeter
   */
  public ShopOwner(Subject watchman, Subject Greeter) {
    watchman.registerObserver(this);
    Greeter.registerObserver(this);
  }

  @Override
  public void update(boolean warning, int note) {

  }
}
