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

      int currNum = 5;

      for (int i = 0; i < lines.size(); i++){
        for (int j = 0; i < lines.get(i).length() - 1; i++){
          String currDir = lines.get(i).substring(i,i+1);
          if (currDir.equals("U") && currNum > 3) {
            currNum -= 3;
          }
          if (currDir.equals("D") && currNum < 7) {
            currNum += 3;
          }
        }
        ans += ans;
      }




      return ans;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
      return null;
      }
  }

  public static void main(String[] args){
    System.out.println();
  }
}
