package by.module3.task24;

import java.io.IOException;

/*  @author Yury Zmushko
 * 	Task 2.4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 * 
 */

public class Task24 {
	
	public static void main(String[] args) {
		String info = "информатика";
		String cake = "торт";
		char[] data = new char[10];
		data[0] = info.charAt(7);
		data[1] = info.charAt(3);
		data[2] = info.charAt(4);
		data[3] = info.charAt(7);
		cake = String.copyValueOf(data);
		// Вывод результата
		System.out.print("Слово: " + cake);	
	}
}

