

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectWine
 */
//@WebServlet("/select/selectwine")
//@WebServlet(urlPatterns = {"/selectwine"}, name = "winepage",  loadOnStartup=1)
//@WebServlet(name= "winepage" , loadOnStartup=0)
public class SelectWine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectWine() {

    	super();
        System.out.println("selecWIne const called");
        
        // TODO Auto-generated constructor stub
    }
    public void init(){
    	System.out.println("SelectBeer Init()");
    	getServletContext().setAttribute("selectwine", "selectwine");
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter resPW = response.getWriter();
		response.getWriter().println("WINE PAGE OPENED");
		//resPW.println("url: " + request.getServletPath().split("/")[0]);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
