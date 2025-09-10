package state;

/**
 * A State in which a Package has been delivered.
 *
 * @author Samuel Wu
 */
public class DeliveredState extends State {
  /**
   * Creates a new State in which a Package has been delivered.
   *
   * @param pkg The package that is already delivered.
   */
  public DeliveredState(Package pkg) {
    super(pkg);
  }

  @Override
  public String getETA() {
    return "The " + pkg.getName() + " " + pkg.getVerb("has", "have") + " arrived.";
  }

  @Override
  public String getStatus() {
    return "The " + pkg.getName() + " " + pkg.getVerb("is", "are") + " here.";
  }
}
