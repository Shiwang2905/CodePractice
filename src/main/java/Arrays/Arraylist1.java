package main.java.Arrays;

import java.util.ArrayList;

public class Arraylist1 {
        private ArrayList<String> grocerylist= new ArrayList<String>();

        public void addGrocery(String item){
            grocerylist.add(item);
        }

        public void printGrocerylist(){
            System.out.println("You have "+ grocerylist.size()+" items in the list");

            for(int i=0;i<grocerylist.size(); i++){

                System.out.println("Item "+(i+1)+ " = "+grocerylist.get(i));

            }
        }

        public void ModifyGroceryItem(int position, String item){
            String removedItem=grocerylist.get(position-1);
            grocerylist.set(position-1,item);
            System.out.println(removedItem+" has been replaced by "+item);
        }
        public void removeGroceryItem(String item){
            boolean checkItem=grocerylist.contains(item);
            if(checkItem) {
                grocerylist.remove(item);
                System.out.println(item+" has been removed from the list");
            }
            else{
                System.out.println("Not found");
            }
            }
}
