import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Taxicab {
  public static int directionCount(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      String[] inp = input.nextLine().split(", ");

      int x = 0;
      int y = 0;

      int facing = 0;

      for (int i = 0; i < inp.length; i++){
        if (inp[i].substring(0,1).equals("R")){
          facing = (facing + 1) % 4;
        }
        else facing = (facing + 3) % 4;
      }


      //input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
  }
}
}
