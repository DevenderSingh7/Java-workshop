package com.mphasis.main.cui;

public class vote {
    public void register(int age) throws illegalAgeException{
        if(age<18)
            throw new illegalAgeException();
    }
}
