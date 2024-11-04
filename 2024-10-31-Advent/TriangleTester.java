import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static boolean isTriangle(String[] sides){
    int sum1 = sides[0] + sides[1];
    int sum2 = sides[0] + sides[2];
    int sum3 = sides[1] + sides[2];
    return (sum1 > sides[3] || sum2 > sides[1] || sum3 > sides[2]);
  }

  public static int countTrianglesA(String filename){
    //2 Opening a file requires a try/catch
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      int count = 0;

      while (input.hasNextLine()){
        String line = input.nextLine();
        String[] vals = line.split(" ");
        if (isTriangle(vals)) count++;
      }

      return count;

      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("ReadFile.java");
      return 0; //you can return from a void function just don't put a value.
    }
  }


  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}
