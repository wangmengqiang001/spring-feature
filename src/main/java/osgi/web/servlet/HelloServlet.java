package osgi.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import osgi.web.beans.UserInfo;

/**
 * Servlet implementation class HelloServlet
 */
@Configurable
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserInfo userinfo;
       
    public void setUser(UserInfo user) {
		this.userinfo = user;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//userinfo = new UserInfo();
		//userinfo.setAccount("accountInfo");
		//userinfo.setPassword("passwordAdmin");
		response.getWriter().append("Hello, Served at: 21 " + userinfo).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
