import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class day6 {
  public static void main(String[] args){
    System.out.println(solver("input6.txt"));
  }
  public static String solver(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      ArrayList<String> lines = new ArrayList<String>();
      while(input.hasNextLine()){
        lines.add(input.nextLine());
      }

      String ans = "";

      for (int i = 0; i < lines.get(0).length(); i++){
        int[] alphaCount = new int[26];
        for (int j = 0; j < lines.size(); j++){
          char curr = lines.get(j).charAt(i);
          int displaced = curr - 'a';
          alphaCount[displaced]++;
        }

        int mostUses = 0;
        char mostFreq = 'a';
        for(int k = 0; k < 26; k++){
          if (alphaCount[k] > mostUses){
            mostUses = alphaCount[k];
            mostFreq = (char)(k + 'a');
          }
        }
        ans += mostFreq;
      }

      return ans;
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
      return null;
      }
  }
}
