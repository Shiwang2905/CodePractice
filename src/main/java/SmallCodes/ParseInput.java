public class ParseInput {
    public static void main(String[] args) {
        String Numword="2020.5";
        double number= Double.parseDouble(Numword);
        System.out.println(number);

        number++;
        Numword+=1;
        System.out.println(number);
        System.out.println(Numword);

    }
}
