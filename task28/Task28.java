package by.tasks.task28;

/*  @author Yury Zmushko
 * 	Task 2.8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых 
 *	длинных слов может быть несколько, не обрабатывать.
 * 
 */

public class Task28 {
	public static final String BLANK = " ";
	
	public static void main(String[] args) {
		String line1 = "По бревну бредут  бобры";
		String line2 = "По бревну  бредут бобрищи ";
		String line3 = " бревышку по бредут бобрищи";
		
		String resultLine1;
		String resultLine2;
		String resultLine3;
		// Преобразование строки
		resultLine1 = new String();
		resultLine2 = new String();
		resultLine3 = new String();
		resultLine1 = findLongestWord(line1);
		resultLine2 = findLongestWord(line2);
		resultLine3 = findLongestWord(line3);
		// Вывод результата
		System.out.println("Результат №1:" + resultLine1);	
		System.out.println("Результат №2:" + resultLine2);	
		System.out.println("Результат №3:" + resultLine3);	
	}

	public static String findLongestWord(String line) {
		String resultLine;
		String wordLine;
		int indexBlank;
		
		wordLine = new String();
		resultLine = new String();
		indexBlank = - 1;
		
		while (line.indexOf(BLANK, indexBlank + 1) >= 0) {
			wordLine = line.substring(indexBlank + 1, line.indexOf(BLANK, indexBlank + 1));
			if (wordLine.length() > resultLine.length()) {
				resultLine = wordLine;
			}
			indexBlank = line.indexOf(BLANK, indexBlank + 1);
		}
			wordLine = line.substring(indexBlank + 1, 
					line.length());
			if (wordLine.length() > resultLine.length()) {
				resultLine = wordLine;
			}
		return resultLine;
	}
}

