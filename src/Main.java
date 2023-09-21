public class Main {
    public static void main(String[] args) {
        //1.storing and calling the add method
        int resultOne=add(7,11);
        System.out.println(resultOne);

        //2.storing and calling the greeting method
        String resultTwo=greeting("Yoshi");
        System.out.println(resultTwo);

        //3.storing and calling the add2 method
        int resultThree=add(1,2,3,4);
        System.out.println(resultThree);

        //4.calling the printMe method
        printMe("Hello World");

    }
    //1.add method
    public static int add(int numOne,int numTwo) {
        return numOne + numTwo;
    }
    //2.greeting method
    public static String greeting(String name){
        return "Bonjour, "+name+"!";
    }
    //3.add2 method
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int sumOne=add(numOne, numTwo);
        int sumTwo=add(numThree, numFour);
        return add(sumOne, sumTwo);
    }
    //4.printMe method
    public static void printMe(String input){
        System.out.println(input);
    }

}
