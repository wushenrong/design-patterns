package decorator;


public abstract class ScoopDecorator extends IceCream {
  protected IceCream iceCream;

  public ScoopDecorator(IceCream iceCream, int numScoops) {
    this.iceCream = iceCream;
    this.numScoops = numScoops;
  }
}
