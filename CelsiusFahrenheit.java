/*
* Wim Felix Mossige
* Modul 6
* Celsius Fahrenheit
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class CelsiusFahrenheit {
	
	
	public static void main(String[] args) {

		String celsiusH = 		"Celsius";
		String fahrenheitH = 	"Fahrenheit";
		String rom = "     ";
	
		String heading = (celsiusH + rom + fahrenheitH + rom + "|" + rom + fahrenheitH + rom + celsiusH);
		System.out.print(heading + "\n");
		for (int i = 1; i <= heading.length(); i++)
			System.out.print("-");
		System.out.print("\n");




		DecimalFormat df = new DecimalFormat("#.0");
		
		double celsius = 40, fahrenheit = 120, fahrenheitConverted, celsiusConverted;

		
		
		for (int i = 0 ; i < 10; i++) {
			celsius = 40-i;
            fahrenheit = 120-10*i;
			celsiusConverted = celsiusToFahrenheit(celsius);
			fahrenheitConverted = fahrenheitToCelsius(fahrenheit);

			System.out.printf("%-12.1f", celsius);
            System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
            System.out.printf("     %-15.1f", fahrenheit);
            System.out.printf("%-7.2f\n", fahrenheitToCelsius(fahrenheit));


			
			
		}
	}


	public static double celsiusToFahrenheit(double x) {
		double y = (9.0/5) * x + 32;
		return y;
	}
	public static double fahrenheitToCelsius(double x) {
		double y = (5.0/9) * (x - 32);
		return y;
	}








}