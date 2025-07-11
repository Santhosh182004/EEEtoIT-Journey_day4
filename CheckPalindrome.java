import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String str=s.nextLine();
        char ch[]=str.toCharArray();
        StringBuilder str2=new StringBuilder(str);
        str2.reverse();
        String str3=str2.toString();
        if(str.equals(str3)){
            System.out.println("The given string "+str+" is an palindrome");
        }
        else{
            System.out.println("The given string "+str+"is not an palindrome");
        }
    }
} 
