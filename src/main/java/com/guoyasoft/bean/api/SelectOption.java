package com.guoyasoft.bean.api;

public class SelectOption {
	

	public SelectOption(String value, String text, boolean selected) {
		super();
		this.value = value;
		this.selected = selected;
		this.text = text;
	}
	private String value;
	private String text;
	private boolean selected;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean getSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
