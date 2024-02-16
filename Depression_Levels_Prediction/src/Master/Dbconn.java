/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dbconn {
 
    public static String finalpath = "G:\\BE2022-2023\\23 cs 373 grp depression\\Code\\DataSet\\";
    public static String fold15filepath =finalpath+"fold15.txt";
    public static String filewordpath = finalpath + "searchword.txt";
    public static ArrayList<String> negativeword = new ArrayList<>();
    public static String onlinepath = finalpath + "OnlineData.txt";
     public static String file70path = finalpath + "FileData70%.txt";
public static String stopwordspath=finalpath+"stopwords.txt";
public static String positive=finalpath+"positive-words.txt";
public static String negative=finalpath+"negative-words.txt";
public static String temp=finalpath+"temp.txt";
public static String neg=finalpath+"neg.txt";
  

    public Dbconn() throws SQLException {
        //initComponents();
        //Connection con;

    }

    public static Connection conn() throws Exception {
        Connection con;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/23_cs_373_depression", "root", "admin");

        return (con);

    }

     
 }
