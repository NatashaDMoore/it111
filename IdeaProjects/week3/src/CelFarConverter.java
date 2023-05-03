public class CelFarConverter {
    public static void main(String[] arg) {

        // far = (cel * 9/5) + 32

        int cel, far;

        for(cel = 0; cel <= 100; cel = cel+4) {
            far = (cel * 9/5) + 32;

            System.out.println(cel+ " degrees Celsius is equal to " +far+ " degrees Farenheit");


        } //end for loop




    }
}
