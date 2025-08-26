package observer;

import java.util.ArrayList;

public abstract class Subject {
  protected ArrayList<Observer> observers;

  public Subject() {
    observers = new ArrayList<Observer>();
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public abstract void issueNotice(int note);

  public abstract void notifyObservers(int note);

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
