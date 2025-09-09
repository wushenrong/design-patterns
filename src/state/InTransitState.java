package state;

public class InTransitState extends State {
  private int days;

  public InTransitState(Package pkg) {
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
