class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords1();
        printThreeWords2();
        checkSumSing();
        printColor();
        compareNumbers();

    }

        static void printThreeWords1() {
            String message = "Orange-1";
            System.out.println(message);  
            message = "Banana-1";
            System.out.println(message);  
            message = "Apple-1";
            System.out.println(message);  
        }

         static void printThreeWords2() {
            System.out.println("Orange-2");  
            System.out.println("Banana-2");  
            System.out.println("Apple-2"); 
        }

        static void checkSumSing() {
            int a = 3;
            int b = -17;
            int c =a+b;
            System.out.println("Сумма " + (c >= 0? "положительная" : "отрицательная"));  
        }


        static void printColor() {
            int value = 200;

            if (value <0) {
            System.out.println("Красный");    
            }
            if (value >0 && value <= 100) {
            System.out.println("Желтый");
            }
            if (value > 100) { 
            System.out.println("Зеленый");
            } 
        }
     
        static void compareNumbers() {
            int a = 10;
            int b = 7;

            if (a >= b) {
            System.out.println("a >= b");    
            }
            if (a < b) {
            System.out.println("a < b");
            }
        }     

    }	