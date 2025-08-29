package observer;

public class Knight implements Observer {
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
    } else {
      if (note == 1) {
        System.out.println("Guiding the messenger.");
      } else if (note == 2) {
        System.out.println("Protecting the Royal family.");
      }
    }
  }
}
