package observer;

/**
 * A medieval Greeter that issues simple notices to observers.
 *
 * @author Samuel Wu
 */
public class Greeter extends Subject {
  @Override
  public void notifyObservers(int note) {
    for (Observer observer : observers) {
      observer.update(false, note);
    }
  }

  /** Issues a general notice to its observers and plays fanfare. */
  @Override
  public void issueNotice(int note) {
    playTrumpets("Greeting with fanfare.", false, note);
  }
}
