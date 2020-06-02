package by.module3.task15;


/*  @author Yury Zmushko
 * 	Task 1.5. Удалить в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих пробелов  заменить на  одиночные  пробелы. 
Крайние пробелы в строке удалить. 
 * 
 */

public class Task15 {
	
	public static final String BLANK = " ";
	public static final String DOUBLE_BLANK = "  ";
	
	public static void main(String[] args) {
		String var;
		
		// исходные данные
		var = " Hello,    Word1. You  3 have m y  word,39 You'll have a reword111!!1) ";
		// преобразование
		var = removeExcessBlanks(var);
		// Вывод результатов
			System.out.println("Строка - результат: |" + var + "|");
	}
	
	public static String removeExcessBlanks(String var) {
		
		var = var.trim();
		while (var.contains(DOUBLE_BLANK)) {
			var = var.replace(DOUBLE_BLANK, BLANK);
		}
		return var;
	}
}

