//1. Kiran Yesley -kirany@nycstudents.net
// Leilah Yik leilahy@nycstudents.net
public class ArrayMethods{

public static void main(String[] args){
  int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
  int [][] arr2 = {{1,2,3,6,7},{4,5,6},{7,9}};
  int [][] arr3 = {{},{},{},{}};
// test cases for arrToString for 2D arrays
  System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]  Obtained: " + arrToString(arr1));
  System.out.println("Expected: [[1, 2, 3, 6, 7], [4, 5, 6], [7, 9]]  Obtained: " + arrToString(arr2));
  System.out.println("Expected: [[], [], [], []]  Obtained: " + arrToString(arr3));
//test cases for arr2DSum
  System.out.println("Expected: 45  Obtained: " + arr2DSum(arr1));
  System.out.println("Expected: 50  Obtained: " + arr2DSum(arr2));
  System.out.println("Expected: 0   Obtained: " + arr2DSum(arr3));
//test cases for swapRC
  int [][] arr4 = {{1,2},{3,4},{5,6},{7,8}};
  System.out.println("Expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]  Obtained: " + arrToString(swapRC(arr1)));
  System.out.println("Expected: [[1, 3, 5, 7], [2, 4, 6, 8]]  Obtained: " + arrToString(swapRC(arr4)));
// test cases for replaceNegative
  int [][] arr5 = {{1,-2,-3},{4,-5,6},{-7,9}};
  int [][] arr6 = {{-1,-2,7},{4,5,6},{}, {-1}};
  replaceNegative( arr5);
  replaceNegative( arr6);
  System.out.println("Expected: [[1, 0, 0], [4, 1, 6], [0, 9]]  Obtained: " + arrToString(arr5));
  System.out.println("Expected: [[1,0,7], [4,5,6], [], [0]]  Obtained: " + arrToString(arr6));
// test cases for copy
  System.out.println("Original Array: " + arrToString(arr1) + "  Obtained: " +  arrToString(copy(arr1)) + "  Different Arrays: " + (arr1 != copy(arr1)));
  System.out.println("Original Array: " + arrToString(arr2) + "  Obtained: " + arrToString(copy(arr2)) + "  Different Arrays: " + (arr1 != copy(arr2)));
  System.out.println("Original Array: " + arrToString(arr3) + "  Obtained: " + arrToString(copy(arr3)) + "  Different Arrays: " + (arr1 != copy(arr3)));
}
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public static String arrToString(int[]ary){
  String result = "[";
  for (int i = 0; i < ary.length; i++)
  {
    result += ary[i];
    if (i < ary.length - 1){
      result += ", ";
    }
  }
  return result + "]";
}

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  String s = "[";
  for (int i = 0; i < ary.length; i++){
    s += arrToString(ary[i]);
    if (i < ary.length - 1){
      s += ", ";
    }
  }
  return s + "]";
  //this should use arrToString(int[])
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
   int answer = 0;
   for (int i = 0; i < nums.length; i++){
      for ( int j = 0; j < nums[i].length; j++){
	answer += nums[i][j];
      }
    }
   return answer;
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  int [][] arr = new int[nums[0].length][nums.length];
  for (int i = 0; i < arr.length; i++)
  {
      for(int j =0; j <arr[0].length; j++)
	{
	  arr[i][j] = nums[j][i];
	}
  }
  return arr;
}
//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){
  for (int i = 0; i < vals.length ; i++)
  {
    for(int j = 0 ; j < vals[i].length ; j++)
    {
      if (vals[i][j] < 0){
        if (i == j){
          vals[i][j] = 1;
        }
        else {
          vals[i][j] = 0;
        }
      }
    }
  }
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[][] copy(int[][] nums){
  int[][] ans = new int[nums.length][nums[0].length];
  for (int i = 0; i < nums.length; i++){
    ans[i] = returnCopy(nums[i]);
  }
  return ans;//placeholder so it compiles
}

public static int[] returnCopy(int[]ary){
  int[] ans = new int[ary.length];
  for (int i = 0; i < ans.length; i++){
    ans[i] = ary[i];
  }
  return ans;
}

}
