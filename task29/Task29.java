package by.module3.task29;

/*  @author Yury Zmushko
 * 	Task 2.9. Посчитать количество строчных (маленьких) и прописных (больших) 
 * 	букв в введенной строке. Учитывать только английские 
буквы. 
 * 
 */

public class Task29 {
	public static final String BLANK = " ";
	
	public static void main(String[] args) {
		String line = "Formiddable area. Am I right? Aa Zz Ыы Аа Бб";
		int smallLetters;
		int capitalLetters;
		
		smallLetters = 0;
		capitalLetters = 0;
		// Подсчет букв строки
		for (int i = 0; i < line.length(); i++) {
			if(checkIfSmallLetter(line.charAt(i))) {
				smallLetters++;
			}
			if(checkIfCapitalLetter(line.charAt(i))) {
				capitalLetters++;
			}
		}
		// Вывод результата
		System.out.println("Строка " + line);	
		System.out.print("Содержит " + smallLetters + " строчных букв");	
		System.out.println(" и " + capitalLetters + " заглавных букв");	
	}

	private static boolean checkIfCapitalLetter(char c) {
		final int A_CODE = 65;
		final int Z_CODE = 90;
		int code;
		boolean isCapital;
		
		isCapital = false;
		code = c;
		isCapital = code >= A_CODE && code <= Z_CODE;
		return isCapital;
	}

	private static boolean checkIfSmallLetter(char c) {
		final int AS_CODE = 97;
		final int ZS_CODE = 122;
		int code;
		boolean isSmall;
		
		isSmall = false;
		code = c;
		isSmall = code >= AS_CODE && code <= ZS_CODE;
		return isSmall;
	}
}

