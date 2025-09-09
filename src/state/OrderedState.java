package state;

public class OrderedState extends State {
  private int days;

  public OrderedState(Package pkg) {
    super(pkg);
    this.days = 2;
  }

  @Override
  public String getETA() {
    String message = "";

    if (random.nextInt(10) < 2) {
      message +=
          "The "
              + pkg.getName()
              + " "
              + pkg.getVerb("has", "have")
              + " experienced a slight delay in manufacturing.\n";
      days += random.nextInt(3) + 1;
    }

    message += "The " + pkg.getName() + " will be shipped within " + days + " business days.";

    return message;
  }

  @Override
  public String getStatus() {
    return "The " + pkg.getName() + " " + pkg.getVerb("has", "have") + " been ordered.";
  }
}
