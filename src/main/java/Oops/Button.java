package main.java.Oops;

public class Button  {
    private String name;
    private OnButtonClick buttonClick;

    public Button(String name){
        this.name=name;
    }
     public String getName(){
        return this.name;
     }

     public void setOnButtonClick(OnButtonClick buttonClick1){
        this.buttonClick=buttonClick1;
     }
    public void onClick(){
        this.buttonClick.onClick(this.name);
    }
    public interface OnButtonClick {
        public void onClick(String title);
    }
}
