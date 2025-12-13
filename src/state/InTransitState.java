package state;

/**
 * A State where a Package is currently being transported.
 *
 * @author Samuel Wu
 */
public class InTransitState extends State {
  private int days;

  /**
   * Creates a new State in which a Package is being transported.
   *
   * @param pkg The package to transport.
   */
  public InTransitState(Package pkg) {
    super(pkg);
    days = 5;
  }

  @Override
  public String getETA() {
    StringBuilder message = new StringBuilder();

    if (random.nextInt(10) < 3) {
      message.append("The ").append(pkg.getName()).append(" ").append(pkg.getVerb("has", "have"))
          .append(" experienced a delay in shipping.\n");
      days += random.nextInt(7) + 1;
    }

    message.append("The ").append(pkg.getName()).append(" should arrive within ").append(days)
        .append(" business days.");

    return message.toString();
  }

  @Override
  public String getStatus() {
    return "The " + pkg.getName() + " " + pkg.getVerb("is", "are") + " out for delivery.";
  }
}
