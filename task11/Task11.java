package by.module3.task11;

import java.util.Scanner;

/*  @author Yury Zmushko
 * 	Task 1.1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 * 
 */

public class Task11 {
	public static final String LOW_LINE = "_"; 
	
	public static void main(String[] args) {
		String[] vars = new String[20];
		// исходные данные
		vars[0] = "camelCase";
		vars[1] = "snakeCase";
		vars[2] = "bullCase";
		vars[3] = "cowCase";
		vars[4] = "lionCase";
		vars[5] = "aLionCaseA";	
		// преобразование
		convertStringArray(vars);
		// Вывод результатов
		for (int i = 0; i < vars.length; i++) {
			if (vars[i] == null || vars[i].isEmpty()) {
				break;
			}
			System.out.println(vars[i]);
		}
	}
	public static void convertStringArray(String[] vars) {
		String symbol;
		String newValue;
		int startIndex;
		
		symbol = new String();
		newValue = new String();
		startIndex = 0;
		
		for (int i = 0; i < vars.length; i++) {
			if (vars[i] == null || vars[i].isEmpty()) {
				break;
			}
			startIndex = 0;
			newValue = new String();
			for (int j = 1; j < vars[i].length(); j++) {
				symbol = String.valueOf(vars[i].charAt(j));
				if (!symbol.toLowerCase().equals(symbol)) {
					newValue += vars[i].substring(startIndex, j).toLowerCase() + LOW_LINE;
					startIndex = j;
				}
			}
			newValue += vars[i].substring(startIndex, vars[i].length()).toLowerCase();
			vars[i] = newValue;
		}
	}
}
