package main.java.Collections;

public abstract class ListItem {

    protected ListItem nextLink=null;
    protected ListItem previousLink=null;
    protected Object value;

    public ListItem(Object o){
        this.value=o;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int CompareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
