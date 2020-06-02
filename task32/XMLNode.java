package by.module3.task32;

public class XMLNode {
	private NodeType type;
	private String value;
	
	public XMLNode(String s) {
		value = s;
	}
	
	public XMLNode(String value, NodeType type) {
		this.value = value;
		this.type = type;
	}
	
	public String getDescription() {
		return "Tag \"" + this.value + "\"  type " + this.type;
	}

}
