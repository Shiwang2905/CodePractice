public class test {
    public static void main(String[] args) {
        double Area=0.75*0.75;

        double extraBuckets=0;
        double RemArea= ((double)Area-extraBuckets);
        System.out.println(RemArea);
        double ReqBucket=((double)RemArea/0.5);
        System.out.println(ReqBucket);

        System.out.println(Math.ceil(ReqBucket));

    }
}
