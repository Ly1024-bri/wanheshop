package com.Wanhecugui.servlet.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Wanhecugui.entity.WANHECUGUI_PRODUCT;
import com.Wanhecugui.service.WanhecuguiShop_PRODUCTDao;

/**
 * Servlet implementation class ToProductUpdate
 */
@WebServlet("/manage/admin_toproductupdate")
public class ToProductUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        
        String id = request.getParameter("id");
        
        WANHECUGUI_PRODUCT p = WanhecuguiShop_PRODUCTDao.selectByID(id);
        
        request.setAttribute("p", p);
        
        request.getRequestDispatcher("admin_productmodify.jsp").forward(request, response);
	}

	
}
