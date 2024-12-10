import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    Adventurer player = new Warrior("Johnny");
    Adventurer enemy = new CodeWarrior("John");

    Scanner userInput = new Scanner(System.in);
    while (player.getHP() >= 0 && enemy.getHP() >=0){
      printStats(player);
      printStats(enemy);

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String action = userInput.nextLine();

      if (action.equals('a') || action.equals("attack")){
        player.attack(enemy);
      }
    }

  }

  public static void printStats(Adventurer a){
    String printMe = "";
    printMe += a.getName() + ", " + a.getHP() + "/" + a.getmaxHP() + " HP, "
    + a.getSpecial() + "/" + a.getSpecialMax() + " " + a.getSpecialName();
    System.out.println(printMe);
  }
}
