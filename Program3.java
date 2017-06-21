/* Program 3 Kyle Foley Student Account: 06  Begin: 07/16/2014 End: 7/17/2014
 * Purpose: The program prints a diamond made of asterisks "*", with the size determined by 
 * an integer that the user will enter by using recursion and calling recursive methods.
 *
 * */
import java.util.*;

public class Program3 {
  //asterisks for top half of diamond
  public static String diamond(int num){
    if(num > 0){
      return "* " + diamond(num-1);
    }
    else
      return " ";
  }
  //asterisks for bottom half of diamond
  public static String diamond2(int num){
    if(num > 0){
      return " * " + diamond(num-1);
    }
    else
      return " ";
  }
  //spaces for diamond
  public static String spaces(int num){
    if(num > 0){
      return " " + spaces(num-1);
    }
    else
      return " ";
  }
  //print the diamond
  public static void printDiamond(int num){
    for(int i = 1; i < num; i++){
      System.out.print(spaces(num-i));
      System.out.println(diamond(i));//prints asterisks for top half of diamond
    }
    for(int i = 0; i < num; i++){
      System.out.println(diamond2(num-i));//prints asterisks for bottom half of diamond
      System.out.print(spaces(i));
    }
  }
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Please enter the number of lines desired:");//prompt user for input
    int num = in.nextInt();//set variable to inputted value
    printDiamond(num);//call printDiamond method with inputted integer to print the full diamond based on said integer  
  }
}
