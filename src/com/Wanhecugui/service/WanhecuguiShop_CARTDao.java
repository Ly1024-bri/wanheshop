package com.Wanhecugui.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Wanhecugui.dao.Basedao;
import com.Wanhecugui.entity.WANHECUGUI_CART;

public class WanhecuguiShop_CARTDao {
	public static int insert(WANHECUGUI_CART cart){
		
		String sql = "insert into wanhecuguishop_cart values(null,?,?,?,?,?,?,?,1)";
		
		Object[] params = {
				cart.getCart_p_filename(),
				cart.getCart_p_name(),
				cart.getCart_p_price(),
				cart.getCart_quantity(),
				cart.getCart_p_stock(),
				cart.getCart_p_id(),
				cart.getCart_u_id()
				
		};
		
		return Basedao.exectuIUD(sql, params);
	}
	
	public static WANHECUGUI_CART getCartShop(String id){
		WANHECUGUI_CART es = null;
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_cart where cart_id=? and cart_valid=1 order by cart_id desc";
			
			ps = conn.prepareStatement(sql);
				
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				es = new WANHECUGUI_CART( 
					rs.getInt("cart_id"),
					rs.getString("cart_p_filename"),
					rs.getString("cart_p_name"),
					rs.getInt("cart_p_price"),
					rs.getInt("cart_quantity"),
					rs.getInt("cart_p_stock"),
					rs.getInt("cart_p_id"),
					rs.getString("cart_u_id"),
					rs.getInt("cart_valid")
				);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return es;
	}

	public static WANHECUGUI_CART getCartShop(String uid,String pid){
		WANHECUGUI_CART es = null;
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_cart where cart_u_id=? and cart_p_id=? and cart_valid=1 order by cart_id desc";
			
			ps = conn.prepareStatement(sql);
				
			ps.setString(1, uid);
			ps.setInt(2, Integer.parseInt(pid));
			rs = ps.executeQuery();
			
			while (rs.next()) {
				es = new WANHECUGUI_CART( 
					rs.getInt("cart_id"),
					rs.getString("cart_p_filename"),
					rs.getString("cart_p_name"),
					rs.getInt("cart_p_price"),
					rs.getInt("cart_quantity"),
					rs.getInt("cart_p_stock"),
					rs.getInt("cart_p_id"),
					rs.getString("cart_u_id"),
					rs.getInt("cart_valid")
				);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return es;
	}
		

	public static ArrayList<WANHECUGUI_CART> getCart(String id){
		ArrayList<WANHECUGUI_CART> list = new ArrayList<WANHECUGUI_CART>();
		//声明结果集
		ResultSet rs = null;
		//获取连接对象
		Connection conn = Basedao.getconn();
		
		PreparedStatement ps = null;
		
		try {
			String sql = "select * from wanhecuguishop_cart where cart_u_id=? and cart_valid=1 order by cart_id desc";
			
			ps = conn.prepareStatement(sql);
				
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				WANHECUGUI_CART c = new WANHECUGUI_CART( 
					rs.getInt("cart_id"),
					rs.getString("cart_p_filename"),
					rs.getString("cart_p_name"),
					rs.getInt("cart_p_price"),
					rs.getInt("cart_quantity"),
					rs.getInt("cart_p_stock"),
					rs.getInt("cart_p_id"),
					rs.getString("cart_u_id"),
					rs.getInt("cart_valid")
				);
				list.add(c);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			Basedao.closeall(rs, ps, conn);
			
		}
		return list;
	}
	
	public static int updatenum(int esid,int count){
		
		String sql = "update wanhecuguishop_cart set cart_quantity=? where cart_id=?";
		
		Object[] params = {count,esid};
		
		return Basedao.exectuIUD(sql, params);
	}
	
	public static int getDeleteDD(int id){
		String sql = "delete from wanhecuguishop_cart where cart_id=?";
		
		Object[] params = {id};
		
		return Basedao.exectuIUD(sql, params);
	}
}
