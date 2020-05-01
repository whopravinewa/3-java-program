/*1. (2 points)
   Write a function that takes a list of strings and prints them, one per line,
   in a rectangular frame.
   For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

+++++++++
+ Hello +
+ World +
+ in    +
+ a     +
+ frame +
+++++++++

  

2. (3 points)
   Extend that function so that shorter words are placed in the same line, but not exceeding the
   length of the longest word.
   For example the list ["Hello", "beautiful", "World", "in", "a", "frame"] gets printed as:

+++++++++++++
+ Hello     +
+ beautiful +
+ World in  +
+ a frame   +
+++++++++++++


3. (2 points)
   Extend that function so that it also accepts a string and separates the words by itself.
   For example the string "Hello beautiful sentence in a frame" gets printed as:

+++++++++++++
+ Hello     +
+ beautiful +
+ sentence  +
+ in a      +
+ frame     +
+++++++++++++
*/

import java.util.*;

public class javaProgram3 {
    public static void main(String args[]) {
        String sentence = "I will remember and recover, not forgive and forget.";
        String array[] = { "Normality", "is", "a", "paved", "road:", "it’s", "comfortable", "to", "walk", "but", "no",
                "flowers", "grow" };
        List<String> words = convertArrayToList(array);
        System.out.println("Question 1");
        rectangularFramePerWord(words);
        System.out.println("Question 2");
        rectangularFrame(words);
        List<String> sentenceList = convertArrayToList(sentence.split("\\s+"));
        System.out.println("Question 3");
        rectangularFrame(sentenceList);
    }

    public static <T> List<T> convertArrayToList(T array[]) {

        // Create an empty List
        List<T> list = new ArrayList<>();

        // Iterate through the array
        for (T t : array) {
            // Add each element into the list
            list.add(t);
        }

        // Return the converted List
        return list;
    }

    // 1
    public static void rectangularFramePerWord(List<String> list) {
        int size = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > size) {
                size = list.get(i).length();
            }
        }
        // print + in top
        for (int i = 0; i < size + 2; i++) {
            System.out.print("+");
        }
        System.out.println("");

        for (int i = 0; i < list.size(); i++) {
            int n = size - list.get(i).length();// total space left after word
            String space = "";
            if (n > 0) {
                space = String.format("%" + n + "s", "");// add empty space
            }
            System.out.println("+" + list.get(i) + space + "+");
        }
        // print + in last
        for (int i = 0; i < size + 2; i++) {
            System.out.print("+");
        }
        System.out.println("");
    }

    public static void rectangularFrame(List<String> list) {
        int size = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > size) {
                size = list.get(i).length();
            }
        }
        // print + in top
        for (int i = 0; i < size + 2; i++) {
            System.out.print("+");
        }
        System.out.println("");

        for (int i = 0; i < list.size(); i++) {
            String space = "";
            String word = list.get(i);
            int n = size - list.get(i).length();// total space left after word
            // System.out.println(i + " & " + n);
            if (i < list.size() - 1) {
                if (n > list.get(i + 1).length()) {
                    int j = i + 1;
                    do {

                        word = word + " " + list.get(j);
                        n = (n - list.get(j).length()) - 1;

                        // System.out.println(i + " & " + n + " & " + j);
                        j++;
                        i++;
                        if (j == list.size()) {
                            break;
                        }

                    } while (n > list.get(j).length());
                }
            }

            // System.out.println(i + " & " + n);
            if (n > 0) {
                space = String.format("%" + n + "s", "");// add empty space
            }
            System.out.println("+" + word + space + "+");
            word = "";

        }
        // print + in last
        for (int i = 0; i < size + 2; i++) {
            System.out.print("+");
        }
        System.out.println("");
    }
}