public class LargestPrime {
    public static void main(String[] args) {
    int result=getLargestPrime(45);
        System.out.println(result);
    }
    public static int getLargestPrime (int number){
        if(number<0){
            return -1;
        }

        int Number=0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                int count=0;
                for(int j=1; j<=i; j++){
                    if(i%j==0){
                        count++;
                    }

                }
                if(count<=2){
                    Number=i;
                }

            }
        }
        if(Number<=1){
            return -1;
        }
        return Number;
    }
}
