public class myArrays{
  public static void main(String[] args){
    int[] ary1 = {1,2,3,4,5};
    int[] ary2 = {};
    int[] ary3 = {1,1,1};
    int[] ary4 = {2,2,2};
    // Test Cases for aryToString
    System.out.println("Expected [1, 2, 3, 4, 5]  result: " + aryToString(returnCopy(ary1)) +
                       "  Different Arrays: " + (ary1 != returnCopy(ary1)));
    System.out.println("Expected [] result: " + aryToString(returnCopy(ary2)) +
                       "  Different Arrays: " + (ary2 != returnCopy(ary2)));
    // Test Cases for concatArray
    System.out.println("Expected " + "[1, 1, 1, 2, 2, 2]" + "  result: " + aryToString(concatArray(ary3,ary4)));
    System.out.println("Expected " + "[1, 2, 3, 4, 5]" + " result: " + aryToString(concatArray(ary1,ary2)));
    System.out.println("Expected " + "[]" + " result: " + aryToString(concatArray(ary2,ary2)));
// test
  }
  public static String aryToString(int[] nums){
    String ans = "[";
    for (int i = 0; i < nums.length; i++){
      ans += nums[i];
      if (i < nums.length - 1){
        ans += ", ";
      }
    }
    return ans + "]";
  }
  public static int[] returnCopy(int[]ary){
    int[] ans = new int[ary.length];
    for (int i = 0; i < ans.length; i++){
      ans[i] = ary[i];
    }
    return ans;
  }
  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] ans = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length + ary2.length; i++){
      if (i < ary1.length){
        ans[i] = ary1[i];
      }
      else {
        ans[i] = ary2[i - ary1.length];
      }
    }
    return ans;
  }


}
