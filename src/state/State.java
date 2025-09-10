package state;

import java.util.Random;

/**
 * The State of a Package that is purchased online.
 *
 * @author Samuel Wu
 */
public abstract class State {
  protected Package pkg;
  protected Random random;

  /**
   * Creates a new State for a Package.
   *
   * @param pkg The package to create a state for.
   */
  public State(Package pkg) {
    this.pkg = pkg;
    this.random = new Random();
  }

  /**
   * Gets the current status of a Package.
   *
   * @return The current status of the Package purchased online.
   */
  public abstract String getStatus();

  /**
   * Calculates the estimated time for a Package to complete its current status.
   *
   * @return The estimated time for the package to complete its current status.
   */
  public abstract String getETA();
}
