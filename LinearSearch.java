//Search for a number in an array and print its index position if found.
//Array: 10 7 4 9 2 13 8  
//Search key: 9
/* 
import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        int position=0;
        boolean valid=true;

        for(int i=0;i<n;i++){
            if(arr[i]==key){
                valid=true;
                position=i;
                break;
            }
            else{
                valid=false;}}
            
                if(valid==true){     
                System.out.println("Element "+key+" found at index "+position);
            }
            else{
                System.out.println("Element "+key+" not found in the array.");
            }
        }
    }
