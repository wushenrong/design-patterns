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
    if (quantity > 1) {
      if (name.endsWith("s")) {
        return name + "es";
      }

      return name + "s";
    }

    return name;
  }

  public String getVerb(String singular, String plural) {
    if (quantity > 1) {
      return plural;
    }

    return singular;
  }
}
