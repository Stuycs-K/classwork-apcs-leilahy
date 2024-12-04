public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static int BLACK = 30;
  public static int RED = 31;

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) +  ";" + modifier + "m");
  }
  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }
  public static void sleep(int milli){
    try{
            Thread.sleep(milli);
    }catch(Exception e){
    }
}
  public static void main(String[] args){
    /*// changing modes test
    System.out.print("\u001b[31m");
    System.out.println("Hello World");
    System.out.print("\u001b[0m");
    System.out.println("reset");

    // red fish and other words
    System.out.print("\u001b[31mRed");
    /*
    System.out.print(" fish ");
    System.out.print("\u001b[34mBlue");
    System.out.print(" fish ");
    System.out.print(" also blue because no reset... also your terminal is blue now too...");
    */
    /*System.out.print("\u001b[31mRed");
    System.out.print(" \u001b[0mfish ");
    System.out.print("\u001b[34mBlue");
    System.out.print(" \u001b[0mfish ");//reset to defaults!
    /*  testing many colors
    for(int r = 0; r < 256; r+=32){
      for(int g = 0; g <= 256; g+=32){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
      System.out.println();
    }*/
    // starting my own unique pattern
    System.out.println(HIDE_CURSOR);
    for (int r = 0; r <= 255; r += 12) {
      for (int g = 0; g <= 255; g += 12) {
          for (int b = 0; b <= 255; b +=12) {
            System.out.print("\u001b[38;2;" + r + ";" + g + ";" + b + ";48;2;" + (255-r) + ";" + (255-g) + ";" + (255-b) + "m");  
            System.out.print("!!!");
            System.out.print("\u001b[0m"); 
          }
        System.out.println();
      }
      sleep(500);
      System.out.println(CLEAR_SCREEN);
  }
    System.out.println(SHOW_CURSOR);
    System.out.print("\u001b[0m");
    }

}
