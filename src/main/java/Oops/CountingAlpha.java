package main.java.Oops;

public class CountingAlpha {
    private String name;

    public CountingAlpha(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public void Count(){
        String s=getName().toLowerCase();
        for(int i=0; i<=s.length()-1; i++){
            int count=1;
            for(int j=i+1; j<=s.length()-1; j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            System.out.println(name.charAt(i)+" = "+count);
        }

    }


}
