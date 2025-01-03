import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Taxicab {
  public static void main(String[] args){
    System.out.println(directionCount("input.txt"));
  }

  public static int directionCount(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      String[] inp = input.nextLine().split(", ");

      int x = 0;
      int y = 0;

      int facing = 1;

      for (int i = 0; i < inp.length; i++){
        // dealing w direction
        if (inp[i].substring(0,1).equals("R")){
          facing = (facing + 1) % 4;
        }
        else facing = (facing + 3) % 4;
        // finding direction
        int magnitude = Integer.parseInt(inp[i].substring(1));

        if (facing == 0){
          y += magnitude;
        }
        else if (facing == 1){
          x += magnitude;
        }
        else if (facing == 2){
          y -= magnitude;
        }
        else if (facing == 3){
          x -= magnitude;
        }
      }

      input.close();
      return Math.abs(x + y);

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
      return -1;
  }
}
}
