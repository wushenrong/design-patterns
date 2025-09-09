package state;

public class Package {
  private String name;
  private int quantity;
  private State state;
  private State orderedState;
  private State inTransitState;
  private State deliveredState;

  public Package(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public String order() {
    // TODO stub
    return null;
  }

  public String mail() {
    // TODO stub
    return null;
  }

  public String received() {
    // TODO stub
    return null;
  }

  public void setState(State state) {}

  public String getName() {
    return name;
  }

  public String getVerb(String singular, String plural) {
    // TODO stub
    return null;
  }
}
