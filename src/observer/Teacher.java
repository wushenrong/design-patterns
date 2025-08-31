package observer;

/**
 * A medieval Teacher that is teaching a class.
 *
 * @author Samuel Wu
 */
public class Teacher implements Observer {
  /**
   * Creates a Teacher and register itself to get notices from a Watchman and Greeter.
   *
   * @param watchman The watchman to get warnings from.
   * @param greeter The greeter to get notices from.
   */
  public Teacher(Subject watchman, Subject greeter) {
    watchman.registerObserver(this);
    greeter.registerObserver(this);
  }

  @Override
  public void update(boolean warning, int note) {
    System.out.print("Teacher: ");

    if (warning) {
      if (note == 1) {
        System.out.println("Sheltering the students!");
      } else if (note == 2) {
        System.out.println("Evacuating all the children!");
      }
    } else {
      if (note == 1) {
        System.out.println("Keeping kids from being distracted.");
      } else if (note == 2) {
        System.out.println("Keeping children away from Royalty.");
      }
    }
  }
}
