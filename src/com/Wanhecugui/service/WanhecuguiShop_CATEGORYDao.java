package com.Wanhecugui.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Wanhecugui.dao.Basedao;
import com.Wanhecugui.entity.WANHECUGUI_CATEGORY;

/**
 * 获取所有分类
 * @author 郴
 *
 */
public class WanhecuguiShop_CATEGORYDao {
	/**
	 * 查询分类
	 * @return
	 */
	public static ArrayList<WANHECUGUI_CATEGORY> selectAll(){
		ArrayList<WANHECUGUI_CATEGORY> list = new ArrayList<WANHECUGUI_CATEGORY>();
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_category";
			
			ps = conn.prepareStatement(sql);
				
			rs = ps.executeQuery();
			
			while (rs.next()) {
				WANHECUGUI_CATEGORY cate = new WANHECUGUI_CATEGORY( 
					rs.getInt("CATE_ID"),
					rs.getString("CATE_NAME"),
					rs.getInt("CATE_PARENT_ID")
									
				);
				list.add(cate);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return list;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static WANHECUGUI_CATEGORY selectById(int id){
		WANHECUGUI_CATEGORY cate = null;
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_category where CATE_ID=?";
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				cate = new WANHECUGUI_CATEGORY( 
					rs.getInt("CATE_ID"),
					rs.getString("CATE_NAME"),
					rs.getInt("CATE_PARENT_ID")
				);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return cate;
	}
	/**
	 * 添加分类
	 * @param cate
	 * @return
	 */
	public static int insert(WANHECUGUI_CATEGORY cate){
		String sql = "insert into wanhecuguishop_category values(null,?,?)";
		
		Object[] params = {
				cate.getCATE_NAME(),
				cate.getCATE_PARENT_ID()
		};
		
		return Basedao.exectuIUD(sql,params);
	}
	/**
	 * 修改一个分类
	 */
	public static int update(WANHECUGUI_CATEGORY cate){
		String sql = "update wanhecuguishop_category set CATE_NAME=?, CATE_PARENT_ID=? where CATE_ID = ?";
		
		Object[] params = {
				cate.getCATE_NAME(),
				cate.getCATE_PARENT_ID(),
				cate.getCATE_ID()
		};
		
		return Basedao.exectuIUD(sql,params);
	}
	/**
	 * 删除一个分类
	 * 
	 */
	public static int del(int id){
		
		String sql = "delete from wanhecuguishop_category where CATE_ID=?";
		
		Object[] params = {id};
		
		return Basedao.exectuIUD(sql,params);
		
	}
	
	/**
	 * 查询分类
	 * 子分类与父分类
	 * 
	 * @param flag  flag="father" && flag="child"
	 * @return
	 */
	public static ArrayList<WANHECUGUI_CATEGORY> selectCat(String flag){
		ArrayList<WANHECUGUI_CATEGORY> list = new ArrayList<WANHECUGUI_CATEGORY>();
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = null;
			if (flag != null && flag.equals("father")){
				sql = "select * from wanhecuguishop_category where CATE_PARENT_ID=0";
			}else{
				sql = "select * from wanhecuguishop_category where CATE_PARENT_ID!=0";
			}
			
			
			ps = conn.prepareStatement(sql);
				
			rs = ps.executeQuery();
			
			while (rs.next()) {
				WANHECUGUI_CATEGORY cate = new WANHECUGUI_CATEGORY( 
					rs.getInt("CATE_ID"),
					rs.getString("CATE_NAME"),
					rs.getInt("CATE_PARENT_ID")
									
				);
				list.add(cate);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return list;
	}
	
}
