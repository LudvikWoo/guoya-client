/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.bean.api.interview.query.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class AddInterview implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _sno;

    private java.lang.String _company;

    private java.lang.String _companyType;

    private java.lang.String _callTime;

    private java.lang.String _interviewDate;

    private java.lang.String _interviewTime;

    private java.lang.String _workTime;

    private java.lang.String _progress;

    private java.lang.String _result;

    private java.lang.String _expectSalary;

    private java.lang.String _realSalary;

    private java.lang.String _hrName;

    private java.lang.String _hrCompany;

    private java.lang.String _hrContactType;

    private java.lang.String _hrContact;

    private java.lang.String _hardTech;

    private java.lang.String _mark;


      //----------------/
     //- Constructors -/
    //----------------/

    public AddInterview() {
        super();
    } //-- com.guoyasoft.bean.api.interview.query.request.AddInterview()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'callTime'.
     * 
     * @return the value of field 'callTime'.
    **/
    public java.lang.String getCallTime()
    {
        return this._callTime;
    } //-- java.lang.String getCallTime() 

    /**
     * Returns the value of field 'company'.
     * 
     * @return the value of field 'company'.
    **/
    public java.lang.String getCompany()
    {
        return this._company;
    } //-- java.lang.String getCompany() 

    /**
     * Returns the value of field 'companyType'.
     * 
     * @return the value of field 'companyType'.
    **/
    public java.lang.String getCompanyType()
    {
        return this._companyType;
    } //-- java.lang.String getCompanyType() 

    /**
     * Returns the value of field 'expectSalary'.
     * 
     * @return the value of field 'expectSalary'.
    **/
    public java.lang.String getExpectSalary()
    {
        return this._expectSalary;
    } //-- java.lang.String getExpectSalary() 

    /**
     * Returns the value of field 'hardTech'.
     * 
     * @return the value of field 'hardTech'.
    **/
    public java.lang.String getHardTech()
    {
        return this._hardTech;
    } //-- java.lang.String getHardTech() 

    /**
     * Returns the value of field 'hrCompany'.
     * 
     * @return the value of field 'hrCompany'.
    **/
    public java.lang.String getHrCompany()
    {
        return this._hrCompany;
    } //-- java.lang.String getHrCompany() 

    /**
     * Returns the value of field 'hrContact'.
     * 
     * @return the value of field 'hrContact'.
    **/
    public java.lang.String getHrContact()
    {
        return this._hrContact;
    } //-- java.lang.String getHrContact() 

    /**
     * Returns the value of field 'hrContactType'.
     * 
     * @return the value of field 'hrContactType'.
    **/
    public java.lang.String getHrContactType()
    {
        return this._hrContactType;
    } //-- java.lang.String getHrContactType() 

    /**
     * Returns the value of field 'hrName'.
     * 
     * @return the value of field 'hrName'.
    **/
    public java.lang.String getHrName()
    {
        return this._hrName;
    } //-- java.lang.String getHrName() 

    /**
     * Returns the value of field 'interviewDate'.
     * 
     * @return the value of field 'interviewDate'.
    **/
    public java.lang.String getInterviewDate()
    {
        return this._interviewDate;
    } //-- java.lang.String getInterviewDate() 

    /**
     * Returns the value of field 'interviewTime'.
     * 
     * @return the value of field 'interviewTime'.
    **/
    public java.lang.String getInterviewTime()
    {
        return this._interviewTime;
    } //-- java.lang.String getInterviewTime() 

    /**
     * Returns the value of field 'mark'.
     * 
     * @return the value of field 'mark'.
    **/
    public java.lang.String getMark()
    {
        return this._mark;
    } //-- java.lang.String getMark() 

    /**
     * Returns the value of field 'progress'.
     * 
     * @return the value of field 'progress'.
    **/
    public java.lang.String getProgress()
    {
        return this._progress;
    } //-- java.lang.String getProgress() 

    /**
     * Returns the value of field 'realSalary'.
     * 
     * @return the value of field 'realSalary'.
    **/
    public java.lang.String getRealSalary()
    {
        return this._realSalary;
    } //-- java.lang.String getRealSalary() 

    /**
     * Returns the value of field 'result'.
     * 
     * @return the value of field 'result'.
    **/
    public java.lang.String getResult()
    {
        return this._result;
    } //-- java.lang.String getResult() 

    /**
     * Returns the value of field 'sno'.
     * 
     * @return the value of field 'sno'.
    **/
    public java.lang.String getSno()
    {
        return this._sno;
    } //-- java.lang.String getSno() 

    /**
     * Returns the value of field 'workTime'.
     * 
     * @return the value of field 'workTime'.
    **/
    public java.lang.String getWorkTime()
    {
        return this._workTime;
    } //-- java.lang.String getWorkTime() 

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
        	vex.printStackTrace();
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
    **/
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
    **/
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'callTime'.
     * 
     * @param callTime the value of field 'callTime'.
    **/
    public void setCallTime(java.lang.String callTime)
    {
        this._callTime = callTime;
    } //-- void setCallTime(java.lang.String) 

    /**
     * Sets the value of field 'company'.
     * 
     * @param company the value of field 'company'.
    **/
    public void setCompany(java.lang.String company)
    {
        this._company = company;
    } //-- void setCompany(java.lang.String) 

    /**
     * Sets the value of field 'companyType'.
     * 
     * @param companyType the value of field 'companyType'.
    **/
    public void setCompanyType(java.lang.String companyType)
    {
        this._companyType = companyType;
    } //-- void setCompanyType(java.lang.String) 

    /**
     * Sets the value of field 'expectSalary'.
     * 
     * @param expectSalary the value of field 'expectSalary'.
    **/
    public void setExpectSalary(java.lang.String expectSalary)
    {
        this._expectSalary = expectSalary;
    } //-- void setExpectSalary(java.lang.String) 

    /**
     * Sets the value of field 'hardTech'.
     * 
     * @param hardTech the value of field 'hardTech'.
    **/
    public void setHardTech(java.lang.String hardTech)
    {
        this._hardTech = hardTech;
    } //-- void setHardTech(java.lang.String) 

    /**
     * Sets the value of field 'hrCompany'.
     * 
     * @param hrCompany the value of field 'hrCompany'.
    **/
    public void setHrCompany(java.lang.String hrCompany)
    {
        this._hrCompany = hrCompany;
    } //-- void setHrCompany(java.lang.String) 

    /**
     * Sets the value of field 'hrContact'.
     * 
     * @param hrContact the value of field 'hrContact'.
    **/
    public void setHrContact(java.lang.String hrContact)
    {
        this._hrContact = hrContact;
    } //-- void setHrContact(java.lang.String) 

    /**
     * Sets the value of field 'hrContactType'.
     * 
     * @param hrContactType the value of field 'hrContactType'.
    **/
    public void setHrContactType(java.lang.String hrContactType)
    {
        this._hrContactType = hrContactType;
    } //-- void setHrContactType(java.lang.String) 

    /**
     * Sets the value of field 'hrName'.
     * 
     * @param hrName the value of field 'hrName'.
    **/
    public void setHrName(java.lang.String hrName)
    {
        this._hrName = hrName;
    } //-- void setHrName(java.lang.String) 

    /**
     * Sets the value of field 'interviewDate'.
     * 
     * @param interviewDate the value of field 'interviewDate'.
    **/
    public void setInterviewDate(java.lang.String interviewDate)
    {
        this._interviewDate = interviewDate;
    } //-- void setInterviewDate(java.lang.String) 

    /**
     * Sets the value of field 'interviewTime'.
     * 
     * @param interviewTime the value of field 'interviewTime'.
    **/
    public void setInterviewTime(java.lang.String interviewTime)
    {
        this._interviewTime = interviewTime;
    } //-- void setInterviewTime(java.lang.String) 

    /**
     * Sets the value of field 'mark'.
     * 
     * @param mark the value of field 'mark'.
    **/
    public void setMark(java.lang.String mark)
    {
        this._mark = mark;
    } //-- void setMark(java.lang.String) 

    /**
     * Sets the value of field 'progress'.
     * 
     * @param progress the value of field 'progress'.
    **/
    public void setProgress(java.lang.String progress)
    {
        this._progress = progress;
    } //-- void setProgress(java.lang.String) 

    /**
     * Sets the value of field 'realSalary'.
     * 
     * @param realSalary the value of field 'realSalary'.
    **/
    public void setRealSalary(java.lang.String realSalary)
    {
        this._realSalary = realSalary;
    } //-- void setRealSalary(java.lang.String) 

    /**
     * Sets the value of field 'result'.
     * 
     * @param result the value of field 'result'.
    **/
    public void setResult(java.lang.String result)
    {
        this._result = result;
    } //-- void setResult(java.lang.String) 

    /**
     * Sets the value of field 'sno'.
     * 
     * @param sno the value of field 'sno'.
    **/
    public void setSno(java.lang.String sno)
    {
        this._sno = sno;
    } //-- void setSno(java.lang.String) 

    /**
     * Sets the value of field 'workTime'.
     * 
     * @param workTime the value of field 'workTime'.
    **/
    public void setWorkTime(java.lang.String workTime)
    {
        this._workTime = workTime;
    } //-- void setWorkTime(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.api.interview.query.request.AddInterview unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.interview.query.request.AddInterview) Unmarshaller.unmarshal(com.guoyasoft.bean.api.interview.query.request.AddInterview.class, reader);
    } //-- com.guoyasoft.bean.api.interview.query.request.AddInterview unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 


	@Override
	public String toString() {
		return "AddInterview [_sno=" + _sno + ", _company=" + _company
				+ ", _companyType=" + _companyType + ", _callTime=" + _callTime
				+ ", _interviewDate=" + _interviewDate + ", _interviewTime="
				+ _interviewTime + ", _workTime=" + _workTime + ", _progress="
				+ _progress + ", _result=" + _result + ", _expectSalary="
				+ _expectSalary + ", _realSalary=" + _realSalary + ", _hrName="
				+ _hrName + ", _hrCompany=" + _hrCompany + ", _hrContactType="
				+ _hrContactType + ", _hrContact=" + _hrContact
				+ ", _hardTech=" + _hardTech + ", _mark=" + _mark + "]";
	}

}
