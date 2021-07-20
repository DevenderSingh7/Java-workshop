package com.mphasis.main.cui;

import java.io.*;

class Data implements Serializable{
    public int id;
    public String name;
    public float salary;


    public Data(){

    }
    public  Data (int id,String name, float salary){
        this.id= id;
        this.name= name;
        this.salary=salary;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Data data= new Data(10,"dev",12345.567f);

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("ObjectStore.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);

        FileInputStream fis= new FileInputStream("ObjectStore.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Data dataRestored =(Data)ois.readObject();
        System.out.println("Deserialization object value:"+ dataRestored.id+ "....."+ dataRestored.name + "...."+ dataRestored.salary);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException c){
            c.printStackTrace();
        }

    }
}
