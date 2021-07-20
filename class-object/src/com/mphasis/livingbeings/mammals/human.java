package com.mphasis.livingbeings.mammals;

//import com.mphasis.livingbeings.mammals.Man;
public class human {
    humanEye lefteye,righteye;

    public human(){
        lefteye= new humanEye();
        righteye = new humanEye();
    }
    public class humanEye extends Eyes{
        public double power;

    }
}
