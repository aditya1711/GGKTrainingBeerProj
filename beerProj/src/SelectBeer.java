

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Servlet implementation class SelectBeer
 */
//@WebServlet(urlPatterns= {"/*"})
public class SelectBeer extends HttpServlet {
	private ArrayList<String> nestedURLList;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectBeer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init(){
    	System.out.println("SelectBeer Init()");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType("text/html");
		//response.getWriter().println(request.getParameter("brand"));
		//response.getWriter().println(new beerProj.BeerExpert().getBeer(request.getParameter("brand")));
		//response.getWriter().println(request.getRequestURI());
		//response.getWriter().println("BEER PAGE OPENED");
		String[] s = request.getRequestURI().toString().split("/");
		//response.getWriter().println(request.getRequestURI());
		/*for(int i=0;i<s.length;i++){
			response.getWriter().println(i + " " + s[i] + "\t");
		}*/
		/*if(s.length > 3){
			//response.sendRedirect("/beerProj/" + s[3]);
			if(s[3].equals("selectwine")){
				getServletContext().getRequestDispatcher("/selectwine").forward(request, response);
			}
		}*/
		Enumeration<String> attribNames = getServletContext().getAttributeNames();
		if (s.length>3) {
			while (attribNames.hasMoreElements()) {
				//String temp = (String)(getServletContext().getAttribute(attribNames.nextElement()));
				String temp2 = attribNames.nextElement();
				String temp = getServletContext().getAttribute(temp2).toString();
				System.out.println("atribName: " + temp2 + "\tvalue: " + temp);
				if (temp.equals(s[3])) {
					System.out.println("match Found" + temp);
					getServletContext().getRequestDispatcher("winepage").forward(request, response);
				}
			} 
		}
		
		//getServletContext().getRequestDispatcher("/selectwine").include(request,response);
		response.getWriter().println("BEER PAGE OPENED");
	
		//getServletContext().getRequestDispatcher("/" + s[s.length-1]).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
