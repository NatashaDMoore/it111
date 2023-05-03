public class MyOperators {

    public static void main(String[] args) {

// --------------------------------------------------------
// ARITHMETIC OPERATORS
// --------------------------------------------------------

        // employee, wage, hours worked, overtime


//        int regHours, overtimeHours;
//        double overtimePay, regularPay, total;
//        float wage;
//        double hourlyWithOvertime;
//
//        regHours = 40;
//        overtimeHours = 5;
//        wage = 25.50F;
//        regularPay = regHours * wage;
//        overtimePay = (wage * 1.5) * overtimeHours;
//        total = overtimePay + regularPay;
//        hourlyWithOvertime = total / (regHours + overtimeHours);
//
//        System.out.println("Regular pay: $" +regularPay+ " USD");
//        System.out.println("Overtime pay: $" +overtimePay+ " USD");
//        System.out.println("Total pay: $" +total+ " USD");
//        System.out.print("Hourly rate with overtime: "); // removed "ln" from print. No longer taking up entire line
//
//        System.out.printf("$%.2f", hourlyWithOvertime);



// --------------------------------------------------------
// MODULUS OPERATORS
// --------------------------------------------------------

     int number1, number2, number3;
     number1 = 2576;
     number2 = 2;
     number3 = number1 % number2;

        if(number3 == 0) {
            System.out.println(number1+ " is an even number.");
            // do something
        } else {
            System.out.println(number1+ " is an odd number.");
            // do something else
        }

        // SHOPPING

//        double tax, priceOfItem, taxOnItem, totalPrice;
//        tax = .10;
//        priceOfItem = 100;
//        taxOnItem = priceOfItem * tax;
//        totalPrice = priceOfItem + taxOnItem;
//
//        System.out.println("Price of item: $" +priceOfItem+ " USD");
//        System.out.println("Tax: $" +taxOnItem+ " USD");
//        System.out.println("Total: $" +totalPrice+ " USD");

        double priceOfItem = 100;
        priceOfItem *= 1.10;

        System.out.print("Total price of item: ");
        System.out.printf("$%.2f", priceOfItem);
        System.out.print(" USD");


    }


}
