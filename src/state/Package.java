package state;

/**
 * A Package that a customer can purchase online.
 *
 * @author Samuel Wu
 */
public class Package {
  private String name;
  private int quantity;
  private State state;
  private State orderedState;
  private State inTransitState;
  private State deliveredState;

  /**
   * Creates a new Package with a name and quantity.
   *
   * @param name The name of the package.
   * @param quantity The number of items in the package.
   */
  public Package(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
    state = null;
    orderedState = new OrderedState(this);
    inTransitState = new InTransitState(this);
    deliveredState = new DeliveredState(this);
  }

  /**
   * Returns the name of the package. Becomes plural if there are more than 1 quantity of items in
   * the Package.
   *
   * @return The name of the package.
   */
  public String getName() {
    if (quantity > 1) {
      return name + "'s";
    }

    return name;
  }

  /**
   * Returns the correct verb based on if there are more than 1 quantity of items in the Package
   *
   * @param singular The verb in the singular case.
   * @param plural The verb in the plural case.
   * @return The verb in correct
   */
  public String getVerb(String singular, String plural) {
    if (quantity > 1) {
      return plural;
    }

    return singular;
  }

  /**
   * Mailing the Package.
   *
   * @return The status of the package being mailed.
   */
  public String mail() {
    return performAction(inTransitState);
  }

  /**
   * Ordering the Package.
   *
   * @return The status of the package being ordered.
   */
  public String order() {
    return performAction(orderedState);
  }

  /**
   * Delivering the Package.
   *
   * @return The status of the package being delivered.
   */
  public String received() {
    return performAction(deliveredState);
  }

  /**
   * Sets the state of the Package.
   *
   * @param state The current state of the package.
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * Performs an action and sets the state of the Package to the action.
   *
   * @param action The state of the action to perform.
   * @return The status of performing the action.
   */
  private String performAction(State action) {
    setState(action);
    return state.getStatus() + "\n" + state.getETA();
  }
}
