package state;

public class OrderedState extends State {
  private int days;

  public OrderedState(Package pkg) {
    super(pkg);
  }

  @Override
  public String getETA() {
    // TODO stub
    return null;
  }

  @Override
  public String getStatus() {
    // TODO stub
    return null;
  }
}
