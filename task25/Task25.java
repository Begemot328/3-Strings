package by.module3.task25;

import java.io.IOException;

/*  @author Yury Zmushko
 * 	Task 2.5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 * 
 */

public class Task25 {
	
	public static void main(String[] args) {
		String line = "Formiddable area. Am I right?";
		//String line = "SSSSSSSSSSSSS";
		String letter = "a";
		int quantity;
		
		quantity = 0;
		quantity = getQuantity(line, letter);
		// Вывод результата
		System.out.println("Буква встречается " + quantity 
						+ " раз  в предложении: " + line);	
	}

	public static int getQuantity(String line, String letter) {
		int quantity;
		int index;
		
		index = 0;
		quantity = 0;
		line = line.toLowerCase();
		index = line.indexOf(letter);
		if (index == -1) {
			return 0;
		}
		do {
			index = line.indexOf(letter, index + 1);
			quantity++;
			System.out.println("index " + index);	
		} while (index >=0);
		return quantity;
	}
}

