/** 
* Java 1. HomeWork - 2
*
* @author Pavel Pulyk
* @version 08.11.2021
*/
class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(within10and20(3, 2));
        System.out.println(within10and20(10, 5));
        System.out.println(within10and20(10, 20));
        isPositiveOrNegative(5);
        isPositiveOrNegative(-5);
        System.out.println(isNegative(-10));
        System.out.println(isNegative(10));
        printWord3Times();
    }

    static boolean within10and20(int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
    }   

    /* другой способ решения задания №1  
    static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }*/

    static void isPositiveOrNegative(int a) {
        if (a >= 0); 
            System.out.println("The number is " + (a >=0? "positive" : "negative"));
    }

    /* другой способ решения задания №2
    static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }*/

    static boolean isNegative(int a) {
        return a < 0;
    }

    /* другой способ решения задания №3
    static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }*/

    static void printWord3Times() {
        for (int i =0; i < 3; i++) {
            System.out.println("Hello");
        }
    }
} 
