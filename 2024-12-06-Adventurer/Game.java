import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    Adventurer player = new Warrior("Johnny");
    Adventurer enemy = new CodeWarrior("John");

    Scanner userInput = new Scanner(System.in);

    System.out.println("You are a warrior battling against a CodeWarrior");

    while (player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println("Here are your (player) stats:");
      printStats(player);
      System.out.println("Here are the enemy's stats");
      printStats(enemy);

      System.out.println("It's your move.");
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String action = userInput.nextLine();

      if (action.equals("a") || action.equals("attack")){
        System.out.println(player.attack(enemy));
      }

      else if (action.equals("sp") || action.equals("special")){
        System.out.println(player.specialAttack(enemy));
      }

      else if (action.equals("su") || action.equals("support")){
        System.out.println(player.support());
      }

      else if (action.equals("quit")){
        break;
      }
      
      else {
        System.out.println("Invalid response.");
        continue;
      }

      System.out.println("It's the enemy's turn to move.");
      int enemyAction = (int) (Math.random() * 3);
      if (enemyAction == 0){
        System.out.println(enemy.attack(player));
      }
      else if (enemyAction == 1){
        System.out.println(enemy.specialAttack(player));
      }
      else System.out.println(enemy.support());
    }
    
    if (player.getHP() <= 0){
      System.out.println("You have lost the battle against CodeWarrior" + enemy + ".");
    }

    else {
      System.out.println("Congratulations! You have won against the CodeWarrior.");
      System.out.println("Here are your ending stats: ");
      printStats(player);
    }
  }

  public static void printStats(Adventurer a){
    String printMe = "";
    printMe += a.getName() + ", " + a.getHP() + "/" + a.getmaxHP() + " HP, "
    + a.getSpecial() + "/" + a.getSpecialMax() + " " + a.getSpecialName();
    System.out.println(printMe);
  }
}
