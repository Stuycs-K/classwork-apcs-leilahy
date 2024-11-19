import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class day2 {
  public static String solver(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      ArrayList<String> lines = new ArrayList<String>();
      while(input.hasNextLine()){
        lines.add(input.nextLine());
      }

      String ans = "";

      for (int i = 0; i < lines.size(); i++){
        ans += ans + currNum(lines.get(i));
      }

      return null;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
      return null;
      }
  }

  public static int currNum(String line){
    return 0;
  }
  public static void main(String[] args){
    System.out.println();
  }
}
