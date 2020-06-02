package by.module3.task31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*  @author Yury Zmushko
 * 	Task 3.1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
 * алфавиту.
 */

public class Task31 {
	public static void main(String[] args) {
		String textString = "Бассейн спортивного комплекса Академии управления имеет 4 плавательные дорожки, его длина – 25 м, ширина – 12 м, глубокая часть – 200 см, мелкая часть – 140 см. " + 
				"Постоянно в любое время года поддерживается температура воды от +27° до +28°С. Имеется электронное табло температуры воздуха и времени.\n" + 
				"В бассейне проходят занятия по аквааэробике под руководством опытного инструктора. Во время занятий Вы полностью снимете нагрузку на опорно-двигательный аппарат, напряжение и стресс, получите море положительных эмоций.\n" + 
				"Занятия в бассейне позволят снять психоэмоциональное напряжение и укрепить иммунную систему.";

		ArrayList<TextPart> list = new ArrayList<TextPart>();
		int i = 1;
		char defineChar = 'с';
		
		Text text = new Text(textString);
		System.out.println(text);
		// Создание объекта - компаратора
		TextComparator comparator = new TextComparator(TextPartEnum.SENTENCE_QUANTITY);
		list = text.getList();
		// Очистка объекта перед сортировкой - оставляем объекты только одного типа
		list = comparator.purify(list);
		// Сортировка
		Collections.sort(list, comparator);
		// Вывод
		Iterator<TextPart> iterator = list.iterator();
		System.out.println("Вывод абзацев, отсортированных по кол-ву предложений");
		while (iterator.hasNext()) {
			System.out.println(i + ". " + iterator.next());
			i++;
		}
		// Берем первое предложение первого абзаца для дальнейшей работы
		Paragraph paragraph = new Paragraph("");
		if (list.get(0) instanceof Paragraph) {
			paragraph = (Paragraph) list.get(0);
		}
		list = paragraph.getList();
		Sentence sentence = new Sentence("");
		if (list.get(0) instanceof Sentence) {
			sentence = (Sentence) list.get(0);
		} else if (list.get(0) instanceof Sentence) {
			sentence = (Sentence) list.get(1);
		}
		// Сортировка
		comparator.setSortingIndex(TextPartEnum.WORD_LENGHT);
		list = comparator.purify(sentence.getList());
		Collections.sort(list, comparator);
		iterator = list.iterator();
		i = 1;
		// Вывод
		System.out.println("Вывод слов, отсортированных по длине");
		while (iterator.hasNext()) {
			System.out.println(i + ". " + iterator.next());
			i++;
		}
		// Сортировка
		comparator.setSortingIndex(TextPartEnum.DEFINE_CHAR_QUANTITY);
		list = comparator.purify(sentence.getList());
		comparator.setDefineChar(defineChar);
		Collections.sort(list, comparator);
		iterator = list.iterator();
		i = 1;
		// Вывод
		System.out.println("Вывод слов, отсортированных по количеству вхождений символа " + defineChar);
		while (iterator.hasNext()) {
			System.out.println(i + ". " + iterator.next());
			i++;
		}
	}
}
