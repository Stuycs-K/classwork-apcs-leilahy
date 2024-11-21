import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class day4retry {
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

        String checksum = line.substring(line.length()-6,line.length()-1);
        int sectorID = Integer.parseInt(line.substring(line.length()-10,line.length()-7));

        // get letters in the beginning
        String[] letters = line.split("-");
        String lowerLetters = "";
        for (int j = 0; j < letters.length - 1; j++) {
          lowerLetters += letters[j];
        }

        // count uses of letters in line
        int[] alphaCount = new int[26];
        for (int k = 0; k < lowerLetters.length(); k++){
          char curr = lowerLetters.charAt(k);
          alphaCount[curr - 'a']++;
        }

        // find top 5 actual frequent letters

        char[] mostFreq = new char[26];
        int[] mostUsed = new int[26];
        int distinctLetters = 0;

        for (int p = 0; p < 26; p++){
          if (alphaCount[p] > 0){
            // if theyre in the line, put them in
            mostFreq[distinctLetters] = (char)('a' + p);
            mostUsed[distinctLetters] = alphaCount[p];
            distinctLetters++;
            //System.out.println("used char: " + mostFreq[distinctLetters - 1]);
          }
        }
        //System.out.println("Most Frequent letters: " + Arrays.toString(Arrays.copyOf(mostFreq, distinctLetters)));
        //System.out.println("Frequency: " + Arrays.toString(Arrays.copyOf(mostUsed, distinctLetters)));

        // sort
        for (int l = 0; l < distinctLetters ; l++){
          for (int m = l + 1; m < distinctLetters; m++){
            if (mostUsed[l] < mostUsed[m] || ((mostUsed[l] == mostUsed[m]) && (mostFreq[l] > mostFreq[m]))) {
            // if next char is mostUSed/if theyre eqally used but alphabetically out of order, then swap
            char tempChar = mostFreq[l];
            mostFreq[l] = mostFreq[m];
            mostFreq[m] = tempChar;

            int tempUsed = mostUsed[l];
            mostUsed[l] = mostUsed[m];
            mostUsed[m] = tempUsed;
            }
          }
        }

        String actualChecksum = "";
        for (int o = 0; o < 5; o++) {
          actualChecksum += mostFreq[o];
        }
//System.out.println("actualChecksum: " + actualChecksum);

        if (checksum.equals(actualChecksum)){
          sum += sectorID;
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
