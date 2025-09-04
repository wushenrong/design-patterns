package observer;

/**
 * A medieval Watchman that issues warnings to observers.
 *
 * @author Samuel Wu
 */
public class Watchman extends Subject {
  @Override
  public void notifyObservers(int note) {
    for (Observer observer : observers) {
      observer.update(true, note);
    }
  }

  /** Issues a warning to its observers and plays the horns. */
  @Override
  public void issueNotice(int note) {
    playTrumpets("Horns are sounding!!!", true, note);
  }
}
