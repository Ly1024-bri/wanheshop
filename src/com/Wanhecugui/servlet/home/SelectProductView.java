package com.Wanhecugui.servlet.home;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Wanhecugui.entity.WANHECUGUI_CATEGORY;
import com.Wanhecugui.entity.WANHECUGUI_PRODUCT;
import com.Wanhecugui.service.WanhecuguiShop_CATEGORYDao;
import com.Wanhecugui.service.WanhecuguiShop_PRODUCTDao;

/**
 * Servlet implementation class SelectProductView
 */
@WebServlet("/selectproductview")
public class SelectProductView extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<WANHECUGUI_CATEGORY> flist = WanhecuguiShop_CATEGORYDao.selectCat("father");
		
		request.setAttribute("flist", flist);
		
		ArrayList<WANHECUGUI_CATEGORY> clist = WanhecuguiShop_CATEGORYDao.selectCat("child");
		
		request.setAttribute("clist", clist);
		
		String id = request.getParameter("id");
		
		//获取最近访问
		
		HttpSession session = request.getSession();
				
		//从SSESSIOn获取一下 ids
				
		ArrayList<Integer> ids = (ArrayList<Integer>)session.getAttribute("ids");
			
		if(ids == null){
			ids = new ArrayList<Integer>();
		}
					
		//最多放5， 如果多出5个将第一个删除
		if(ids.size() >= 5) {
			ids.remove(0);
		}
				
		// 添加列表里， 但只要一份
		if(id!=null && (!ids.contains(Integer.parseInt(id)))) {
			
			ids.add(Integer.parseInt(id));
				
		}
				
		session.setAttribute("ids", ids);
				
		ids = (ArrayList<Integer>)session.getAttribute("ids");
				
		if(ids!=null) {
						
			ArrayList<WANHECUGUI_PRODUCT> lastlylist = WanhecuguiShop_PRODUCTDao.selectAllById(ids);
			request.setAttribute("lastlylist", lastlylist);
		}
		
		WANHECUGUI_PRODUCT p = null;
		
		if (id != null) {
			p = WanhecuguiShop_PRODUCTDao.selectById(Integer.parseInt(id));
			request.setAttribute("p", p);
		}
		
		if(ids.size() >= 5) {
			ids.remove(0);
		}
		
		if (p != null) {
			int cid = p.getPRODUCT_CID();
			ArrayList<WANHECUGUI_PRODUCT> classlist = WanhecuguiShop_PRODUCTDao.selectAllByCid(cid);
			request.setAttribute("classlist", classlist);
			
			WANHECUGUI_CATEGORY cate = WanhecuguiShop_CATEGORYDao.selectById(cid);
			
			request.setAttribute("cate", cate);
		}
		request.getRequestDispatcher("productview.jsp").forward(request, response);
	}


}
