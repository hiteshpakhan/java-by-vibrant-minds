/*
JDBC API-

    JDBC API stands for java database connectiuvity 
    by using jdbc api we can perform cruds operation 
        
	-types of drivers : you can learn it from youtube


steps to connect with database
----------------------------------------------
step 1: load a driver		-(here we have to load a driver now we are using my sql driver so in practical we have load the mysql driver for that we can simple copy the dependency of that driver and past it into our dependences section into our xml file of our project it will automatically load our dependencies)
    -to load a driver we can use forName() static method of Class class		-(note class.forNAme() we use this for to load external class file)
    -forName() throws with ClasssNotFoudException hence to invoked this method we have to handle this exception 
    -Note: as per database driver can be varies
    -eg: 
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
step 2: create connection	-(before this we have created the database name jap67 into our sql database and we will connect to this database here)
    to create a connection we can use getConnection() method of DriverMAnager class
    getConnection() method can be used to create a logical connection interface
    getConnection() method requires 3 parameter {url, username, password}
    getConnnection method throws with SQLException hence to invoked this method we have to handle exception 
    eg:
        Connection con = null;
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67", "root", "Luci@714");
				System.out.println("datrabase connected");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

step 3: create Query	-(before this we have create the table named t1 into our database jap67)
	to create a query we can use string object
	eg:
	String sql = "insert into t1(name, city) values(?,?)";

step4: create Statement
	to create a statement we can use the createStatement() or prepare Statement() method of connection interface
	createStatement() method returns instance of statement interface
	prepareStatement() method returns instance of PreparedStatement interface
	PreparedStatement interface is a child interface of Statement interface 
	preparedStatement is faster than Statement because it does not create object of redundence query
	eg:
		Connection con = null;
    	PreparedStatement pst = null;
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67", "root", "Luci@714");
				String sql = "insert into t1(name, city) values(?,?)";
				pst = con.prepareStatement(sql);
				pst.setString(1, "def");
				pst.setString(2, "mumbai");
			} catch (SQLException e) {
			..
			}
		}


Step 5 : Execute Statement
	to execute a statyement, we can use executeUpdate() or executeQuery() method of statement interface
	to executeUpdate() method can be used if there is DML (insert, update, delete) query
	executeQuery() method can be used if there is DQL (select) query	
	executeUpdate() method returns int value
	executeQuery() method returns instance of ResultSet interface
	eg:
		int check = pst.executeUpdate();
	
Step 6 : close Connection:
	- to close a connection we can use finnally block
 	- connection can be closed in reverse order
	eg: 
	finally {
				try {
					pst.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	

 */

