package com.Wanhecugui.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Wanhecugui.entity.WANHECUGUI_USER;
import com.Wanhecugui.service.WanhecuguiShop_USERDao;

/**
 * Servlet implementation class ToUserUpdate
 */
@WebServlet("/manage/admin_touserupdate")
public class ToUserUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("id");
        
        //通过id到数据里查找
        WANHECUGUI_USER user = WanhecuguiShop_USERDao.selectByID(id);
        request.setAttribute("user", user);
        
        request.setAttribute("cpage", request.getParameter("cpage"));
        request.getRequestDispatcher("admin_usermodify.jsp").forward(request, response);
	}

}
