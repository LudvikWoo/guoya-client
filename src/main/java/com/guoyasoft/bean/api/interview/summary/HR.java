package com.guoyasoft.bean.api.interview.summary;

import java.util.Date;

public class HR {
	private HRCompany hrCompany;
	 private Integer hrId;

	    private String hrName;

	    private String hrWeichat;

	    private String hrQq;

	    private String hrMobilePhone;

	    private String hrTelPhone;

	    private String hrEmail;

	    private Integer hrHrCompanyId;

	    private Integer hrStatus;

	    private Date hrCreateTime;

	    private Date hrUpdateTime;

		public HRCompany getHrCompany() {
			return hrCompany;
		}

		public void setHrCompany(HRCompany hrCompany) {
			this.hrCompany = hrCompany;
		}

		public Integer getHrId() {
			return hrId;
		}

		public void setHrId(Integer hrId) {
			this.hrId = hrId;
		}

		public String getHrName() {
			return hrName;
		}

		public void setHrName(String hrName) {
			this.hrName = hrName;
		}

		public String getHrWeichat() {
			return hrWeichat;
		}

		public void setHrWeichat(String hrWeichat) {
			this.hrWeichat = hrWeichat;
		}

		public String getHrQq() {
			return hrQq;
		}

		public void setHrQq(String hrQq) {
			this.hrQq = hrQq;
		}

		public String getHrMobilePhone() {
			return hrMobilePhone;
		}

		public void setHrMobilePhone(String hrMobilePhone) {
			this.hrMobilePhone = hrMobilePhone;
		}

		public String getHrTelPhone() {
			return hrTelPhone;
		}

		public void setHrTelPhone(String hrTelPhone) {
			this.hrTelPhone = hrTelPhone;
		}

		public String getHrEmail() {
			return hrEmail;
		}

		public void setHrEmail(String hrEmail) {
			this.hrEmail = hrEmail;
		}

		public Integer getHrHrCompanyId() {
			return hrHrCompanyId;
		}

		public void setHrHrCompanyId(Integer hrHrCompanyId) {
			this.hrHrCompanyId = hrHrCompanyId;
		}

		public Integer getHrStatus() {
			return hrStatus;
		}

		public void setHrStatus(Integer hrStatus) {
			this.hrStatus = hrStatus;
		}

		public Date getHrCreateTime() {
			return hrCreateTime;
		}

		public void setHrCreateTime(Date hrCreateTime) {
			this.hrCreateTime = hrCreateTime;
		}

		public Date getHrUpdateTime() {
			return hrUpdateTime;
		}

		public void setHrUpdateTime(Date hrUpdateTime) {
			this.hrUpdateTime = hrUpdateTime;
		}

		@Override
		public String toString() {
			return "HR [hrCompany=" + hrCompany + ", hrId=" + hrId
					+ ", hrName=" + hrName + ", hrWeichat=" + hrWeichat
					+ ", hrQq=" + hrQq + ", hrMobilePhone=" + hrMobilePhone
					+ ", hrTelPhone=" + hrTelPhone + ", hrEmail=" + hrEmail
					+ ", hrHrCompanyId=" + hrHrCompanyId + ", hrStatus="
					+ hrStatus + ", hrCreateTime=" + hrCreateTime
					+ ", hrUpdateTime=" + hrUpdateTime + "]";
		}
	    
}
