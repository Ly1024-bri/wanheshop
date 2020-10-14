package com.Wanhecugui.servlet.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Wanhecugui.entity.WANHECUGUI_PRODUCT;
import com.Wanhecugui.service.WanhecuguiShop_PRODUCTDao;

/**
 * Servlet implementation class DoProductUpdate
 */
@WebServlet("/manage/admin_doproductupdate")
public class DoProductUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
	    request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        
		
		String pname = request.getParameter("productName");
		String id =request.getParameter("productId");
		String price = request.getParameter("productPrice");
		String desc = request.getParameter("productDesc");
		String stock = request.getParameter("productStock");
	
		
		WANHECUGUI_PRODUCT pro = new WANHECUGUI_PRODUCT(
						Integer.parseInt(id),
						pname,
						desc,
						Integer.parseInt(price),
						Integer.parseInt(stock),
						0,
						0,
						null
						
				);
				
		int count = WanhecuguiShop_PRODUCTDao.update(pro);
		
		//成功或失败重定向到哪里
		
				if(count >0 ) {
					
					response.sendRedirect("admin_productselect");
				} else {
					PrintWriter out = response.getWriter();
					
					out.write("<script>");
					out.write("alert('商品添加失败');");
					out.write("location.href='manage/admin_toproductupdate?id="+id+"'");
					out.write("</script>");
					
				}
		
	
	}

}
