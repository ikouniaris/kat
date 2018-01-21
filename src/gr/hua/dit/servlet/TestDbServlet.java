package gr.hua.dit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// setup connection variables
        String jdbcUrl = "jdbc:mysql://83.212.105.20/it21412?useSSL=false";
        String user = "it21447";
        String pass = "changeit";
        String driver= "com.mysql.jdbc.Driver";
        
        // get connection to db
        try {
                PrintWriter out = response.getWriter();
                out.println("Connecting to db: " + jdbcUrl);
                Class.forName(driver);
                Connection con = DriverManager.getConnection(jdbcUrl,user,pass);
                out.println("success");
                con.close();
        }
        catch (Exception e) {
                e.printStackTrace();
                throw new ServletException(e);
        }
	}

}
