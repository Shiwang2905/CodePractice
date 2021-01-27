package main.java.Collections;

public class ListMain {
    public static void main(String[] args) {
        MyList l= new MyList(null);
        l.traverse(l.getRoot());

    String s= "Delhi Agra Ajmer Chennai Pune Mumbai Bhopal Indore";
    String[] arr=s.split(" ");

    for(String i:arr){
        l.addItem(new Node(i));
    }
    l.traverse(l.getRoot());

    l.removeItem(new Node("Chennai"));
    l.traverse(l.getRoot());
    }


}
