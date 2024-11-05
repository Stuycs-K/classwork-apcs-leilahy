import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static boolean isTriangle(String[] sides){
    int side0 = Integer.parseInt(sides[0]);
    int side1 = Integer.parseInt(sides[1]);
    int side2 = Integer.parseInt(sides[2]);
    return (side0 + side1 > side2 && side0 + side2 > side1 && side1 + side2 > side0);
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

      //input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
      return 0; //you can return from a void function just don't put a value.
    }
  }

  public static int countTrianglesB(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      int count = 0;

      while (input.hasNextLine()){
        String[] line1 = input.nextLine().split("");
        String[] line2 = input.nextLine().split("");
        String[] line3 = input.nextLine().split("");

        for (int i = 0; i < 3; i++){
          String[] currTri = {line1[i], line2[i], line3[i]};
          if (isTriangle(currTri)) count++;
        }
      }

      input.close();
      return count;
    }catch (FileNotFoundException ex) {
      System.out.println(filename);
      return 0; //you can return from a void function just don't put a value.
    }
  }


  public static void main(String[] args) {
    System.out.println("Expected 2: " + countTrianglesA("inputA.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }
}
