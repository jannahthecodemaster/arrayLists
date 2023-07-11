import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        //scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll"); //will add to the end of the array
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
        System.out.println("Proof of second task " + scottishIslands);

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(scottishIslands.indexOf("Jura") + 1, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println("Skye index: " + scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        //System.out.println(scottishIslands.indexOf("Arran"));
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println("number of islands: " + scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands, String.CASE_INSENSITIVE_ORDER);
//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }

        System.out.println("Sanity check!" + scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);


        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        List<Integer> evenNumbers = new ArrayList<>(); //could have put list at the beginning too - every array list is a list too
        for (int number : numbers){
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println("Even numbers: " + evenNumbers);

//        2. Print the difference between the largest and smallest value
         int maxNumber = Collections.max(numbers);
         int minNumber = Collections.min(numbers);
         System.out.println("Difference between largest and smallest number: " + (maxNumber - minNumber));
//        3. Print True if the list contains a 1 next to a 1 somewhere.
            boolean result = false;
            for (int i = 0; i < numbers.size(); i++) { //syntactic sugar, does the same thing as for (int number : numbers)
                if(numbers.get(i) == 1 && numbers.get(i + 1) == 1){
                    result = true;
                }
            }
            System.out.println("Numbers that contain 1 next to a 1) is: " + result);

//        4. Print the sum of the numbers,
        int sumOfNumbers = 0;
        for (int number : numbers){
            sumOfNumbers += number;
        }
        System.out.println("Sum of numbers: " + sumOfNumbers);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

        int total = 0;
        for (int number : numbers){
            if(number == 13){
                break; //continue; would instead just skip over the number and add the others after it.
            }
            total += number;
        }
        System.out.println("Sum of numbers without 13" + total);

    }

}
