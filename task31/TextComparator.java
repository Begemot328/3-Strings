package by.module3.task31;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class TextComparator implements Comparator<TextPart> {
	private TextPartEnum sortingIndex;
	Class textpart;
	char defineChar; 
	
	public TextComparator(TextPartEnum sortingIndex) {
		this.sortingIndex = sortingIndex;
	}
	@Override
	public int compare(TextPart part1, TextPart part2) {
		switch (sortingIndex) {
		case WORD_LENGHT:
			return part1.toString().length() - part2.toString().length();
		case DEFINE_CHAR_QUANTITY:
			return part1.toString().split(String.valueOf(defineChar)).length 
					- part2.toString().split(String.valueOf(defineChar)).length;
		case SENTENCE_QUANTITY:
			return ((Paragraph) part1).getList().size() - ((Paragraph) part2).getList().size();
		default:
			throw new EnumConstantNotPresentException(TextPartEnum.class, sortingIndex.name());
		}
	}
	
	public char getDefineChar() {
		return defineChar;
	}
	public void setDefineChar(char defineChar) {
		this.defineChar = defineChar;
	}
	
	public ArrayList<TextPart> purify (ArrayList<TextPart> list) {
		ArrayList<TextPart> resultList = (ArrayList<TextPart>) list.clone();
		//System.out.println(list.size());
		switch (sortingIndex) {
		case WORD_LENGHT:
			this.textpart = Word.class;
			break;
		case DEFINE_CHAR_QUANTITY:
			this.textpart = Word.class;
			break;
		case SENTENCE_QUANTITY:
			this.textpart = Paragraph.class;
			break;
		default:
			throw new EnumConstantNotPresentException(TextPartEnum.class, sortingIndex.name());
		}
		this.clear(resultList);
		//System.out.println(resultList.size());
		return resultList;
	}
	
	public TextPartEnum getSortingIndex() {
		return sortingIndex;
	}
	public void setSortingIndex(TextPartEnum sortingIndex) {
		this.sortingIndex = sortingIndex;
	}
	private void clear(ArrayList<TextPart> resultList) {
		Iterator<TextPart> iterator = resultList.iterator();
		while (iterator.hasNext()) {
			if (!this.textpart.isInstance(iterator.next())) {
				iterator.remove();
			} 
		}
	}
}