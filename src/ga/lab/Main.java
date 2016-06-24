package ga.lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        String charString;
        double summedDoubles;
        int middleValue;

        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");



        //Problem 2:
        reversedOrder();

        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        System.out.println(summedDoubles);


        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(charString);

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        System.out.println(charString);

        charString = charsToString(new char[]{'I', ' ', 'a','m', ' '});
        System.out.println(charString);

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        System.out.println(charString);

        //Problem 6:
        List<String> fastFood = new ArrayList<>();
        fastFood.add("Wendy's");
        fastFood.add("McDonalds");
        fastFood.add("KFC");
        fastFood.add("Burger King");
        fastFood.add("Roy Rogers");


        //Problem 7:
        reversedStringOrder(fastFood);

        //Problem 8:
        printOrAdd(fastFood);

        //Problem 9:
        int[] oddSizedArray = new int[7];
        oddSizedArray[0] = 9;
        oddSizedArray[1] = 1;
        oddSizedArray[2] = 3;
        oddSizedArray[3] = 3;
        oddSizedArray[4] = 9;
        oddSizedArray[5] = 24;
        oddSizedArray[6] = 2;



        //Problem 10:
        findMiddle(/*use the array you created in problem 9*/);
        //how do we print a variable to the command line

        findMiddle(new int[]{2,7,9,12,15});
        //how do we print a variable to the command line

        findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        //how do we print a variable to the command line

        findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        //how do we print a variable to the command line

    }

    //Problem 1
    public static void stringLengthOrValue(String myString) {

        if (myString.length() > 5 ){

            System.out.println(myString);
        }

        else {

            System.out.println(myString.length());

        }
    }

    public static void reversedOrder(){

        int[] intArray = new int [10];

        for (int i = 0; i <= 10; i++){

            intArray[i] = i;
        }
        for (int i = 9; i <= 0; i --){

            System.out.println(reversedOrder(i));
        }


    }

    public static void maxValue(int[] myIntArray) {
        int max = 0;
        for (int i = 0; i <= myIntArray.length; i++){

            if (myIntArray[i]>max){

                max = myIntArray[i];

                System.out.println(max);
            }

        }
    }

    public static double sumOfValues(double[] thisMethodsArray){

        double elementSum = 0.0;
        for (int i=0; i < thisMethodsArray.length; i++){

            elementSum += thisMethodsArray[i]

        }
        return elementSum;

    }

    public static String charsToString(char [] theseChars){

        String arring = "";

        for (int i = 0; i < theseChars.length; i++){

            arring += theseChars[i];

        }

        return arring;


    }

    public static void reversedStringOrder(List<String> thisList){

        for (int i = 0; i < thisList.size(); i++){
            String firstString = thisList.get(i);
            String reverseString= "";
            for (int j = firstString.length-1; j>=0; j-- ){
                reverseString =+ firstString.charAt(j);

            }
            System.out.println(reverseString);
        }

    }

    public static void printOrAdd(List<String> thisList){
        int size = thisList.size();
        if (size == 10){
            for (int i = 0: i < size; i++){
                System.out.println(thisList.get(i));


            }
        }
        else if (size<10){
            thisList.add("Java"+size);
        }
    }

    public static int findMiddle(int[] thisOddAray){
        return thisOddAray[(thisOddAray.length/2)]
    }








    //declare your functions
}
