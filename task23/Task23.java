package by.module3.task23;

import java.io.IOException;

/*  @author Yury Zmushko
 * 	Task 2.3. Проверить, является ли заданное слово палиндромом.
 * 
 */

public class Task23 {
	public static final String BLANK = " ";
	
	public static void main(String[] args) {
		String[] words = {"палиндром", "кот пес", " заказ", "Отто", "Томмот "};

		// проверка
		for (int i = 0; i < words.length; i++) {
			System.out.print("Слово " + words[i]);
			try {
				if (checkPalindrom(words[i])) {
					System.out.print(" является палиндромом");
				} else {
					System.out.print(" не является палиндромом");
				}
			} catch (IOException e) {
				System.out.print(" Неверный ввод - слово " + words[i] + " " + e.getMessage());
			}
			System.out.println();			
		}
	}
	
	public static boolean checkPalindrom(String var) throws IOException {
		int half;
		String word;
		boolean isPalindrom;
		
		isPalindrom = true;
		half = 0;		
		word = var.trim().toLowerCase();
		if(word.contains(BLANK)) {
			throw new IOException("Wrong input - no blanks!");
		}
		half = word.length() / 2;
		for (int i = 0; i < half; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				isPalindrom = false;
			}
		}
		return isPalindrom;
	}
}

