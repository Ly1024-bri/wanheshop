package com.Wanhecugui.servlet.cate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Wanhecugui.entity.WANHECUGUI_CATEGORY;
import com.Wanhecugui.service.WanhecuguiShop_CATEGORYDao;

/**
 * Servlet implementation class DoUserCate
 */
@WebServlet("/manage/admin_docateadd")
public class DoCateAdd extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
	    request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        int fid = Integer.parseInt(request.getParameter("parentId"));
        String name = request.getParameter("className");
        
        WANHECUGUI_CATEGORY cate = new WANHECUGUI_CATEGORY(0,name,fid);
        
        WanhecuguiShop_CATEGORYDao.insert(cate);
        
        response.sendRedirect("admin_cateselect");
	}
}
