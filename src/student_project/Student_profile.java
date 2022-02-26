package student_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Student_profile {
	
	Statement stmt;
	ResultSet rs;
	Connection con1;
	Student_profile() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/DBMS";
		String uname="root";
		String password="Suraj@2879";
	
	    con1=DriverManager.getConnection(url,uname,password);	
	}

	public String addUser(Student_info si) throws SQLException {
		String query="insert into student values(?,?,?,?,?,?)";
		PreparedStatement ps=con1.prepareStatement(query);
		ps.setInt(1, si.getId());
		ps.setString(2,si.getName());
		ps.setString(3,si.getDepartment());
		ps.setInt(4, si.getAge());
		ps.setString(5,si.getAddress());
		ps.setString(6, si.getPhone_number());
		int r= ps.executeUpdate();
		if(r>0) {
			//ps.close();
		//	con1.close();
			return "Success";
		}else {
			return "Fail";
		}
	}

	

public String updateValue(int id,String name) throws SQLException {
	int r = 0;
	try {
	//stmt=con1.createStatement();
	PreparedStatement ps=con1.prepareStatement("update student set stdname=? where student_id=?");
	ps.setString(1,name);
	ps.setInt(2, id);
	r=ps.executeUpdate();
	if(r>0) {
//		ps.close();
//		con1.close();
		return "Update Success";
	}else {
		return "Update Failed";
	}
	}
	catch(Exception e) {
		System.out.println(e.toString());
	}
	return null;
	
}
public String deleteByID(int id) throws SQLException {
	int r = 0;
	try {
	//stmt=con1.createStatement();
	PreparedStatement ps=con1.prepareStatement("delete from student where student_id=?");
	ps.setInt(1,id);
	r=ps.executeUpdate();
	if(r>0) {
//		ps.close();
//		con1.close();
		return "Deletion Success";
	}else {
		return "Deletion Failed";
	}
	

	}
	catch(Exception e) {
		System.out.println(e.toString());
	}
	return null;
	}
public void displaybyID(int id) throws SQLException {
	PreparedStatement ps=con1.prepareStatement("select * from student where student_id=?");
	ps.setInt(1, id);
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+
				"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
	}
//	ps.close();
//	con1.close();
}


public void display() throws SQLException {
	PreparedStatement ps=con1.prepareStatement("select * from student");
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+
				"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
	}
//	ps.close();
//	con1.close();
}

}
