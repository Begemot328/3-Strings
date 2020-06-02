package by.module3.task30;

/*  @author Yury Zmushko
 * 	Task 2.10. Строка X состоит из нескольких предложений, каждое из которых
 *   кончается точкой, восклицательным или вопросительным знаком. Определить 
 *   количество предложений в строке X. 
 */

public class Task30 {
	public static final String BLANK = " ";
	
	public static void main(String[] args) {
		String line = "Formiddable area. Am I right? I'm right!";
		int tense;
		
		tense = 0;
		// Подсчет букв строки
		for (int i = 0; i < line.length(); i++) {
			if(checkIfPunctuationMark(line.charAt(i))) {
				tense++;
			}
		}
		// Вывод результата
		System.out.println("Строка " + line);	
		System.out.print("Содержит " + tense + " предложений");	
	}

	private static boolean checkIfPunctuationMark (char c) {
		final char exclamationMark = '!';
		final char questionMark = '?';
		final char dot = '.';
		
		boolean isPunctuationMark;
		isPunctuationMark = c == exclamationMark || c == questionMark || c == dot;
		return isPunctuationMark;
	}
}

