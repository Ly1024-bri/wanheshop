package com.Wanhecugui.servlet.home;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Wanhecugui.entity.WANHECUGUI_CATEGORY;
import com.Wanhecugui.service.WanhecuguiShop_CATEGORYDao;

/**
 * Servlet implementation class IndexSelect
 */
@WebServlet("/indexselect")
public class IndexSelect extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<WANHECUGUI_CATEGORY> flist = WanhecuguiShop_CATEGORYDao.selectCat("father");
		
		request.setAttribute("flist", flist);
		
		ArrayList<WANHECUGUI_CATEGORY> clist = WanhecuguiShop_CATEGORYDao.selectCat("child");
		
		request.setAttribute("clist", clist);
		
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
