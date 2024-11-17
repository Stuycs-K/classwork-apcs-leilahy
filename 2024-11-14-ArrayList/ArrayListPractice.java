import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> lst = new ArrayList<String>(size);
    for (int i =0 ; i < size; i++){
      int n = (int) (Math.random() * 11);
      if (n != 0) lst.add("" + n);
      else lst.add("");
    }
    return lst;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for (int i =0 ; i < original.size(); i++){
    if (original.get(i).equals("")) original.set(i,"Empty");
  }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
//return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> ans = new ArrayList<String>(original.size());
    for (int i = original.size() - 1 ; i >= 0; i--){
        //int j = original.size() - i;
        ans.add(original.get(i));
      }
    return ans;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
//return a new ArrayList that has all values of a and b in alternating order that is:
//a[0], b[0], a[1], b[1]...
//If one list is longer than the other, just attach the remaining values to the end
  ArrayList<String> ans = new ArrayList<String>(a.size() + b.size());
  for (int i = 0; i < Math.min(a.size() - 1, b.size() - 1); i++){
    ans.add(a.get(i));
    ans.add(b.get(i));
  }
  if (a.size() > b.size()) {
    for(int i= b.size() -1 ; i < a.size() ; i++) ans.add(a.get(i));
  }
  if (b.size() > a.size()) {
    for(int i= a.size() - 1; i < b.size() ; i++) ans.add(b.get(i));
  }
    return ans;
  }

  public static void main(String[] args){
    ArrayList<String> a = createRandomArray(10);
    System.out.println(a);
    replaceEmpty(a);
    System.out.println(a);
    System.out.println(makeReversedList(a));

    ArrayList<String> b = createRandomArray(7);
    ArrayList<String> c = createRandomArray(7);
    System.out.println("-------------------------------Testing same lengths with mixLists");
    System.out.println(a);
    System.out.println(b);
    System.out.println(mixLists(a,b));
    System.out.println("-------------------------------Testing diff lengths with mixLists");

    System.out.println(b);
    System.out.println(c);
    System.out.println(mixLists(b,c));


  }
}
