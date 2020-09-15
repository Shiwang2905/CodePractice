public class PaintJob {
    public static void main(String[] args) {
    int res=getBucketCount(3.4,2.1,1.5,2);
        System.out.println(res);
        res=getBucketCount(6.26,2.2);
        System.out.println(res);
        res=getBucketCount(3.26,0.75);
        System.out.println(res);

    }
    public static int getBucketCount(double width,double height,double areaPerBucket, int extraBuckets) {
        if(width<=0 || height<=0|| areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }
        double Area=width*height;
       double ReqBucket=((double)Area/areaPerBucket);
        int a=(int)Math.ceil(ReqBucket)-extraBuckets;
        return a;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<=0 || height<=0|| areaPerBucket<=0 ){
            return -1;
        }
        double area=width*height;
        double ReqBucket=((double)area/areaPerBucket);
        int b=(int)Math.ceil(ReqBucket);
        return b;
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0 || areaPerBucket<=0 ){
            return -1;
        }
        double ReqBucket=((double)area/areaPerBucket);
        int b=(int)Math.ceil(ReqBucket);
        return b;
    }
}
