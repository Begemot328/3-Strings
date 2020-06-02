package by.module3.task13;

/*  @author Yury Zmushko
 * 	Task 1.3. В строке найти количество цифр. . 
 * 
 */

public class Task13 {
	
	public static void main(String[] args) {
		String var;
		int digits;
		
		digits = 0;
		// исходные данные
		var = "Hello, Word1. You 3 have my word,39 You'll have a reword111!)";
		// преобразование
		digits = calcuateDigits(var);
		// Вывод результатов
			System.out.println("Строка " + var + " содержит " + digits + " цифр");
	}
	
	public static int calcuateDigits(String var) {
		int digits;
		
		digits = 0;
		for (int i = 0; i < var.length(); i++) {
			if (checkIsDigit(var.charAt(i))) {
				digits++;	
			}
		}
		return digits;
	}
	
	public static boolean checkIsDigit(char var) {
		try {
			Integer.parseInt(String.valueOf(var));
			return true;
		} catch (Exception e) {
			return false;
		} 
	}
}
