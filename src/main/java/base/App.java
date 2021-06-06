package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int euros = myApp.getEuros();
        float exRate = myApp.getExchangeRate();
        float dollarAmount = myApp.convertToDollars(euros, exRate);

        myApp.printOutput(euros, exRate, dollarAmount);
    }

    public void printOutput(int euros, float exRate, float dollars) {
        System.out.printf("%d euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euros, exRate, dollars);
    }

    public float convertToDollars(int euros, float exRate) {
        return euros * exRate;
    }

    public float getExchangeRate() {
        System.out.printf("What is the exchange rate? ");
        return Float.parseFloat(in.nextLine());
    }

    public int getEuros() {
        System.out.printf("How many euros are you exchanging? ");
        return Integer.parseInt(in.nextLine());
    }
}
