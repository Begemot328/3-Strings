package by.module3.task27;

/*  @author Yury Zmushko
 * 	Task 2.7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde 
def", то должно быть выведено "abcdef". 
 * 
 */

public class Task27 {
	public static final String BLANK = " ";
	
	public static void main(String[] args) {
		String line = "Formiddable area. Am I right?";
		//String line = "SSSSSSSSSSSSS";
		String resultLine;
		// Преобразование строки
		resultLine = new String();
		resultLine = removeDuplicates(line);
		// Вывод результата
		System.out.println("Результат: " + resultLine);	
	}

	public static String removeDuplicates(String line) {
		String resultLine;
		String spareLine;
		
		resultLine = "";
		spareLine = "";
		for (int i = 0; i < line.length(); i++) {
			if (!String.valueOf(line.charAt(i)).contentEquals(BLANK)) {
				if (!spareLine.contains(String.valueOf(line.charAt(i)))) {
					spareLine += line.charAt(i);
					resultLine += line.charAt(i);
				}
			}
		}
		return resultLine;
	}
}

