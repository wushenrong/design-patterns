package observer;

public class Teacher implements Observer {
  public Teacher(Subject watchman, Subject greeter) {
    watchman.registerObserver(this);
    greeter.registerObserver(this);
  }

  @Override
  public void update(boolean warning, int note) {
    System.out.print("Teacher: ");
  }
}
