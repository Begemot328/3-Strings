package by.module3.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence implements TextPart {
	final static String regExp = "([A-Za-zа-яА-Я0-9]*)([.[^A-Za-zа-яА-Я0-9]]*)";
	
	private ArrayList<TextPart> list = new ArrayList<TextPart>();
	
	Pattern pattern = Pattern.compile(regExp);
		
	public Sentence(String textPart) {
		this.parse(textPart);
	}
	
	public ArrayList<TextPart> getList() {
		return list;
	}
	
	public void parse(String textPart) {
		Matcher matcher = pattern.matcher(textPart);
		//System.out.println("*PARSE SENTENCE*[" + textPart + "]***");
		while (matcher.find()) {
			//System.out.println("*GROUP0*[" + matcher.group(0) + "]***");
			//System.out.println("*GROUP1*[" + matcher.group(1) + "]***");
			//System.out.println("*GROUP2*[" + matcher.group(2) + "]***");
			if (!matcher.group(1).isEmpty()) {
				list.add(new Word(matcher.group(1)));
			}
			if (!matcher.group(2).isEmpty()) {
				list.add(new PunctuationMark(matcher.group(2)));
			}
		}
	}
	
	public String toString() {
		String result = new String();
		Iterator<TextPart> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			result += iterator.next().toString();
		}
		return result;
	}	
}
