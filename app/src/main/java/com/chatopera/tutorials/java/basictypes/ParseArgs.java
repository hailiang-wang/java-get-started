package com.chatopera.tutorials.java.basictypes;

public class ParseArgs {

    public static void main(String[] args){
        if(Integer.parseInt(args[0]) == 1){
            throw new RuntimeException("输入参数，不能为1");
        }
    }
    
}
