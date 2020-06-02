package by.module3.task32;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLAnalyzer {
	final static String regExpTag = "<.+?>";
	final static String regExpOpeningTag = "<[.[^/]]+?>";
	final static String regExpClosingTag = "</.+?>";
	final static String regExpClosedTag = "<.+?/>";
	
	private static XMLAnalyzer instance;
	private Pattern pattern;
	private Matcher matcherTag;
	private String text;
	private int startingIndex = 0;
	private boolean skip = false;
	private XMLNode nextNode;
	private Pattern patternOpeningTag;
	private Pattern patternClosingTag;
	private Pattern patternClosedTag;
	
	
	private XMLAnalyzer() {
		pattern = Pattern.compile(regExpTag);
		patternOpeningTag = Pattern.compile(regExpOpeningTag);
		patternClosingTag = Pattern.compile(regExpClosingTag);
		patternClosedTag = Pattern.compile(regExpClosedTag);
	}
	
	public static XMLAnalyzer getInstance () {
		if (instance == null) {
			instance = new XMLAnalyzer();
		}
		return instance;
	}
	
	public boolean parseNext() {
		boolean result = false;
		if (skip) {
			skip = false;
			nextNode = createNode(matcherTag.group());
			return true;
		}
		result = matcherTag.find();
		if (result) {
			if (startingIndex < matcherTag.start()) {
				skip = true;
				nextNode = new XMLNode(text.substring(startingIndex, matcherTag.start()), NodeType.TEXT);
			}
			nextNode = createNode(matcherTag.group());
		}
		return result;
	}
	
	private XMLNode createNode(String s) {
		NodeType type;
		Matcher matcherOpeningTag = patternOpeningTag.matcher(s);
		Matcher matcherClosingTag = patternClosingTag.matcher(s);
		Matcher matcherClosedTag = patternClosedTag.matcher(s);
		if (matcherOpeningTag.find()) {
			type = NodeType.OPENING_TAG;
		} else if (matcherClosingTag.find()) {
			type = NodeType.CLOSING_TAG;
		} else if (matcherClosedTag.find()) {
			type = NodeType.CLOSED_TAG;
		} else {
		type = NodeType.TEXT;
		}
		return new XMLNode(s, type);
	}

	public XMLNode nextNode() {
		return nextNode;
	}

	public void setText(String text) {
		this.text = text.trim();
		startingIndex = 0;
		skip = false;
		matcherTag = pattern.matcher(text);
	}
}
	