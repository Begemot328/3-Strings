package by.module3.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text implements TextPart {
	ArrayList<TextPart> list = new ArrayList<TextPart>();
	public ArrayList<TextPart> getList() {
		return list;
	}

	public void setList(ArrayList<TextPart> list) {
		this.list = list;
	}
	final static String regExp = "(.*[^\n\r\f\t]*)([\n\r\f\t]*)";
	Pattern pattern = Pattern.compile(regExp); 
	
	public Text(String textPart) {
		this.parse(textPart);
	}
	
	public void parse(String textPart) {
		Matcher matcher = pattern.matcher(textPart);

		//System.out.println("*PARSE TEXT*[" + textPart + "]***");
		while (matcher.find()) {
			if (!matcher.group(1).isEmpty()) {
				list.add(new Paragraph(matcher.group(1)));
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
