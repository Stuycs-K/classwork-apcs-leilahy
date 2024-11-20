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
        String line = lines.get(i);
        for (int j = 0; j < line.length(); j++){
          String currDir = line.substring(j,j+1);

          if (currDir.equals("U") && currNum > 3) {
            currNum -= 3;
          }
          else if (currDir.equals("D") && currNum < 7) {
            currNum += 3;
          }
          else if (currDir.equals("L") && currNum % 3 != 1){
            currNum--;
          }
          else if (currDir.equals("R") && currNum % 3 != 0){
            currNum++;
          }
        }
        ans += currNum;
      }
      return ans;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
      return null;
      }
  }

  public static void main(String[] args){
    System.out.println(solver("input2.txt"));
  }
}
