package sqlconnection;

import structure.Vegetable;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class SQLConnect {

    public void SQLConnection() throws SQLException {

        String url = "jdbc:mysql://127.0.0.1:3306/vegetable?autoReconnect=true&useSSL=false";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "7845366");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        Connection cn = null;
        try {
            cn = DriverManager.getConnection(url, prop);
            Statement st = null;
            try {
                st = cn.createStatement();
                ResultSet rs = null;
                try {
                    rs = st.executeQuery("SELECT * FROM vegetable");
                    ArrayList<Vegetable> lst = new ArrayList<>();
                    while (rs.next()) {
                        double weight = rs.getDouble(2);
                        String name = rs.getString(3);
                        double calories = rs.getDouble(4);
                        lst.add(new Vegetable(weight, name, calories) {
                        });
                    }
                    if (lst.size() > 0) {
                        System.out.println(lst.toString().replace("[", "").replace("]", ""));
                    } else {
                        System.out.println("Not found");
                    }
                } finally {
                    if (rs != null) {
                        rs.close();
                    } else {
                        System.err.println("Error with reading data from the DB");
                    }
                }
            } finally {
                if (st != null) {
                    st.close();
                } else {
                    System.err.println("Statement is not created");
                }
            }
        } catch (SQLException e) {
            try {
                System.err.println("DB connection error: " + e);
            } finally {

                if (cn != null) {
                    try {
                        cn.close();
                    } catch (Exception z) {
                        System.err.println("Сonnection close error: " + z);
                    }
                }
            }
        }
    }
}

