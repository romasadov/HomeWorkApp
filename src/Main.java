public class Main {
    public static void main(String[] args) {
      //  printThreeWords();
        //  checkSumSing();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSing(){
        int a = 10,b = 22;

        int sum = a + b;
        if (sum >=0){
            System.out.println("Сумма Положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }
    public static void printColor(){
        int value = 8;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100 ) {
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 19, b = 44;
        if (a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }


}