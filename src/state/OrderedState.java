package state;

public class OrderedState extends State {
  private int days;

  public OrderedState(Package pkg) {
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
    return "The " + pkg.getName() + " " + pkg.getVerb("has", "have") + " been ordered.";
  }
}
