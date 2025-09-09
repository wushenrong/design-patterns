package state;

public class InTransitState extends State {
  private int days;

  public InTransitState(Package pkg) {
    super(pkg);
    this.days = 2;
  }

  @Override
  public String getETA() {
    // TODO stub
    return null;
  }

  @Override
  public String getStatus() {
    return "The " + pkg.getName() + " " + pkg.getVerb("is", "are") + " out for delivery.";
  }
}
