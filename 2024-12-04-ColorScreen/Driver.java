public class Driver {
  public static void main(String[] args){
    System.out.println(Text.CLEAR_SCREEN);
    // creating 80x30 border
    for(int i = 0; i < 80; i++){
      Text.color(Text.background(Text.BLUE));
      Text.go(1,i+1);
      System.out.println("!");
      Text.go(30,i+1);
      System.out.println("!");
    }
    for(int i = 0; i < 30; i++){
      Text.color(Text.background(Text.BLUE));
      Text.go(i+1,1);
      System.out.println("!");
      Text.go(i+1,80);
      System.out.println("!");
    }
    System.out.println(Text.RESET);
    // making array of 3 random ints 0-99
    int[] randThree = {(int) (Math.random() * 99),(int) (Math.random() * 99),(int) (Math.random() * 99)};
    int spacing = 80/4;
    for (int i = 1; i < 4; i++){
      Text.go(2,spacing * i);
      Text.color(Text.WHITE);
      int curr = randThree[i-1];
      if (curr < 25){
        Text.color(Text.RED, Text.BRIGHT);
      }
      else if (curr > 75){
        Text.color(Text.GREEN, Text.BRIGHT);
      }
      System.out.println(randThree[i - 1]);
    }
    // separating stuff
    Text.go(3, 2);
    Text.color(Text.BLUE);
    for(int i = 1; i < 79; i++){
      System.out.print("-");
    }
    // drawing smiley
    int eyeSpace = 80/3;
    Text.color(Text.WHITE);
    for (int i = 0; i < 3; i++){
      Text.go(10 + i,eyeSpace);
      System.out.println("|");
      Text.go(10 + i,eyeSpace * 2);
      System.out.println("|");
    }
    Text.go(18,spacing-2);
    System.out.println("|");
    Text.go(19,spacing-1);
    System.out.println("|");
    Text.go(20,spacing);
    for (int i = 0; i < spacing * 2; i++){
      System.out.print("_");
    }
    Text.go(18,3*spacing+2);
    System.out.println("|");
    Text.go(19,3*spacing+1);
    System.out.println("|");
    // mvoe cursor
    System.out.println(Text.RESET);
    Text.go(31,1);
  }
}
