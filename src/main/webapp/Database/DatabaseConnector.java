package Database;

import Classes.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnector {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "1267476";//каждый ставит свой пароль!!!
    public Connection connect(){
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public boolean addAccount(Account acc){
        DatabaseConnector db = new DatabaseConnector();
        String SQL = "insert into accounts(fullname, login, email, birthdate, passwords, genders) values(?,?,?,to_date(?, 'YYYY-MM-DD'),?,?);";
        try(
                Connection conn = db.connect();
                PreparedStatement stmt = conn.prepareStatement(SQL)
                ){
            stmt.setString(1, acc.getFullname());
            stmt.setString(2, acc.getLogin());
            stmt.setString(3, acc.getEmail());
            stmt.setString(4, acc.getBirthdate());
            stmt.setString(5, acc.getPassword());
            stmt.setString(6, acc.getGender());
            stmt.executeUpdate();
            return true;
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
