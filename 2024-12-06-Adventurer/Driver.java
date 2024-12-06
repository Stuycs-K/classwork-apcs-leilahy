public class Driver {
  public void main(String[] args){
    Adventurer p1 = new Warrior("Johnny");
    Adventurer p2 = new Warrior("John");

    p1.attack(p2);
    p1.support(p2);
    p2.support();
    p2.specialAttack(p1);
  }
}
