/**
* Java 1. HomeWork - 3
*
* @author Pavel Pulyk
* @version 11.11.2021
*/

import java.util.Arrays;


class HomeWork3 {

    public static void main(String[] args) {
        invertArray(); // задание №1
        fillArray(); // задание №2
        changeArray(); // задание №3 
        fillDiagonal(); // задание №4
        System.out.println("initialValue"); // задание №5
    }

        // задание №1
        static void invertArray() {
            int[] arr = {1, 0, 1, 0, 1};
            int maxArr = arr.length;
                for(int i = 0; i < maxArr; i++){
                    System.out.print (i + "-" + arr[i]+" ");
                }
                System.out.println("");
            for(int i = 0; i < maxArr; i++)
                if(arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            for(int i = 0; i < maxArr; i++){
                System.out.print (i + "-" + arr[i]+" ");
            }
        }

        // задание №2
        static void fillArray() {
            int[] arr = new int [100];
                for(int i = 0; i < arr.length; i++)
                arr[i] = i+1;
            System.out.println(Arrays.toString(arr));
        }

        // задание №3
        static void changeArray() {
            int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
                for(int i = 0; i < arr.length; i++) {
                    if (arr[i] < 6) 
                    arr[i] = arr[i] * 2;  
                }
            System.out.println(Arrays.toString(arr));
        }

        // задание №4
        static void fillDiagonal() {
          //int[][] arr = {{1,0,0,1}, {0,1,1,0}, {0,1,1,0}, {1,0,0,1}};
            int[][] arr = {{1,0,0,0,1}, {0,1,0,1,0}, {0,0,1,0,0}, {0,1,0,1,0}, {1,0,0,0,1}};
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                System.out.println();
                }
        }

          // задание №5
        static int[] returLenArray(int len, int initialValue) {
            int arr[] = new int[len];
                for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;
                }
            return arr;
        }
}






