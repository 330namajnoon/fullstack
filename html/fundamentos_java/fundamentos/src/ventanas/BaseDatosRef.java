/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import static java.lang.Class.forName;
import java.sql.*;
/**
 *
 * @author tarde
 */
public class BaseDatosRef {
    
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver cargado");
        } catch (Exception e) {
            System.out.println("Driver no cargado"+e.getMessage());
        }
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/almacen","root","");
            System.out.println("conectados a almacen");
        } catch (SQLException sqe) {
            System.out.println("no se puede conectar a almacen");
        }
        
        String sql1 = "insert into productos values ('090-J','cafeteria termica',33,2.34)";
        String sql2 = "delete from productos where canfidad = 33";
        try {
            st = con.createStatement();
            int n = st.executeUpdate(sql2);
            System.out.println(""+n);
            if(n == 1) {
                System.out.println("registro borrado");
            }else if (n == -1) {
                System.out.println("registros borrados");
            }else {
                System.out.println("registro no borrado");
            }
        } catch (SQLException sqe) {
            System.out.println("Nooo!");
        }
        
        
        
        
        
        try {
            con.close();
            System.out.println("discanectados a almacen");
        } catch (SQLException e) {
            System.out.println("no se pudo dosconectar a almacen lisiento mucho chaval");
        }
    }
}
