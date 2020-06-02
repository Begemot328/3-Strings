package by.module3.task14;


/*  @author Yury Zmushko
 * 	Task 1.4. В строке найти количество чисел.
 * 
 */

public class Task14 {
	
	public static void main(String[] args) {
		String var;
		int numbers;
		
		numbers = 0;
		// исходные данные
		var = "Hello, Word1. You 3 have my word,39 You'll have a reword111!!1)";
		// преобразование
		numbers = calcuateNumbers(var);
		// Вывод результатов
			System.out.println("Строка " + var + " содержит " + numbers + " чисел");
	}
	
	public static int calcuateNumbers(String var) {
		int numbers;
		boolean number;
		
		numbers = 0;
		number = false;
		for (int i = 0; i < var.length(); i++) {
			if (checkIsDigit(var.charAt(i))) {
				number = true;
			} else {
				if (number) {
					numbers++;	
					number = false;
				}
			}
		}
		if (number) {
			numbers++;	
		}
		return numbers;
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

