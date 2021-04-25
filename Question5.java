import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5
{
  private static boolean add;

  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter number:");
    int num = in.nextInt();

    List<Integer> numList = new ArrayList<Integer>();
    List<Integer> modeList = new ArrayList<Integer>();


    for(int i = 0;i < num; i++){
      int newNum = in.nextInt();
      numList.add(newNum);
    }

    modeList.add(numList.get(0));
    modeList.add(0);

    for (int i : numList){
      int count = 0;
      
      for (int x : numList){
        if (x == i){
          count ++;
        }
      }

      if (count > modeList.get(1)){
        modeList.set(0, i);
        modeList.set(1, count);
      }
      else{continue;}
    }    

    System.out.println(modeList.get(0));
  }
}
