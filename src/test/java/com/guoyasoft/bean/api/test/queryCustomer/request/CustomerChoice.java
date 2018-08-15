/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.bean.api.test.queryCustomer.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class CustomerChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _cstTypeList;

    private java.util.Vector _headPortraitList;

    private java.util.Vector _certList;

    private java.util.Vector _addrList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CustomerChoice() {
        super();
        _cstTypeList = new Vector();
        _headPortraitList = new Vector();
        _certList = new Vector();
        _addrList = new Vector();
    } //-- com.guoyasoft.bean.api.test.queryCustomer.request.CustomerChoice()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAddr
    **/
    public void addAddr(java.lang.String vAddr)
        throws java.lang.IndexOutOfBoundsException
    {
        _addrList.addElement(vAddr);
    } //-- void addAddr(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vAddr
    **/
    public void addAddr(int index, java.lang.String vAddr)
        throws java.lang.IndexOutOfBoundsException
    {
        _addrList.insertElementAt(vAddr, index);
    } //-- void addAddr(int, java.lang.String) 

    /**
     * 
     * 
     * @param vCert
    **/
    public void addCert(java.lang.String vCert)
        throws java.lang.IndexOutOfBoundsException
    {
        _certList.addElement(vCert);
    } //-- void addCert(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vCert
    **/
    public void addCert(int index, java.lang.String vCert)
        throws java.lang.IndexOutOfBoundsException
    {
        _certList.insertElementAt(vCert, index);
    } //-- void addCert(int, java.lang.String) 

    /**
     * 
     * 
     * @param vCstType
    **/
    public void addCstType(java.lang.String vCstType)
        throws java.lang.IndexOutOfBoundsException
    {
        _cstTypeList.addElement(vCstType);
    } //-- void addCstType(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vCstType
    **/
    public void addCstType(int index, java.lang.String vCstType)
        throws java.lang.IndexOutOfBoundsException
    {
        _cstTypeList.insertElementAt(vCstType, index);
    } //-- void addCstType(int, java.lang.String) 

    /**
     * 
     * 
     * @param vHeadPortrait
    **/
    public void addHeadPortrait(java.lang.String vHeadPortrait)
        throws java.lang.IndexOutOfBoundsException
    {
        _headPortraitList.addElement(vHeadPortrait);
    } //-- void addHeadPortrait(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vHeadPortrait
    **/
    public void addHeadPortrait(int index, java.lang.String vHeadPortrait)
        throws java.lang.IndexOutOfBoundsException
    {
        _headPortraitList.insertElementAt(vHeadPortrait, index);
    } //-- void addHeadPortrait(int, java.lang.String) 

    /**
    **/
    public java.util.Enumeration enumerateAddr()
    {
        return _addrList.elements();
    } //-- java.util.Enumeration enumerateAddr() 

    /**
    **/
    public java.util.Enumeration enumerateCert()
    {
        return _certList.elements();
    } //-- java.util.Enumeration enumerateCert() 

    /**
    **/
    public java.util.Enumeration enumerateCstType()
    {
        return _cstTypeList.elements();
    } //-- java.util.Enumeration enumerateCstType() 

    /**
    **/
    public java.util.Enumeration enumerateHeadPortrait()
    {
        return _headPortraitList.elements();
    } //-- java.util.Enumeration enumerateHeadPortrait() 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String getAddr(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _addrList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_addrList.elementAt(index);
    } //-- java.lang.String getAddr(int) 

    /**
    **/
    public java.lang.String[] getAddr()
    {
        int size = _addrList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_addrList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getAddr() 

    /**
    **/
    public int getAddrCount()
    {
        return _addrList.size();
    } //-- int getAddrCount() 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String getCert(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _certList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_certList.elementAt(index);
    } //-- java.lang.String getCert(int) 

    /**
    **/
    public java.lang.String[] getCert()
    {
        int size = _certList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_certList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getCert() 

    /**
    **/
    public int getCertCount()
    {
        return _certList.size();
    } //-- int getCertCount() 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String getCstType(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _cstTypeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_cstTypeList.elementAt(index);
    } //-- java.lang.String getCstType(int) 

    /**
    **/
    public java.lang.String[] getCstType()
    {
        int size = _cstTypeList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_cstTypeList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getCstType() 

    /**
    **/
    public int getCstTypeCount()
    {
        return _cstTypeList.size();
    } //-- int getCstTypeCount() 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String getHeadPortrait(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _headPortraitList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_headPortraitList.elementAt(index);
    } //-- java.lang.String getHeadPortrait(int) 

    /**
    **/
    public java.lang.String[] getHeadPortrait()
    {
        int size = _headPortraitList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_headPortraitList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getHeadPortrait() 

    /**
    **/
    public int getHeadPortraitCount()
    {
        return _headPortraitList.size();
    } //-- int getHeadPortraitCount() 

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
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
     * 
     * 
     * @param index
    **/
    public java.lang.String removeAddr(int index)
    {
        java.lang.Object obj = _addrList.elementAt(index);
        _addrList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeAddr(int) 

    /**
    **/
    public void removeAllAddr()
    {
        _addrList.removeAllElements();
    } //-- void removeAllAddr() 

    /**
    **/
    public void removeAllCert()
    {
        _certList.removeAllElements();
    } //-- void removeAllCert() 

    /**
    **/
    public void removeAllCstType()
    {
        _cstTypeList.removeAllElements();
    } //-- void removeAllCstType() 

    /**
    **/
    public void removeAllHeadPortrait()
    {
        _headPortraitList.removeAllElements();
    } //-- void removeAllHeadPortrait() 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String removeCert(int index)
    {
        java.lang.Object obj = _certList.elementAt(index);
        _certList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeCert(int) 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String removeCstType(int index)
    {
        java.lang.Object obj = _cstTypeList.elementAt(index);
        _cstTypeList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeCstType(int) 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String removeHeadPortrait(int index)
    {
        java.lang.Object obj = _headPortraitList.elementAt(index);
        _headPortraitList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeHeadPortrait(int) 

    /**
     * 
     * 
     * @param index
     * @param vAddr
    **/
    public void setAddr(int index, java.lang.String vAddr)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _addrList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _addrList.setElementAt(vAddr, index);
    } //-- void setAddr(int, java.lang.String) 

    /**
     * 
     * 
     * @param addrArray
    **/
    public void setAddr(java.lang.String[] addrArray)
    {
        //-- copy array
        _addrList.removeAllElements();
        for (int i = 0; i < addrArray.length; i++) {
            _addrList.addElement(addrArray[i]);
        }
    } //-- void setAddr(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vCert
    **/
    public void setCert(int index, java.lang.String vCert)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _certList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _certList.setElementAt(vCert, index);
    } //-- void setCert(int, java.lang.String) 

    /**
     * 
     * 
     * @param certArray
    **/
    public void setCert(java.lang.String[] certArray)
    {
        //-- copy array
        _certList.removeAllElements();
        for (int i = 0; i < certArray.length; i++) {
            _certList.addElement(certArray[i]);
        }
    } //-- void setCert(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vCstType
    **/
    public void setCstType(int index, java.lang.String vCstType)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _cstTypeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _cstTypeList.setElementAt(vCstType, index);
    } //-- void setCstType(int, java.lang.String) 

    /**
     * 
     * 
     * @param cstTypeArray
    **/
    public void setCstType(java.lang.String[] cstTypeArray)
    {
        //-- copy array
        _cstTypeList.removeAllElements();
        for (int i = 0; i < cstTypeArray.length; i++) {
            _cstTypeList.addElement(cstTypeArray[i]);
        }
    } //-- void setCstType(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vHeadPortrait
    **/
    public void setHeadPortrait(int index, java.lang.String vHeadPortrait)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _headPortraitList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _headPortraitList.setElementAt(vHeadPortrait, index);
    } //-- void setHeadPortrait(int, java.lang.String) 

    /**
     * 
     * 
     * @param headPortraitArray
    **/
    public void setHeadPortrait(java.lang.String[] headPortraitArray)
    {
        //-- copy array
        _headPortraitList.removeAllElements();
        for (int i = 0; i < headPortraitArray.length; i++) {
            _headPortraitList.addElement(headPortraitArray[i]);
        }
    } //-- void setHeadPortrait(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.api.test.queryCustomer.request.CustomerChoice unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.test.queryCustomer.request.CustomerChoice) Unmarshaller.unmarshal(com.guoyasoft.bean.api.test.queryCustomer.request.CustomerChoice.class, reader);
    } //-- com.guoyasoft.bean.api.test.queryCustomer.request.CustomerChoice unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
