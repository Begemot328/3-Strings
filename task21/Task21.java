package by.module3.task21;


/*  @author Yury Zmushko
 * 	Task 2.1. Дан текст (строка). Найдите наибольшее количество подряд идущих 
 *  пробелов в нем. 
 * 
 */

public class Task21 {
	
	public static final String BLANK = " ";
	
	public static void main(String[] args) {
		String var;
		int blankQuantity;
		
		blankQuantity = 0;
		// исходные данные
		var = "1 2  3   4    5     .";
		//var = "0!";
		// преобразование
		blankQuantity = countBlanks(var);
		// Вывод результатов
		System.out.println("Максимальное кол-во пробелов в строке - " + blankQuantity);
	}
	
	public static int countBlanks(String var) {
		int maxBlanks;
		int counter;
		String blanks;
		
		maxBlanks = 0;
		counter = 0;
		blanks  = BLANK;
		while (var.contains(blanks)) {
			blanks += BLANK;
			counter++;
		}
		return counter;
	}
}

