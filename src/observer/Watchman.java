package observer;

public class Watchman extends Subject {
  @Override
  public void notifyObservers(int note) {
    for (Observer observer : observers) {
      observer.update(true, note);
    }
  }

  @Override
  public void issueNotice(int note) {
    playTrumpets("Horns are sounding!!!", true, note);
  }
}
