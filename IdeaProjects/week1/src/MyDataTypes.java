public class MyDataTypes {

    public static void main(String[] args) {

        short number1 = 32_000;
        long number2 = 3_000_000_000L;
        float number3 = 30.57F;
        double number4 = 50.123456789;


        // INT -- must be 2 Billion or less
        // LONG -- data type requires a capital L after the number
        // FLOAT -- deals with decimals. Requires capital F after the number
        // DOUBLE --

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);


        boolean dry = true;

        if (dry) {

            System.out.println("Time to hang up those curtains");
        }    else {
                System.out.println("We will have to wait to hang the curtains");
            }


        char best = 'A';

        System.out.println(++best);

    }
}
