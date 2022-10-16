package com.expleo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class RegisterDAOImpl implements RegisterDAO{
	
	private DataSource dataSource;
	
	 public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }
	
	public void insert(Register register)
	   {
		   String sql = "insert into Register "+"(NAME,EMAIL,PASSWORD,GENDER,QUALIFICATION,ADDRESS,CITY,STATE,PINCODE) values(?,?,?,?,?,?,?,?,?)";
		   Connection conn = null;
		   try
		   {
			   conn = dataSource.getConnection();
			   PreparedStatement ps = conn.prepareStatement(sql);
			   ps.setString(1, register.getName());
			   ps.setString(2, register.getEmail());
			   ps.setString(3, register.getPassword());
			   ps.setString(4, register.getGender());
			   ps.setString(5, register.getQualification());
			   ps.setString(6, register.getAddress());
			   ps.setString(7, register.getCity());		   
			   ps.setString(8, register.getState());
			   ps.setString(9, register.getPincode());
			   ps.executeUpdate();
			   System.out.println("values inserted successfully");
			   ps.close();
		  }
		   catch(Exception e)
		   {
			   throw new RuntimeException(e);
		   }
		   finally
		   {
			   if(conn!=null)
			   {
				   try
				   {
					   conn.close();
				   }
				   catch(Exception e)
				   {
					   throw new RuntimeException(e);
				   }
			   }
		   }
	   }
	public void insert1(Veg veg)
	   {
		   String sql = "insert into Veg "+"(NAME,INGREDIENTS,DESCRIPTION) values(?,?,?)";
		   Connection conn = null;
		   try
		   {
			   conn = dataSource.getConnection();
			   PreparedStatement ps = conn.prepareStatement(sql);
			   ps.setString(1, veg.getName());
			   ps.setString(2, veg.getIngredients());
			   ps.setString(3, veg.getDescription());
			   ps.executeUpdate();
			   System.out.println("values inserted successfully");
			   ps.close();
		  }
		   catch(Exception e)
		   {
			   throw new RuntimeException(e);
		   }
		   finally
		   {
			   if(conn!=null)
			   {
				   try
				   {
					   conn.close();
				   }
				   catch(Exception e)
				   {
					   throw new RuntimeException(e);
				   }
			   }
		   }
	   }
	public void insert2(NonVeg nveg)
	   {
		   String sql = "insert into NonVeg "+"(NAME,INGREDIENTS,DESCRIPTION) values(?,?,?)";
		   Connection conn = null;
		   try
		   {
			   conn = dataSource.getConnection();
			   PreparedStatement ps = conn.prepareStatement(sql);
			   ps.setString(1, nveg.getName());
			   ps.setString(2, nveg.getIngredients());
			   ps.setString(3, nveg.getDescription());
			   ps.executeUpdate();
			   System.out.println("values inserted successfully");
			   ps.close();
		  }
		   catch(Exception e)
		   {
			   throw new RuntimeException(e);
		   }
		   finally
		   {
			   if(conn!=null)
			   {
				   try
				   {
					   conn.close();
				   }
				   catch(Exception e)
				   {
					   throw new RuntimeException(e);
				   }
			   }
		   }
	   }


	}



