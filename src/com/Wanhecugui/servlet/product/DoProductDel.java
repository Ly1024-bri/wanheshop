package com.Wanhecugui.servlet.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Wanhecugui.service.WanhecuguiShop_PRODUCTDao;

/**
 * Servlet implementation class DoProductDel
 */
@WebServlet("/manage/admin_doproductdel")
public class DoProductDel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        
        WanhecuguiShop_PRODUCTDao.del(id);
        
        response.sendRedirect("admin_productselect");
	}

}
