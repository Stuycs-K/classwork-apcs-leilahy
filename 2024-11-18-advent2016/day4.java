import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class day4 {
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
        String commonLetters = line.substring(line.length()-6,line.length()-1);
        System.out.println("common letters: " + commonLetters);

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
          }
        }











        // blablabla below retstarting
        for (int j = 0; j < line.length(); j++){

          String lowerLetters = "";
          // puts all the lowercase letters together for easier counting
          for (int k = 0; k < currLine.length - 2; k++){
            lowerLetters += currLine[k];
          }
          // count letters oh no
          char[] uniqueChars = new char[lowerLetters.length()];
          int[] charCount = new int[lowerLetters.length()];

          int uniqueCount = 0;
          // looping thorugh the string
          for (int l = 0; l < lowerLetters.length(); l++){
            char currChar = lowerLetters.charAt(l);
            boolean counted = false;
            // if counted increase count
            for (int m = 0; m < uniqueCount; m++){
              if(uniqueChars[m] == currChar){
                charCount[m]++;
                counted = true;
              }
            }
            // if not counted
            if (!counted){
              uniqueChars[uniqueCount] = currChar;
              charCount[uniqueCount] = 1;
              uniqueCount++;
            }
          }
          // check 5 most common letters
        }
      }

      return 0;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
      return -1;
      }
  }
  public static void main(String[] args){
    System.out.println(sumSector("input3.txt"));
  }
}
