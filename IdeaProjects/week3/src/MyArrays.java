import java.util.Arrays;

public class MyArrays {

    public static void main(String[] arg) {

//String car = "Volvo";

        //
        String[] cars = new String[4];      // Start counting at 0

        cars[0] = "Volvo";
        cars[1] = "Subaru";
        cars[2] = "Volkswagen";
        cars[3] = "Audi";

        System.out.println(cars[0].toUpperCase());
        System.out.println(Arrays.toString(cars).toUpperCase());
            // This imports the Arrays Java library
            // Allows us to select the method, toString

        String[] books = {
                "Handmaid's Tale",
                "Washington Black",
                "To Kill a Mockingbird",
                "Between The World and Me"
        };

        System.out.println(Arrays.toString(books));

//--------------------------------------------------------------------------------------
// For Each Loop
//--------------------------------------------------------------------------------------

        for(String book : books) {
            System.out.println(book);
            System.out.println(book.length());
        }

// Break the loop if book is equal to this object
        for (String book : books) {
            if(book.equals("To Kill a Mockingbird")) {
                break;
            }
            System.out.println(book);
        }


        int[] numbers = new int[3];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 50;

        System.out.println(Arrays.toString(numbers));

        for(int number : numbers) {
            System.out.println(number);
        }

    }
}
