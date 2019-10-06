package com.travelapp.travel.model;

public class Result<T> {
    private String msg;
    private Boolean success;
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    //测试输出
    public String toString(){
        return "Result{"+
                "msg="+msg+
                ", success='" + success + '\'' +
                ", data=" + data +
                '}';
    }
}
