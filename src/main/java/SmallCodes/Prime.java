import java.util.Scanner;
public class Prime{
public static void main(String[] args) {
     Scanner num= new Scanner(System.in);
     System.out.print("Enter the terms:");
     
    int n=num.nextInt();
    
  for(int j=2;j<4;j++){
   System.out.println(j);
  }
    
  for(int i=4;i<=n; i++){
    
    if((i*i-1)%24==0){
        System.out.println(i);
    }
    
  }
   
    
    }
}
