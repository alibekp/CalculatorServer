/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcBean;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author user
 */
@Path("calcbeancrudport")
public class CalcBeanCRUDPort {

    private CalcBean_client.CalcBeanCRUD port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalcBeanCRUDPort
     */
    public CalcBeanCRUDPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method multiply
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("multiply/")
    public String getMultiply(@QueryParam("arg0")
            @DefaultValue("0") int arg0, @QueryParam("arg1")
            @DefaultValue("0") int arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.multiply(arg0, arg1);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method plus
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("plus/")
    public String getPlus(@QueryParam("arg0")
            @DefaultValue("0") int arg0, @QueryParam("arg1")
            @DefaultValue("0") int arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.plus(arg0, arg1);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method minus
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("minus/")
    public String getMinus(@QueryParam("arg0")
            @DefaultValue("0") int arg0, @QueryParam("arg1")
            @DefaultValue("0") int arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.minus(arg0, arg1);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method divide
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("divide/")
    public String getDivide(@QueryParam("arg0")
            @DefaultValue("0") int arg0, @QueryParam("arg1")
            @DefaultValue("0") int arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.divide(arg0, arg1);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private CalcBean_client.CalcBeanCRUD getPort() {
        try {
            // Call Web Service Operation
            CalcBean_client.CalcService service = new CalcBean_client.CalcService();
            CalcBean_client.CalcBeanCRUD p = service.getCalcBeanCRUDPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
