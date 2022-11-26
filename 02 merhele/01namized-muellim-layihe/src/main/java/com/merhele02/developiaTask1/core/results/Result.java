package com.merhele02.developiaTask1.core.results;

public class Result {

    private boolean succes;
    private String message;

    public Result(boolean succes){
        this.succes = succes;
    }
    public Result(boolean succes,String message){
        this(succes);
        this.message = message;
    }

    public boolean isSucces() {
        return succes;
    }

    public String getMessage() {
        return message;
    }


}
