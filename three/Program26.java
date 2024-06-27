/*
JDBC API-

    JDBC API stands for java database connectiuvity 
    by using jdbc api we can perform cruds operation 
        
types of drivers : you can learn it from youtube

step 1: load a driver
    to load a driver we can use forName() static method of Class class
    forName() throws with ClasssNotFoudException hence to invoked this method we have to handle this exception 
    Note: as per database driver can be varies
    eg: 
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
step 2: create connection
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

step 3:



 */