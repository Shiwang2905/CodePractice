import java.util.Scanner;
class Palindrome {
    
    public static void main(String [] args ){
        Scanner obj=new Scanner(System.in);       
   System.out.print("Enter your String to check if it is a plaindrome or not: ");
   String org=obj.nextLine();
   int l=org.length();
   int i,begin,end,middle;
   begin=0;
   end=l-1;
   middle=(begin+end)/2;
   for( i=begin;i<=middle;i++){
      if(org.charAt(begin)==org.charAt(end)){
          begin ++;
      end--;      
      } 
      else{
          break;
      }
   }
        if(i==middle+1){
            System.out.print("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}
