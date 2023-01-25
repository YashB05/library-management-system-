package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Login;
import model.Register;

public class RegisterDao {
	Connection con=DataSource.getConnection();
	
	public int Create(List<Register> lstreg) {
		Register regmodel=lstreg.get(0);
		int i=0;
		System.out.println("ENtered in create");
		try {
			System.out.println("hello");
			PreparedStatement pstate=con.prepareStatement("insert into LMSmemb values(?,?,?,?,?,?)");
			pstate.setString(1, regmodel.getFname());
			pstate.setString(2, regmodel.getLname());
			pstate.setString(3, regmodel.getGender());
			pstate.setDouble(4, regmodel.getMobno());
			pstate.setString(5, regmodel.getUname());
			pstate.setString(6, regmodel.getPass());
			
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
		
	}
	public List<Register> ValidateData(List<Login> lstlogin){
		boolean b=true;
		Login loginmodel=lstlogin.get(0);
		List<Register> lstreg=null;
		Connection con=DataSource.getConnection();
		
		try {
			PreparedStatement pstate=con.prepareStatement("select * from LMSmemb where uname=? and pass=?");
			pstate.setString(1, loginmodel.getUname());
			pstate.setString(2, loginmodel.getPass());
			
			ResultSet rs=pstate.executeQuery();
			if(rs.next()) {
				b=true;
				lstreg=new ArrayList();
				Register r=new Register(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6));
				lstreg.add(r);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstreg;
	}
	
}


