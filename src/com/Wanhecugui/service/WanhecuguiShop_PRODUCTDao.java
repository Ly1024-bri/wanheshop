package com.Wanhecugui.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Wanhecugui.dao.Basedao;
import com.Wanhecugui.entity.WANHECUGUI_PRODUCT;

public class WanhecuguiShop_PRODUCTDao {
	/**
	 * 添加商品
	 * @param cate
	 * @return
	 */
	public static int insert(WANHECUGUI_PRODUCT p){
		String sql = "insert into wanhecuguishop_product values(null,?,?,?,?,?,?,?)";
		
		
		
		Object[] params = {
				p.getPRODUCT_NAME(),
				p.getPRODUCT_DESCRIPTION(),
				p.getPRODUCT_PRICE(),
				p.getPRODUCT_STOCK(),
				p.getPRODUCT_FID(),
				p.getPRODUCT_CID(),
				p.getPRODUCT_FILENAME()
		};
		
		return Basedao.exectuIUD(sql,params);
	}
	/**
	 * 查询商品
	 * @return
	 */
	public static ArrayList<WANHECUGUI_PRODUCT> selectAll(){
		ArrayList<WANHECUGUI_PRODUCT> list = new ArrayList<WANHECUGUI_PRODUCT>();
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_product";
			
			ps = conn.prepareStatement(sql);
				
			rs = ps.executeQuery();
			
			while (rs.next()) {
				WANHECUGUI_PRODUCT p = new WANHECUGUI_PRODUCT( 
					rs.getInt("PRODUCT_ID"),
					rs.getString("PRODUCT_NAME"),
					rs.getString("PRODUCT_DESCRIPTION"),
					rs.getInt("PRODUCT_PRICE"),
					rs.getInt("PRODUCT_STOCK"),
					rs.getInt("PRODUCT_FID"),
					rs.getInt("PRODUCT_CID"),
					rs.getString("PRODUCT_FILENAME")
									
				);
				list.add(p);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return list;
	}
	/**
	 * 删除橱柜
	 * @param id
	 * @return
	 */
	public static WANHECUGUI_PRODUCT selectByID(String id){
		WANHECUGUI_PRODUCT p = null;
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_product where PRODUCT_ID=?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				 p = new WANHECUGUI_PRODUCT( 
					rs.getInt("PRODUCT_ID"),
					rs.getString("PRODUCT_NAME"),
					rs.getString("PRODUCT_DESCRIPTION"),
					rs.getInt("PRODUCT_PRICE"),
					rs.getInt("PRODUCT_STOCK"),
					rs.getInt("PRODUCT_FID"),
					rs.getInt("PRODUCT_CID"),
					rs.getString("PRODUCT_FILENAME")
									
				);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return p;
	}
	public static int update(WANHECUGUI_PRODUCT pro){
		String sql = "update wanhecuguishop_product set PRODUCT_NAME=?,PRODUCT_DESCRIPTION=?,PRODUCT_PRICE=?,PRODUCT_STOCK=? where PRODUCT_ID = ?";
		Object[] params = {
				pro.getPRODUCT_NAME(),
				pro.getPRODUCT_DESCRIPTION(),
				pro.getPRODUCT_PRICE(),
				pro.getPRODUCT_STOCK(),
				pro.getPRODUCT_ID()
		};
		
		return Basedao.exectuIUD(sql,params);
	}
public static int del(int id){
		
		String sql = "delete from wanhecuguishop_product where PRODUCT_ID=?";
		
		Object[] params = {id};
		
		return Basedao.exectuIUD(sql,params);
		
	}
	public static WANHECUGUI_PRODUCT selectById(int id){
		WANHECUGUI_PRODUCT p = null;
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_product where PRODUCT_ID=?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
				
			rs = ps.executeQuery();
			
			while (rs.next()) {
				p = new WANHECUGUI_PRODUCT( 
					rs.getInt("PRODUCT_ID"),
					rs.getString("PRODUCT_NAME"),
					rs.getString("PRODUCT_DESCRIPTION"),
					rs.getInt("PRODUCT_PRICE"),
					rs.getInt("PRODUCT_STOCK"),
					rs.getInt("PRODUCT_FID"),
					rs.getInt("PRODUCT_CID"),
					rs.getString("PRODUCT_FILENAME")
									
				);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return p;
	}
	
	public static ArrayList<WANHECUGUI_PRODUCT> selectAllByFid(int fid){
		ArrayList<WANHECUGUI_PRODUCT> list = new ArrayList<WANHECUGUI_PRODUCT>();
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_product where PRODUCT_FID=?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, fid);
				
			rs = ps.executeQuery();
			
			while (rs.next()) {
				WANHECUGUI_PRODUCT p = new WANHECUGUI_PRODUCT( 
					rs.getInt("PRODUCT_ID"),
					rs.getString("PRODUCT_NAME"),
					rs.getString("PRODUCT_DESCRIPTION"),
					rs.getInt("PRODUCT_PRICE"),
					rs.getInt("PRODUCT_STOCK"),
					rs.getInt("PRODUCT_FID"),
					rs.getInt("PRODUCT_CID"),
					rs.getString("PRODUCT_FILENAME")
									
				);
				list.add(p);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return list;
	}
	
	public static ArrayList<WANHECUGUI_PRODUCT> selectAllByCid(int cid){
		ArrayList<WANHECUGUI_PRODUCT> list = new ArrayList<WANHECUGUI_PRODUCT>();
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_product where PRODUCT_CID=?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, cid);
				
			rs = ps.executeQuery();
			
			while (rs.next()) {
				WANHECUGUI_PRODUCT p = new WANHECUGUI_PRODUCT( 
					rs.getInt("PRODUCT_ID"),
					rs.getString("PRODUCT_NAME"),
					rs.getString("PRODUCT_DESCRIPTION"),
					rs.getInt("PRODUCT_PRICE"),
					rs.getInt("PRODUCT_STOCK"),
					rs.getInt("PRODUCT_FID"),
					rs.getInt("PRODUCT_CID"),
					rs.getString("PRODUCT_FILENAME")
									
				);
				list.add(p);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return list;
	}
	
	public static ArrayList<WANHECUGUI_PRODUCT> selectAllById(ArrayList<Integer> ids){
		ArrayList<WANHECUGUI_PRODUCT> lastlylist = new ArrayList<WANHECUGUI_PRODUCT>();
		
		WANHECUGUI_PRODUCT p = null;
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			
			for (int i = 0; i < ids.size(); i++) {
				
			
				String sql = "select * from wanhecuguishop_product where PRODUCT_ID=?";
			
				ps = conn.prepareStatement(sql);
			
				ps.setInt(1, ids.get(i));
				
				rs = ps.executeQuery();
			
				while (rs.next()) {
						p = new WANHECUGUI_PRODUCT( 
							rs.getInt("PRODUCT_ID"),
							rs.getString("PRODUCT_NAME"),
							rs.getString("PRODUCT_DESCRIPTION"),
							rs.getInt("PRODUCT_PRICE"),
							rs.getInt("PRODUCT_STOCK"),
							rs.getInt("PRODUCT_FID"),
							rs.getInt("PRODUCT_CID"),
							rs.getString("PRODUCT_FILENAME")
									
						);
					lastlylist.add(p);
				
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return lastlylist;
	}
}
