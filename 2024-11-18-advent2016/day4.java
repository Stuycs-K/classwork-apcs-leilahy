import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class day4 {
  public static void main(String[] args){
    System.out.println(sumSector("input4.txt"));
  }
  public static int sumSector(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      ArrayList<String> lines = new ArrayList<String>();
      while(input.hasNextLine()){
        lines.add(input.nextLine());
      }

      int sum = 0;

      // use length to get last 5 common letters, then loop through to see if they are common
      for (int i = 0; i < lines.size(); i++){
        String line = lines.get(i);

        // get 5 common letters
        String checksum = line.substring(line.length()-6,line.length()-1);
        System.out.println("common letters: " + checksum);

        // get sector ID
        int sectorID = Integer.parseInt(line.substring(line.length()-10,line.length()-7));
        System.out.println("sectorID: " + sectorID);

        // get common letters
        String[] currLine = line.split("-");
        String lettersMashed = "";
        for (int j = 0; j < currLine.length - 2; j++){
          lettersMashed += currLine[j];
        }

        // then make loops and stuff checking 5 most common thingies
        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<Integer> letterCount = new ArrayList<Integer>();

        for (int k = 0; k < lettersMashed.length(); k++){
          String currLetter = lettersMashed.substring(k,k+1);
          if (letters.indexOf(currLetter) != -1){
            letterCount.set(letters.indexOf(currLetter),letterCount.get(letters.indexOf(currLetter)) + 1);
          }
          else {
            letters.add(currLetter);
            letterCount.add(1);
          }
          // find 5 greatest letters thingies
          int[][] indexed = new int[letterCount.size()][2];
          for (int l = 0; l < letterCount.size(); l++) {
            indexed[l][0] = letterCount.get(l);
            indexed[l][1] = l;
          }
          int[] top5 = new int[5];
          boolean[] used = new boolean[letterCount.size()];

          for (int m = 0; m < 5; m++) {
            int maxIndex = -1;
            int maxValue = -1;
            for (int n = 0; n < indexed.length; n++) {
                if (!(used[n]) && indexed[n][0] > maxValue) {
                    maxValue = indexed[n][0];
                    maxIndex = n;
                }
            }
            top5[m] = indexed[maxIndex][1];
            used[maxIndex] = true;
          }

          int match = 0;
          for (int o = 0; o < 5; o++){
            if (checksum.contains(letters.get(top5[o]))) match++;
          }

          if (match == 5) sum += sectorID;
        }
      }

      return sum;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
      return -1;
      }
  }
}
