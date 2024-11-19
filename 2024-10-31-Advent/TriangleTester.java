import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  /*public static boolean isTriangle(String[] sides){
    int side0 = Integer.parseInt(sides[0]);
    int side1 = Integer.parseInt(sides[1]);
    int side2 = Integer.parseInt(sides[2]);
    if (side0 + side1 > side2 && side0 + side2 > side1 && side1 + side2 > side0){
      System.out.println("Valid Triangle");
    }
    return (side0 + side1 > side2 && side0 + side2 > side1 && side1 + side2 > side0);
  }*/
  public static boolean isTriangle(int a, int b, int c){
    return (a + b > c) && (a + c > b) && (b + c > a);
  }

  public static int countTrianglesA(String filename){
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;

      while(input.hasNextLine()){
        if (isTriangle(input.nextInt(), input.nextInt(), input.nextInt())) {
          count++;
        }
      }
      return count;
    } catch (FileNotFoundException ex) {
      System.out.println(filename);
      return -1;
    }
  }

  /*public static int countTrianglesA(String filename){
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
      input.close();
      return count;

      //input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println(filename);
      return 0; //you can return from a void function just don't put a value.
    }
  }
  */

  public static int countTrianglesB(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);

      int count = 0;

      while (input.hasNextLine()){
        String line1 = input.nextLine().trim();
        String line2 = input.nextLine().trim();
        String line3 = input.nextLine().trim();

        if (line1.isEmpty() || line2.isEmpty() || line3.isEmpty()) continue;

        String[] sides1 = line1.split(" ");
        String[] sides2 = line2.split(" ");
        String[] sides3 = line3.split(" ");

        if (sides1.length != 3 || sides2.length != 3 || sides3.length != 3) continue;

        for (int i = 0; i < 3; i++){
          System.out.println("Sides: " + sides1[i] +" "+ sides2[i] +" "+ sides3[i]);
          String[] currTri = {sides1[i], sides2[i], sides3[i]};
          //if (isTriangle(currTri)) count++;
        }
      }

      input.close();
      return count;
    }catch (FileNotFoundException ex) {
      System.out.println(filename);
      return -1; //you can return from a void function just don't put a value.
    }
  }


  public static void main(String[] args) {
    System.out.println("Should return true: " + isTriangle(3,4,5));
    System.out.println("Should return true: " + isTriangle(8,15,17));
    //System.out.println(countTrianglesA("input1.txt"));
//    System.out.println("Expected 2: " + countTrianglesB("test.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }
}
