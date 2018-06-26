package com.guoyasoft.bean.api.interview;

import java.util.ArrayList;
import java.util.List;

import com.guoyasoft.bean.api.SelectOption;

public class InterviewQueryInitBean {

	private List<SelectOption> classSelect=new ArrayList<SelectOption>();
	private List<SelectOption> progressSelect=new ArrayList<SelectOption>();
	private List<SelectOption> resultSelect=new ArrayList<SelectOption>();
	public List<SelectOption> getClassSelect() {
		return classSelect;
	}
	public void setClassSelect(List<SelectOption> classSelect) {
		this.classSelect = classSelect;
	}
	public List<SelectOption> getProgressSelect() {
		return progressSelect;
	}
	public void setProgressSelect(List<SelectOption> progressSelect) {
		this.progressSelect = progressSelect;
	}
	public List<SelectOption> getResultSelect() {
		return resultSelect;
	}
	public void setResultSelect(List<SelectOption> resultSelect) {
		this.resultSelect = resultSelect;
	}

}
