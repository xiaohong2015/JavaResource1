
package com.tc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceHello", targetNamespace = "http://service.ts.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceHello {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVlaue", targetNamespace = "http://service.ts.com/", className = "com.tc.service.GetVlaue")
    @ResponseWrapper(localName = "getVlaueResponse", targetNamespace = "http://service.ts.com/", className = "com.tc.service.GetVlaueResponse")
    @Action(input = "http://service.ts.com/ServiceHello/getVlaueRequest", output = "http://service.ts.com/ServiceHello/getVlaueResponse")
    public String getVlaue(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
