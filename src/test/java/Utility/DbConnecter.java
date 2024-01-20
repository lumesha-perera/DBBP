import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnecter {
    static DbConnecter Dbcon;

    public DbConnecter(){

    }
    public Connection getConn(String url, String pwd, String user) throws Exception {
        Connection conn = DriverManager.getConnection(url, user, pwd);

        if (conn == null)
            throw new RuntimeException("Database connection is null");

        return conn;
    }

    public static DbConnecter getDBConnection(){
        if(Dbcon == null){
            Dbcon = new DbConnecter();
        }
        return Dbcon;
    }
}
