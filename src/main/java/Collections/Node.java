package main.java.Collections;

public class Node extends ListItem {

    public Node(Object value){
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextLink;
    }

    @Override
    ListItem setNext(ListItem i) {
        this.nextLink=i;
        return this.nextLink;
    }

    @Override
    ListItem previous() {
        return this.previousLink;
    }

    @Override
    ListItem setPrevious(ListItem j) {
        this.previousLink=j;
        return this.previousLink;
    }

    @Override
    int CompareTo(ListItem item) {
        if(item!=null){
            return ((String)super.getValue()).compareTo((String) item.getValue());
        }
        else{
            return -1;
        }
        }

}
