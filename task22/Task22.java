package by.module3.task22;


/*  @author Yury Zmushko
 * 	Task 2.2. В строке вставить после каждого символа 'a' символ 'b'.
 * 
 */

public class Task22 {
	
	public static final String BLANK = " ";
	
	public static void main(String[] args) {
		String var;
		int blankQuantity;
		String oldChar = "o";
		String addChar = "b";

		// исходные данные
		var = " Hello, World. You  have m y  word, You'll have a reword!!!) ";
		
		// преобразование
		var = convertString(var, oldChar, addChar);
		// Вывод результатов
		System.out.println("Преобразованная строка - " + var);
	}
	
	public static String convertString(String var, String oldChar, String addChar) {
		
		var = var.replace(oldChar,  oldChar + addChar);
		return var;
	}
}

