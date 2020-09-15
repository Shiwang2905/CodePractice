public class Convert {
    public static void main(String[] args) {
        double t = 100.4;
        int num = (int) (t / 1.609);
        float num1 = (float)(t/1.609);
        float rem=num1-num;
        System.out.println(rem);
        System.out.println(num);

    }
}