package com.Wanhecugui.servlet.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Wanhecugui.entity.WANHECUGUI_CART;
import com.Wanhecugui.entity.WANHECUGUI_USER;
import com.Wanhecugui.service.WanhecuguiShop_CARTDao;

/**
 * Servlet implementation class ShowCart
 */
@WebServlet("/showcart")
public class ShowCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
	    request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        
        HttpSession session =  request.getSession();	
		
		String isLogin = (String)session.getAttribute("isLogin");
		
		WANHECUGUI_USER user =(WANHECUGUI_USER)session.getAttribute("name");
	
		if(user!=null && isLogin.equals("1")) {
			
			String uid = (String)user.getUSER_ID();
			
			ArrayList<WANHECUGUI_CART> list = WanhecuguiShop_CARTDao.getCart(uid);
			
			request.setAttribute("shoplist", list);
			
			request.getRequestDispatcher("cart.jsp").forward(request, response);
		}else {
			PrintWriter out = response.getWriter();
			
			out.write("<script>");
			out.write("alert('登录后，再购买');");
			out.write("location.href='login.jsp'");
			out.write("</script>");
			out.close();
		}
	
	}


}
