import java.util.Scanner;

public class test {

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

     String spacing = "     ";
        String firstLine = "Celsius" + spacing + "Fahrenheit" + spacing + "|"
        + spacing + "Fahrenheit" + spacing + "Celsius";
        System.out.println(firstLine);
        
        for (int i = 1 ; i <= firstLine.length(); i++)
              System.out.print("-");
        
        System.out.println();
        
        double celsius, fahrenheit;
        
        for (int i = 0 ; i < 10; i++) {
            celsius = 40-i;
            fahrenheit = 120-10*i;
            System.out.printf("%-12.1f", celsius);
            System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
            System.out.printf("     %-15.1f", fahrenheit);
            System.out.printf("%-7.2f\n", fahrenheitToCelsius(fahrenheit));
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return 9.0/5*celsius+32;
        
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return 5.0/9*(fahrenheit - 32);
    }


}

