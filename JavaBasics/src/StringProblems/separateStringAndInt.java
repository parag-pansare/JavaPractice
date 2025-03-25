package StringProblems;
import java.util.Scanner;

public class separateStringAndInt {

    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        System.out.print("Enter a string with number in it: ");
        String input = newObj.nextLine();
       
        String Str1 = "";
        String Str2 = "";
        
        for(int i =0; i< input.length(); i++){
            char ch = input.charAt(i);
      
            if(Character.isDigit(ch)){
                Str2 += ch;
            }
            else{
                Str1 += ch;
            }
        }
        System.out.println("Character in input are: " + Str1);
        System.out.println("Numbers in input are: " + Str2);
    }
}