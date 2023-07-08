# BinarySearchStrings
Binary search for strings

Inside the BinarySearchString class, there is a main method that serves as the entry point of the program. It throws a FileNotFoundException.
The main method reads input strings from a file named "src/WordList.dat" using a Scanner.
The contents of the file are concatenated into a single string (temp) by iterating over each line and appending it to temp.
The wordToArray method is called with temp as an argument to convert the string into an array of strings.
The binarySearchString method is called with the resulting array and a target string ("dfdsfsdfdsfds") as arguments.

The wordToArray method takes a string (words) as a parameter.
It splits the words string into an array of strings (arr) using whitespace as the delimiter.
The wordToArray method returns the resulting array.
The binarySearchString method takes an array of strings (arr) and a target string (val) as parameters.

It starts by sorting the array using Arrays.sort(arr).
Two variables, lMax and rMax, are initialized to store the leftmost and rightmost indices of the search boundary.
A counter variable count is initialized to keep track of the number of comparisons made during the search.
The code enters a while loop that continues until the leftmost index is less than or equal to the rightmost index.
Inside the loop, the midpoint index (mid) is calculated as the average of the leftmost and rightmost indices.
The target string (val) is compared to the string at the midpoint index using the compareTo method, and the result is stored in the com variable.

The count variable is incremented to keep track of the number of comparisons made.
If the result of the comparison (com) is 0, it means the target string is found at the midpoint index. The method prints the index, the word, and the number of tries, and then the loop is terminated using break.
If the result of the comparison (com) is positive, it means the target string is greater than the string at the midpoint index, and the search continues in the right half of the array by updating the leftmost index (lMax).
If the result of the comparison (com) is negative, it means the target string is smaller than the string at the midpoint index, and the search continues in the left half of the array by updating the rightmost index (rMax).
If the leftmost index becomes greater than the rightmost index, it means the target string is not found in the array. The method prints a message indicating that the word is not in the list, along with the number of tries.
