package main.java.Collections;
import java.util.Scanner;
public class Music {
    public static void main(String[] args) {
        Albums album1= new Albums();
        Scanner c= new Scanner(System.in);
        album1.action();
        System.out.println("Enter 0 to exit \n" +
                "Enter 1 to create playlist ");
        System.out.print("enter choice : ");
        int a=c.nextInt();
        c.nextLine();
        switch (a){
            case 0:
                System.out.println("You have exited.");
                break;
            case 1:
                System.out.print("Enter the name of playlist : ");
                String s=c.nextLine();
                Playlist p1=new Playlist(s);
                System.out.print("Enter the name of song you want to add to playlist : ");
                String n=c.nextLine();
                
        }
    }

}
