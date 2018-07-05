package com.guoyasoft.bean.api.interview.summary;

public class Job {
	 private Integer jobId;

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + "]";
	}
	 
}
