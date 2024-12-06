public class Driver {
  public static void main(String[] args){
    Adventurer p1 = new Warrior("Johnny");
    Adventurer p2 = new Warrior("John");

    // test methods to get info
    System.out.println("Should return rage: " + p1.getSpecialName());
    System.out.println("Should return 5: " + p1.getSpecial());
    p1.setSpecial(10);
    System.out.println("Should return 10: " + p1.getSpecial());
    System.out.println("Should reutrn 10 " + p1.getSpecialMax());

    System.out.println(p1.attack(p2));
    System.out.println(p1.support(p2));
    System.out.println(p2.support());
    System.out.println(p2.specialAttack(p1));
  }
}
