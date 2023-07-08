import java.io.*;
import java.util.*;

public class BinarySearchString{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/WordList.dat"));

        String temp = "";
        while(sc.hasNextLine()){
            temp += sc.nextLine() + " ";
        }

        binarySearchString(wordToArray(temp), "dfdsfsdfdsfds");
    }

    public static String[] wordToArray(String words){
        String[] arr = words.split(" ");
        return arr;
    }
    public static void binarySearchString(String[] arr, String val){
        Arrays.sort(arr);

        int lMax = 0;
        int rMax = arr.length - 1;
        int count = 0;

        while (lMax <= rMax) {
            int mid = (lMax + rMax) / 2;
            int com = val.compareTo(arr[mid]);
            count++;

            if(com == 0) {
                System.out.println("The index of the word: " + val + "in the array is: " + mid + "\nIt took " + count + " tries");
                break;
            }
            else if(0 < com) {
                lMax = mid + 1;
            }
            else{
                rMax = mid - 1;
            }
        }
        if(lMax>rMax){
            System.out.println("The word: " + val + " is not in the list" + "\nIt took " + count + " tries");
        }
    }
}
