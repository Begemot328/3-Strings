package by.module3.task12;

import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.2. Замените в строке все вхождения 'word' на 'letter'. 
 * 
 */

public class Task12 {
	public static final String LOW_LINE = "_"; 
	
	public static void main(String[] args) {
		String var;
		String oldWord;
		String newWord;
		// исходные данные
		oldWord = "word";
		newWord = "letter";
		var = "Hello, Word. You have my word, You'll have a reword!)";
		// преобразование
		var = convertString(var, oldWord, newWord);
		// Вывод результатов
			System.out.println(var);
	}
	
	public static String convertString(String var, String oldWord, String newWord) {
		String symbol;
		String newValue;
		int startIndex;
		
		symbol = new String();
		newValue = new String();
		startIndex = 0;
		
		newValue = var.replace(oldWord, newWord);
		if (newValue.toLowerCase().contains(oldWord.toLowerCase())) {
			newValue = newValue.replace(convertFirstLetter(oldWord), convertFirstLetter(newWord));
		}
		return newValue;
	}
	
	public static String convertFirstLetter(String s) {
		String newValue;

		newValue = s.replace(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(0)).toUpperCase());  
		return newValue;
	}
}

