package com.guoyasoft.bean.api.interview.summary;

import java.util.Date;

public class HRCompany {
	  private Integer hrCompanyId;

	    private String hrCompanyName;

	    private String hrCompanyAddr;

	    private Integer hrCompanyType;

	    private String hrCompanyDesc;

	    private Date hrCompanyCreateTime;

	    private Integer hrCompanyStatus;

	    private String hrCompanyAbbreviation;

	    private Date hrCompanyUpdateTime;

	    private Integer hrCompanyIsOutsource;

		public Integer getHrCompanyId() {
			return hrCompanyId;
		}

		public void setHrCompanyId(Integer hrCompanyId) {
			this.hrCompanyId = hrCompanyId;
		}

		public String getHrCompanyName() {
			return hrCompanyName;
		}

		public void setHrCompanyName(String hrCompanyName) {
			this.hrCompanyName = hrCompanyName;
		}

		public String getHrCompanyAddr() {
			return hrCompanyAddr;
		}

		public void setHrCompanyAddr(String hrCompanyAddr) {
			this.hrCompanyAddr = hrCompanyAddr;
		}

		public Integer getHrCompanyType() {
			return hrCompanyType;
		}

		public void setHrCompanyType(Integer hrCompanyType) {
			this.hrCompanyType = hrCompanyType;
		}

		public String getHrCompanyDesc() {
			return hrCompanyDesc;
		}

		public void setHrCompanyDesc(String hrCompanyDesc) {
			this.hrCompanyDesc = hrCompanyDesc;
		}

		public Date getHrCompanyCreateTime() {
			return hrCompanyCreateTime;
		}

		public void setHrCompanyCreateTime(Date hrCompanyCreateTime) {
			this.hrCompanyCreateTime = hrCompanyCreateTime;
		}

		public Integer getHrCompanyStatus() {
			return hrCompanyStatus;
		}

		public void setHrCompanyStatus(Integer hrCompanyStatus) {
			this.hrCompanyStatus = hrCompanyStatus;
		}

		public String getHrCompanyAbbreviation() {
			return hrCompanyAbbreviation;
		}

		public void setHrCompanyAbbreviation(String hrCompanyAbbreviation) {
			this.hrCompanyAbbreviation = hrCompanyAbbreviation;
		}

		public Date getHrCompanyUpdateTime() {
			return hrCompanyUpdateTime;
		}

		public void setHrCompanyUpdateTime(Date hrCompanyUpdateTime) {
			this.hrCompanyUpdateTime = hrCompanyUpdateTime;
		}

		public Integer getHrCompanyIsOutsource() {
			return hrCompanyIsOutsource;
		}

		public void setHrCompanyIsOutsource(Integer hrCompanyIsOutsource) {
			this.hrCompanyIsOutsource = hrCompanyIsOutsource;
		}

		@Override
		public String toString() {
			return "HRCompany [hrCompanyId=" + hrCompanyId + ", hrCompanyName="
					+ hrCompanyName + ", hrCompanyAddr=" + hrCompanyAddr
					+ ", hrCompanyType=" + hrCompanyType + ", hrCompanyDesc="
					+ hrCompanyDesc + ", hrCompanyCreateTime="
					+ hrCompanyCreateTime + ", hrCompanyStatus="
					+ hrCompanyStatus + ", hrCompanyAbbreviation="
					+ hrCompanyAbbreviation + ", hrCompanyUpdateTime="
					+ hrCompanyUpdateTime + ", hrCompanyIsOutsource="
					+ hrCompanyIsOutsource + "]";
		}
	    
}
