package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getCo() throws Exception {
        try{
            return DriverManager.getConnection("jdbc:postgresql://containers-us-west-170.railway.app:7849/railway", "postgres", "xEjHtrV4m417NNGVyZ2r");
        }catch (Exception e){
            throw e;
        }
    }
}