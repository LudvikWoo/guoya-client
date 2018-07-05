package com.guoyasoft.bean.api.interview.summary;

public class Resume {
	private Integer resumeId;

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	@Override
	public String toString() {
		return "Resume [resumeId=" + resumeId + "]";
	}

}
