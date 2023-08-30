// ClassMethodLab.java
public class ClassMethodLab {
    public static void main(String [] args) {
        //you should test these class methods in the main methods using sample input/output
        long result = toMilesPerHour(10.25);
        System.out.println(result);

        result = toMilesPerHour(-5.6);
        System.out.println(result);

        printConversion(1.5);

        printConversion(75.114);

        printConversion(2500);

        printMegaBytesAndKiloBytes(-1024);

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        System.out.println(hasEqualSum(1, 1, 1));

        System.out.println(hasTeen(9, 99, 19));
    } //end of main

    /*
    This method will convert KilometersPerHour to MilesPerHour.
    It will return the rounded value of calculation.

    Examples of input/output for testing:
    * toMilesPerHour(1.5; -> should return value 1
    * toMilesPerHour(10.25); -> should return value 6
    * toMilesPerHour(-5.6); -> should return value -1
    * toMilesPerHour(25.42); -> should return value 16
    * toMilesPerHour(75.114); -> should return value 47
     */
    public static long toMilesPerHour (double kilometersPerHour) {

        //If the parameter is less than 0, the method will return -1 to
        //indicate an invalid value.
        if (kilometersPerHour < 0) {
            return -1;
        }
        //Otherwise it will calculate the value of miles per hour,
        // round it and return it.
        // NOTE: 1 mile per hour is 1.609 kilometers per hour
        long milesPerHour = Math.round(kilometersPerHour / 1.609);

        return milesPerHour ;
    } //end of toMilesPerHour

    /*
    printConversion will convert KilometersPerHour to MilesPerHour and print it out the specific format


    Examples of input/output for testing:
    * printConversion(1.5); -> should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
    * printConversion(10.25); -> should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
    * printConversion(-5.6); -> should print the following text (into the console - System.out): Invalid Value
    * printConversion(25.42); -> should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
    * printConversion(75.114); -> should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h
     */

    public static void printConversion(double kilometersPerHour) {
        //if the parameter kilometersPerHour is < 0 then print the text "Invalid Value"/
        if (kilometersPerHour < 0) {
        System.out.println("Invalid Value");
        } else {
            //call toMilesPerHour to convert kilometerPerHour to milesPerHour
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            //print results in the correct format
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    } //end of printConversion method

    /*
    printMegaBytesAndKiloBytes needs to calculate the megabytes and remaining
    kilobytes from the kilobytes parameter.


    EXAMPLE INPUT/OUTPUT

    * printMegaBytesAndKiloBytes(2500); -> should print the following text: "2500 KB = 2 MB and 452 KB"

    * printMegaBytesAndKiloBytes(-1024); -> should print the following text: "Invalid Value" because parameter is less than 0

    * printMegaBytesAndKiloBytes(5000); -> should print the following text: "5000 KB = 4 MB and 984 KB"

    TIP: 1 MB = 1024 KB

     */

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        //If the parameter kiloBytes is less than 0 then print the text "Invalid Value"
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            //calculate the megabytes and remaining kilobytes from the kilobytes parameter.
            int megabytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            //print out the results for given format
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    /*
    areEqualByThreeDecimalPlaces return true if two double numbers
    are the same up to three decimal places. Otherwise, return false.

    EXAMPLES OF INPUT/OUTPUT for testing:

    * areEqualByThreeDecimalPlaces(-3.1756, -3.175): -> should return true since numbers are equal up to 3 decimal places.
    * areEqualByThreeDecimalPlaces(3.175, 3.176); -> should return false since numbers are not equal up to 3 decimal places.
    * areEqualByThreeDecimalPlaces(3.0, 3.00; -> should return true since numbers are equal up to 3 decimal places.
    * areEqualByThreeDecimalPlaces(-3.123, 3.123); -> should return false since numbers are not equal up to 3 decimal places.

     */

    public static boolean areEqualByThreeDecimalPlaces(double numberA, double numberB) {

        //By multiplying by 1000, we have the last 3 digits &
        // by converting double to an int using casting, we delete the remaining value for floating point
        // since an int cannot store decimal values.

        return (int) (numberA * 1000) == (int) (numberB * 1000);

    }

    /* hasEqualSum needs to return true if the sum of the first and
        second parameter is equal to the third parameter. Otherwise, return false.

        EXAMPLES OF INPUT/OUTPUT:

        * hasEqualSum(1, 1, 1); should return false since 1 + 1 is not equal to 1
        * hasEqualSum(1, 1, 2); should return true since 1 + 1 is equal to 2
        * hasEqualSum(1, -1, 0); should return true since 1 + (-1) is 1 - 1 and is equal to 0


     */

    public static boolean hasEqualSum(int a, int b, int c) {
        //We check whether the sum of the first and
        //second parameter is equal to the third parameter
        //this will return boolean value
        boolean result = (a + b == c);
        return result;
    }

    /*
    isTeen needs to return true if the parameter is in range 13(inclusive) -
    19 (inclusive). Otherwise return false.

    EXAMPLES OF INPUT/OUTPUT:

    * isTeen(9); should return false since 9 is not in range 13-19

    * isTeen(13); should return true since 13 is in range 13-19

     */
    public static boolean isTeen(int a) {
        //return true if the parameter is in range 13(inclusive) -
        //19 (inclusive).
        return a >= 13 && a <=19;
    }

    /*

    hasTeen needs to return true if one of the parameters is in range 13(inclusive) - 19
    (inclusive). Otherwise, return false.

    EXAMPLES OF INPUT/OUTPUT:

    * hasTeen(9, 99, 19); should return true since 19 is in range 13-19

    * hasTeen(23, 15, 42); should return true since 15 is in range 13-19

    * hasTeen(22, 23, 34); should return false since numbers 22, 23, 34 are not in range 13 - 19


     */

    public static boolean hasTeen(int a, int b, int c) {
        //check whether one of the parameters is in range 13(inclusive) - 19
        //(inclusive) using OR operator.
        return isTeen(a) || isTeen(b) || isTeen(c);

    }
}
