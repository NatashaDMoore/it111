public class LitersToGallons {
    public static void main(String[] arg) {

        // gal * 3.785 = l

        double l, gal;                                      // Initialize liters
        int counter = 0;                                        // Initialize the counter
        String galUnit;

        for(gal = 1; gal <= 100; gal = gal+4) {

            l = gal * 3.785;
            counter++;                                          // counter adds by one each loop

            // Space between every 5
            if(counter == 5){

                System.out.println();                           // if counter is 5 print extra line
                counter = 0;                                    // reset counter for next loop
            }

            // Gallon vs Gallons
            if(gal <= 1) {
                galUnit = "Gallon";
            } else {
                galUnit = "Gallons";
            }

            // Print must be after the if statements but inside the for loop

            System.out.printf("$%.2f", l);                          // friendly decimal
            System.out.print(" Liters = " +gal+ " " +galUnit);      // remove ln to allow on same line
            System.out.println();                                   // create separate line for next loop data

        } //end for loop




    }

}
