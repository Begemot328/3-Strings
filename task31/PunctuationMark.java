package by.module3.task31;

import java.util.ArrayList;

public class PunctuationMark implements TextPart {
	String mark;
	
	public PunctuationMark(String textPart) {
		//System.out.println("*PARSE MARK*[" + textPart + "]***");
		this.mark = textPart;
	}
	
	public void parse(String textPart) {
		//System.out.println("*PARSE MARK*[" + textPart + "]***");
		this.mark = textPart;
	}
	
	public String toString() {
		return mark;
	}
}
