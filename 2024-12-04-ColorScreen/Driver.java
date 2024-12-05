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
    
  }
}
