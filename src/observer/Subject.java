package observer;

import java.util.ArrayList;

/**
 * A Subject that can issue notices to registered observers.
 *
 * @author Samuel Wu
 */
public abstract class Subject {
  protected ArrayList<Observer> observers;

  /** Creates a new Subject with a empty list of registered observers. */
  public Subject() {
    observers = new ArrayList<Observer>();
  }

  /**
   * Adds a Observer to the list of registered observers.
   *
   * @param observer The observer to add.
   */
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  /**
   * Remove a Observer to the list of registered observers.
   *
   * @param observer The observer to remove.
   */
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /**
   * Issues a notice and play trumpets.
   *
   * @param note The level of the notice.
   */
  public abstract void issueNotice(int note);

  /**
   * Notify all of its registered observers that a notice has been issued.
   *
   * @param note The level of the notice.
   */
  public abstract void notifyObservers(int note);

  /**
   * Helper method to print out the notice and trumpets to play horns or fanfare.
   *
   * @param message The message of the notice.
   * @param warning Is the notice a warning?
   * @param note The level of the notice.
   */
  protected void playTrumpets(String message, boolean warning, int note) {
    if (note == 1) {
      message += " Once";
    } else if (note == 2) {
      message += " Twice";
    }

    if (warning) {
      message += "!";
    } else {
      message += ".";
    }

    System.out.println(message);
    Trumpet.play(warning, note);
  }
}
