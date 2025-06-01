package thread;

import java.sql.*;

public class slip11q2 {

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	    Class.forName("org.postgresql.Driver");
	    Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybcs","postgres","root");
		Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select *from donar");
        ResultSetMetaData rmsd=rs.getMetaData();
        int ns=rmsd.getColumnCount();
        System.out.println("number of columns="+ns);
        for(int i=1;i<ns;i++)
        {
        	System.out.println("column no:"+i);
        	System.out.println("Column Name"+rmsd.getColumnName(i));
        	System.out.println("type="+rmsd.getColumnTypeName(i));
        	System.out.println("display size="+rmsd.getColumnDisplaySize(i));
        }
	}

}