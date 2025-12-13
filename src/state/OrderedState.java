package state;

/**
 * A State where a Package has been ordered.
 *
 * @author Samuel Wu
 */
public class OrderedState extends State {
  private int days;

  /**
   * Creates a new State in which a Package has been ordered.
   *
   * @param pkg The package to order.
   */
  public OrderedState(Package pkg) {
    super(pkg);
    days = 2;
  }

  @Override
  public String getETA() {
    StringBuilder message = new StringBuilder();

    if (random.nextInt(10) < 2) {
      message.append("The ").append(pkg.getName()).append(" ").append(pkg.getVerb("has", "have"))
          .append(" experienced a slight delay in manufacturing.\n");
      days += random.nextInt(3) + 1;
    }

    message.append("The ").append(pkg.getName()).append(" will be shipped within ").append(days)
        .append(" business days.");

    return message.toString();
  }

  @Override
  public String getStatus() {
    return "The " + pkg.getName() + " " + pkg.getVerb("has", "have") + " been ordered.";
  }
}
