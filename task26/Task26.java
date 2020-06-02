package by.module3.task26;

/*  @author Yury Zmushko
 * 	Task 2.6. Из заданной строки получить новую, повторив каждый символ дважды. 
 * 
 */

public class Task26 {
	
	public static void main(String[] args) {
		String line = "Formiddable area. Am I right?";
		//String line = "SSSSSSSSSSSSS";
		String doubleLine;
		// Преобразование строки
		doubleLine = new String();
		doubleLine = getDoubleLine(line);
		// Вывод результата
		System.out.println("Результат: " + doubleLine);	
	}

	public static String getDoubleLine(String line) {
		String doubleLine;
		
		doubleLine = new String();
		for (int i = 0; i < line.length(); i++) {
			doubleLine = (doubleLine + line.charAt(i)) + line.charAt(i);
		}
		return doubleLine;
	}
}

