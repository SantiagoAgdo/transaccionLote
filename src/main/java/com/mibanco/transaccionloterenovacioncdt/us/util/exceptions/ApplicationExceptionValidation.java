package com.mibanco.transaccionloterenovacioncdt.us.util.exceptions;

public class ApplicationExceptionValidation extends RuntimeException {

    public static final long serialVersionUID = 1L;


    int status;

    public ApplicationExceptionValidation(int status, String msm) {
        super(msm);
        this.status = status;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}