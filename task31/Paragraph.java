package by.module3.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph implements TextPart {
	final static String regExp = "(.[^!?.\n\r\t]+)([.!?]+)";
	
	ArrayList<TextPart> list = new ArrayList<TextPart>();
	Pattern pattern = Pattern.compile(regExp); 
	
	public Paragraph(String textPart) {
		this.parse(textPart);
	}
	
	public void parse(String textPart) {
		Matcher matcher = pattern.matcher(textPart);
				
		//System.out.println("*PARSE PARAGRAPH*[" + textPart + "]***");
		while (matcher.find()) {
			if (!matcher.group(1).isEmpty()) {
				list.add(new Sentence(matcher.group(1)));
			}
			if (!matcher.group(2).isEmpty()) {
				list.add(new PunctuationMark(matcher.group(2)));
			}
		}
		
	}
	
	public ArrayList<TextPart> getList() {
		return list;
	}

	public void setList(ArrayList<TextPart> list) {
		this.list = list;
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
