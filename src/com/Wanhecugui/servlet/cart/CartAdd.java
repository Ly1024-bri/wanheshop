package com.Wanhecugui.servlet.cart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Wanhecugui.entity.WANHECUGUI_CART;
import com.Wanhecugui.entity.WANHECUGUI_PRODUCT;
import com.Wanhecugui.entity.WANHECUGUI_USER;
import com.Wanhecugui.service.WanhecuguiShop_CARTDao;
import com.Wanhecugui.service.WanhecuguiShop_PRODUCTDao;

/**
 * Servlet implementation class CartAdd
 */
@WebServlet("/cartadd")
public class CartAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.setCharacterEncoding("UTF-8");
	        response.setContentType("text/html;charset=utf-8");
	        
		WANHECUGUI_PRODUCT p =null;
		
		String pid = request.getParameter("id");
		String count = request.getParameter("count");
		String url = request.getParameter("url");
		
		HttpSession session =  request.getSession();
		
		
		String isLogin = (String)session.getAttribute("isLogin");
		
		WANHECUGUI_USER user =(WANHECUGUI_USER)session.getAttribute("name");
		if(user!=null && isLogin.equals("1")) {
			
			String uid = (String)user.getUSER_ID();
			
		    WANHECUGUI_CART srcsp = WanhecuguiShop_CARTDao.getCartShop(uid,pid);
		    
		    if(srcsp != null) {
				int srccount = srcsp.getCart_quantity();
				
				int newcount = srccount + Integer.parseInt(count);
				
				if(newcount >=5) {
					newcount =5;
				}
				WanhecuguiShop_CARTDao.updatenum(srcsp.getCart_id(),newcount);
			}else {
			
				if (pid != null) {
					p = WanhecuguiShop_PRODUCTDao.selectById(Integer.parseInt(pid));
				}
			
				WANHECUGUI_CART cart = new WANHECUGUI_CART(
							0,
							p.getPRODUCT_FILENAME(),
							p.getPRODUCT_NAME(),
							p.getPRODUCT_PRICE(),
							Integer.parseInt(count),
							p.getPRODUCT_STOCK(),
							p.getPRODUCT_ID(),
							uid,
							1
						);

				WanhecuguiShop_CARTDao.insert(cart);
			}
		}else {
			PrintWriter out = response.getWriter();
			
			out.write("<script>");
			out.write("alert('请登录，再购买');");
			out.write("location.href='login.jsp'");
			out.write("</script>");
			out.close();
			return;
		}
		
		if(url.equals("z")) {
			response.sendRedirect("showcart");
		}else{
			response.sendRedirect("selectproductview?id="+pid);
		}
	}

	

}
