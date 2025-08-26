package observer;

public class Teacher implements Observer {
  public Teacher(Subject watchman, Subject Greeter) {
    watchman.registerObserver(this);
    Greeter.registerObserver(this);
  }

  @Override
  public void update(boolean warning, int note) {

  }
}
