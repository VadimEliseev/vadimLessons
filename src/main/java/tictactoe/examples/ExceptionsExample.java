package tictactoe.examples;

public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
            System.out.println("OK");
        } catch (Error e) {
            System.out.println("file not found");
        } catch (RuntimeException e) {
            System.out.println("division by zero");
        }

        try {
            System.out.println(divide(10, 0));
        } catch (DivisionByZero divisionByZero) {
            System.out.println("division by zero");
        }

    }

    public static int divide(int a, int b) throws DivisionByZero {
        if (b == 0) {throw new DivisionByZero();}
        else return a / b;
    }
}

class DivisionByZero extends Exception{}
