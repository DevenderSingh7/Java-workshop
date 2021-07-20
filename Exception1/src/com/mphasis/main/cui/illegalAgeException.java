package com.mphasis.main.cui;

public class illegalAgeException extends Exception {
    @Override
    public String getMessage() {
        return "Need to be 18 or above to register for vote";
    }
}