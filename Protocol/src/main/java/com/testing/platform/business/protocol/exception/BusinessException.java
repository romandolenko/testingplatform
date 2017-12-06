package com.testing.platform.business.protocol.exception;

public class BusinessException extends RuntimeException {

    private String moduleName;

    private String methodName;


    public BusinessException(String module, String method, String cause) {
        super(cause);
        setModuleName(module);
        setMethodName(method);
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
