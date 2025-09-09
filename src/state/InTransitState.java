package state;

public class InTransitState extends State {
  private int days;

  public InTransitState(Package pkg) {
    super(pkg);
    this.days = 5;
  }

  @Override
  public String getETA() {
    String message = "";

    if (random.nextInt(10) < 3) {
      message +=
          "The "
              + pkg.getName()
              + " "
              + pkg.getVerb("has", "have")
              + " experienced a delay in shipping.\n";
      days += random.nextInt(7) + 1;
    }

    message += "The " + pkg.getName() + " should arrive within " + days + " business days.";

    return message;
  }

  @Override
  public String getStatus() {
    return "The " + pkg.getName() + " " + pkg.getVerb("is", "are") + " out for delivery.";
  }
}
