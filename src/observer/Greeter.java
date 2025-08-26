package observer;

public class Greeter extends Subject {
  @Override
  public void notifyObservers(int note) {
    for (Observer observer : observers) {
      observer.update(false, note);
    }
  }

  @Override
  public void issueNotice(int note) {
    playTrumpets("Greeting with fanfare.", false, note);
  }
}
