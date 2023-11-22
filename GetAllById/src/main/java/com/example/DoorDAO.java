package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DoorDAO {

	
	public Doors getById(int id) throws SQLException, ClassNotFoundException {
		Connection con = DBHelper.getConnection();
		String qyerry = "Select * from doors where id = ?";
		PreparedStatement ps = con.prepareStatement(qyerry);
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
		Doors d = new Doors(rs.getInt("id"),
				rs.getString("material"),
				rs.getDouble("height"),
				rs.getDouble("width"),
				rs.getDate("installationDate"));
		DBHelper.closeConnection();
		return d;
		}
		
		DBHelper.closeConnection();
		 return null;
	}
	
	public ArrayList<Doors> getAllDoors() throws SQLException {
		Connection con = DBHelper.getConnection();
		String querry = "Select * from doors";
		PreparedStatement ps = con.prepareStatement(querry);
		ResultSet rs = ps.executeQuery();
		ArrayList<Doors> door = new ArrayList<>();
		while(rs.next()) {
			Doors d = new Doors(rs.getInt("id"),
					rs.getString("material"),
					rs.getDouble("height"),
					rs.getDouble("width"),
					rs.getDate("installationDate"));
			door.add(d);
		}
		con.close();
		return door;

		
		 
	}
	
}