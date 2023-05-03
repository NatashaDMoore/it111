public class LitersToGallons {
    public static void main(String[] arg) {

        // gal * 3.785 = l

        double l = 0, gal;                                      // Initialize liters
        int counter = 0;                                        // Initialize the counter

        for(gal = 1; gal <= 100; gal = gal+4) {

            l = gal * 3.785;
            System.out.printf("$%.2f", l);                      // friendly decimal
            System.out.print(" Liters = " +gal+ " Gallons");    // remove ln to allow on same line
            System.out.println();                               // create separate line for next loop data
            counter++;                                          // counter adds by one each loop

            if(counter == 5){

                System.out.println();                           // if counter is 5 print extra line
                counter = 0;                                    // reset counter for next loop

            }

        } //end for loop




    }

}
