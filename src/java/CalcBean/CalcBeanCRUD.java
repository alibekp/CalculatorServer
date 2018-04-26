/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcBean;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author user
 */
@Stateless
@XmlAccessorType(XmlAccessType.FIELD)
@WebService(serviceName="CalcService")
public class CalcBeanCRUD implements CalcBeanRemote {

    @Override
    @WebMethod(operationName="plus")
    public int plus(int a, int b) {
        return a+b;
    }

    @Override
    @WebMethod(operationName="minus")
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    @WebMethod(operationName="multiply")
    public int mult(int a, int b) {
        return a*b;
    }

    @Override
    @WebMethod(operationName="divide")
    public int div(int a, int b) {
        if(b==0){
            return 0;
        }else{
            return a/b;
        }
    }
    
}
