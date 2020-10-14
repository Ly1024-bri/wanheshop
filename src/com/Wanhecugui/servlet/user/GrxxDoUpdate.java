package com.Wanhecugui.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Wanhecugui.entity.WANHECUGUI_USER;
import com.Wanhecugui.service.WanhecuguiShop_USERDao;

/**
 * Servlet implementation class GrxxDoUpdate
 */
@WebServlet("/grxxdoupdate")
public class GrxxDoUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
	    request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("userName");
        String name = request.getParameter("name");
        String pwd = request.getParameter("passWord");
        String sex = request.getParameter("sex");
        String birthday = request.getParameter("birthday");
        String email= request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        String userStatus = request.getParameter("userStatus");
        
        int status = 1;
        
        if (userStatus != null) {
			status = Integer.parseInt(userStatus);
		}
        
        
        //创建实体用户
        WANHECUGUI_USER u1 = new WANHECUGUI_USER(username,name,pwd,sex,birthday,null,email,mobile,address,status);

        //加入到数据库的用户表中
        int count = WanhecuguiShop_USERDao.update1(u1);
        
        //成功或失败重定向到哪里
        if(count > 0) {
            response.sendRedirect("login.jsp");
        }else{
            PrintWriter out = response.getWriter();

            out.write("<script>");
            out.write("alert('信息修改失败');");
            out.write("location.href = 'mygxin.jsp'");
            out.write("</script>");

        }

	}
	
}
