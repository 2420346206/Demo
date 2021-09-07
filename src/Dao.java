import java.sql.*;

public class Dao {
    protected static String dbClassName = "com.mysql.cj.jdbc.Driver";
    protected static String dbUrl = "jdbc:mysql://localhost:3306/y?&allowPublicKeyRetrieval=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL";
    protected static String dbUser = "root";
    protected static String dbPwd = "mima257489";
    private static Connection conn = null;
    private static PreparedStatement ps;
    private static ResultSet rs;

    private Dao() {
        try {
            if (conn == null) {
                Class.forName(dbClassName).newInstance();
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
            } else {
                return;
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public static void close() {
        try {
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn = null;
        }
    }

    public static User checkUser(String userID, String password){
        User user = new User();
        try {
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
            ps = conn.prepareStatement("select * from user where userID=? and password=?");
            ps.setString(1, userID);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                user.setUserID(rs.getString("ID"));
                user.setUserName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            Dao.close();
        }
        return user;

    }


}
