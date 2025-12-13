package strategy;

/**
 * A Troll character in a text-based game.
 *
 * @author Samuel Wu
 */
public class Troll extends Character {
  /**
   * Creates a new Troll character with a given name.
   *
   * @param name The name of the troll.
   */
  public Troll(String name) {
    super(name);
  }

  /**
   * Creates a string representation of the troll character.
   *
   * @return A string representation of the troll.
   */
  @Override
  public String toString() {
    return "^T^\nTroll: " + name;
  }
}
