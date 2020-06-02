package by.module3.task32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*  @author Yury Zmushko
*
* Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
* тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
* нельзя.
*/
public class Task32 {

	public static void main(String[] args) {
		File file = new File("text.xml");
		Scanner scan = null;
		String text = new String();
		// читаем из файла
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				text += scan.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// вывод прочитанного
		System.out.println("Text:");
		System.out.println(text);
		// создаем анализатор
		XMLAnalyzer analyzer = XMLAnalyzer.getInstance();
		analyzer.setText(text);
		
		// вывод результата
		System.out.println("Result:");
		while (analyzer.parseNext()) {
			System.out.println (analyzer.nextNode().getDescription());
		}
	}

}
