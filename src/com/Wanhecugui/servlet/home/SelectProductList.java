package com.Wanhecugui.servlet.home;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Wanhecugui.entity.WANHECUGUI_CATEGORY;
import com.Wanhecugui.entity.WANHECUGUI_PRODUCT;
import com.Wanhecugui.service.WanhecuguiShop_CATEGORYDao;
import com.Wanhecugui.service.WanhecuguiShop_PRODUCTDao;

/**
 * Servlet implementation class SelectProductList
 */
@WebServlet("/selectproductlist")
public class SelectProductList extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<WANHECUGUI_CATEGORY> flist = WanhecuguiShop_CATEGORYDao.selectCat("father");
		
		request.setAttribute("flist", flist);
		
		ArrayList<WANHECUGUI_CATEGORY> clist = WanhecuguiShop_CATEGORYDao.selectCat("child");
		
		request.setAttribute("clist", clist);
		
		String fid = request.getParameter("fid");
		String cid = request.getParameter("cid");
		
		int id = 0;
		ArrayList<WANHECUGUI_PRODUCT> list = null;
		if (fid!=null) {
			id=Integer.parseInt(fid);
			list = WanhecuguiShop_PRODUCTDao.selectAllByFid(id);
		}
		if (cid!=null) {
			id=Integer.parseInt(cid);
			list = WanhecuguiShop_PRODUCTDao.selectAllByCid(id);
		}
		
		request.setAttribute("title",WanhecuguiShop_CATEGORYDao.selectById(id).getCATE_NAME());
		
		request.setAttribute("list",list);
		request.getRequestDispatcher("productlist.jsp").forward(request, response);
	}
}
