package main.java.Oops;

import java.util.Scanner;

public class Bmain {
    static Scanner sc= new Scanner(System.in);
    static Button b= new Button("Hello");

    public static void main(String[] args) {

//        class ClickListner implements Button.OnButtonClick{
//            ClickListner(){
//                System.out.println(getClass());
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title+" was pressed");
//            }
//        }

        //b.setOnButtonClick(new ClickListner());
        b.setOnButtonClick(new Button.OnButtonClick() {
            @Override
            public void onClick(String title) {
                System.out.println(title +"was clicked");
            }
        });
        listen();
    }

    public static void listen(){
        boolean quit= true;
        while(quit){
            System.out.print("Choose : ");
            int n=sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 0:
                    quit = false;
                    break;
                case 1:
                    b.onClick();
                    break;
            }
        }
    }
}
