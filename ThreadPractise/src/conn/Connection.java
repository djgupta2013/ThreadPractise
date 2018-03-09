package conn;


import java.sql.DriverManager;

final public class Connection 
{
	static java.sql.Connection conn=null;
	private Connection()
	{}

	public static synchronized Connection getConnection()
	{
		if(conn==null)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dj","root","12345");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return null;

	}

}