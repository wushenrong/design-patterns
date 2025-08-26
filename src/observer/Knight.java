package observer;

public class Knight implements Observer {
  public Knight(Subject watchman, Subject Greeter) {
    watchman.registerObserver(this);
    Greeter.registerObserver(this);
  }

  @Override
  public void update(boolean warning, int note) {}
}
