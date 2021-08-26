package com.iu.s1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iu.s1.account.AccountController;
import com.iu.s1.bankbook.BankBookController;
import com.iu.s1.member.MemberController;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberController mc = null;
    private BankBookController bc = null;
    private AccountController ac = null; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
        mc = new MemberController();
		bc = new BankBookController();
		ac = new AccountController();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig sc = getServletConfig();
		HttpSession session= request.getSession();
		ServletContext context = session.getServletContext();
		context=getServletContext();
		
		
		System.out.println("Front Controller 실행");
		
		
		String uri = request.getRequestURI();		
		//String url = request.getRequestURL().toString();
		
		
		String[] path = uri.split("/");
		
		System.out.println("path : "+path[2]);
		
		if(path[2].equals("member")) {
			try {
				mc.start(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(path[2].equals("bankbook")) {
			bc.start(request,response);
		}else if(path[2].equals("account")) {
			ac.start(request, response);
		
		}else {
			System.out.println("없는 URL");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
