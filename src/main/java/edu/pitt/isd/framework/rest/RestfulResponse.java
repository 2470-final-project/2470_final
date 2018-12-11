package edu.pitt.isd.framework.rest;

import java.io.Serializable;

/**
 * @author Isolachine
 */
public class RestfulResponse implements Serializable {

    private static final long serialVersionUID = 8467939889876968376L;

    private Integer code;
    private String msg;
    private transient Object data;

    public RestfulResponse(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public RestfulResponse(Integer code, Object data) {
        this.code = code;
        if (code == 1) {
            this.msg = "success";
        } else {
            this.msg = "failed";
        }
        this.data = data;
    }

    /**
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

}
