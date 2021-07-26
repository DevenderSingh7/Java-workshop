package com.mphasis.main.cui;

import oracle.jdbc.driver.OracleDriver;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    private static  final Logger logger;
    static {
        logger= Logger.getLogger(Main.class.getName());
    }

    public static void main(String[] args) {
	// write your code here

        try {
            DriverManager.registerDriver(new OracleDriver());
            DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:ORCL","hr","naveen");
            logger.log(Level.INFO,"Connected");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


   /*

        Connection connection= null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null;

         try {
            DriverManager.registerDriver(new OracleDriver());
           connection=  DriverManager.getConnection("jdbc:oracle:thin://localhost:1521:ORCL","hr","naveen");
            logger.log(Level.INFO,"Connected");
            preparedStatement = connection.prepareStatement("Select FIRST_NAME, LAST_NAME,SALARY from Employees where DEPARTMENT_ID= 50");

           // preparedStatement.setString(1,args[0]);



           resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                logger.log(Level.INFO,resultSet.getString(1)+" "+ resultSet.getString(2)+" earns "+resultSet.getString(3));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

         finally {
             try{
                 if(resultSet!=null && !resultSet.isClosed()){
                     resultSet.close();

                 }
                 if(preparedStatement!=null && !preparedStatement.isClosed()){
                     preparedStatement.close();
                 }
             } catch (SQLException throwables) {
                 throwables.printStackTrace();
             }
         }
         */


    }
}
