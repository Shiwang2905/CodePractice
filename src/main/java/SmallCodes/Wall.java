public class Wall {
    private double height;
    private double width;

    public Wall(){

    }
    public Wall(double width, double height){
        if(height<0 && width>=0){
            this.height=0;
            this.width=width;
        }
        else if(width<0 && height>=0){
            this.width=0;
            this.height=height;
        }
        else if(height<0 && width<0){
            this.height=0;
            this.width=0;
        }
        else {
            this.height = height;
            this.width = width;
        }

    }
    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }

    public void setHeight(double height) {
        if(height<0){
            this.height=0;
        }
        else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if(width<0){
            this.width=0;
        }
    else {
            this.width = width;
        }
    }

    public double getArea(){

        return (double)getHeight()*getWidth();
    }

}
