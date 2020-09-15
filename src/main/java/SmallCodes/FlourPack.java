public class FlourPack {
    public static void main(String[] args) {
    boolean answer=canPack(1,0,4);
        System.out.println(answer);
        answer=canPack(1,0,5);
        System.out.println(answer);
        answer=canPack(0,5,4);
        System.out.println(answer);
        answer=canPack(2,2,11);
        System.out.println(answer);
        answer=canPack(-3,2,12);
        System.out.println(answer);
        answer=canPack(5,3,24);
        System.out.println(answer);
        answer=canPack(0,0,24);
        System.out.println(answer);
    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if(bigCount<0 || smallCount<0|| goal<0){
            return false;
        }

        if(bigCount>0 && smallCount==0){
        for(int i=1; i<=bigCount; i++){
            int Sum=i*5;
            if(Sum==goal){
                return true;
            }
        }
        }
         else if(bigCount==0 && smallCount>0){
            if(goal<=smallCount){
                return true;
            }
        }

        else if(bigCount>0 && smallCount>0){
            for(int i=0; i<=bigCount; i++){
                for(int j=0; j<=smallCount; j++){
                    int sum=5*i + 1*j;
                    if(sum==goal){
                        return true;
                    }
                }
            }
        }

        return false;

    }
}
