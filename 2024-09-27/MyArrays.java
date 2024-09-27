public class myArrays{
  public static void main(String[] args){
    System.out.println("Expected " + "[1, 2, 3, 4, 5]" + " result: " + aryToString(returnCopy([1,2,3,4,5])) + ary == returnCopy([1,2,3,4,5]));
    System.out.println("Expected " + "[]" + " result: " + aryToString(returnCopy([])+ ary == returnCopy([]));

    System.out.println("Expected " + "[1, 1, 1, 2, 2, 2]" + " result: " + aryToString(concatArray([1,1,1],[2,2,2])));
    System.out.println("Expected " + "[]" + " result: " + aryToString(concatArray([],[]));
  }
  public static string aryToString(int[] nums){
    String ans = "";
    for (int i = 0; i < nums.length; i++){
      ans += nums[i];
      if (i < nums.length - 1){
        ans += ", ";
      }
    }
  }
  public static int[] returnCopy(int[]ary){
    int[] ans = new int[ary.length];
    for (int i = 0; i < ans.length; i++){
      ans[i] = ary[i];
    }
    return ans;
  }
  

}
