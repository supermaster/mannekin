package com.home.red;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// or import javax.inject.Named;
// or import javax.enterprise.context.SessionScoped;

@ManagedBean(name = "user") // or @Named("user")
@SessionScoped
public class UserBean implements Serializable {

    @Resource(name="jdbc/mydb")
    private DataSource ds;
    public String getText() {
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "postgres");
//            if(ds==null)
//                throw new SQLException("Can't get data source(((((((((");
//            connection  = ds.getConnection();
        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console.");
            e.printStackTrace();
            return "xxx";

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return "!!!";
    }
}
