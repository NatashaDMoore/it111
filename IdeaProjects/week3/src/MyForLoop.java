public class MyForLoop {
    public static void main(String[] arg) {


        int count; // must declare a variable before the loop

        // count from 0 to no more than 20 every two numbers
        for(count = 0; count <= 20; count = count+2) {
            System.out.println(count);
        }
        System.out.println("Done"); // placed outside the loop (will occur only once)




        int newCount;

        // start at 40 and no less than 0 decreased by two
        for(newCount = 40; newCount > 0; newCount = newCount -2) {

            if(newCount <= 10) {

                System.out.println("Only "+newCount+" seconds away");

            } else{

            System.out.println(newCount);

            }
        } //end for loop

        System.out.println("Blast off"); // placed outside the loop (will occur only once)





    }
}
