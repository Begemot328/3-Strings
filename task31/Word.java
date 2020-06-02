package by.module3.task31;

import java.util.ArrayList;

public class Word implements TextPart {
	String word;
	
	public Word(String textPart) {
		//System.out.println("*PARSE WORD*[" + textPart + "]***");
		word = textPart;
	}
	public void parse(String textPart) {
		//System.out.println("*PARSE WORD*[" + textPart + "]***");
		word = textPart;
	}
	public String toString() {
		return word;
	}
	
}
