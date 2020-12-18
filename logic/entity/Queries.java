package entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {
	
	public static ResultSet selectUserByName(Statement stmt, String email) throws SQLException  {
        String sql = "SELECT * FROM user where email = '" + email + "';";
        System.out.println(sql);
        return stmt.executeQuery(sql);
    }

    public static ResultSet selectUserIds(Statement stmt) throws SQLException  {
        String sql = "SELECT DISTINCT email FROM user ;";
        System.out.println(sql);
        return stmt.executeQuery(sql);
    }
    
//   
//    public static int aggiornaAlbum(Statement stmt, Album album) throws SQLException  {
//        String updateStatement = String.format("UPDATE  Album set Titolo='%s', Artista='%s', Anno=%s WHERE AlbumId = %s", album.getArtista(), album.getTitolo(), album.getAnno(), album.getAlbumId());
//        System.out.println(updateStatement);
//        return stmt.executeUpdate(updateStatement);
//    }
//    
     public static int deleteUser(Statement stmt, User user) throws SQLException  {
        String deleteStatement = String.format("DELETE FROM  user  WHERE email = '%s'", user.getEmail());
        System.out.println(deleteStatement);
        return stmt.executeUpdate(deleteStatement);
    }
    
    public static void stampaResultSet( Statement stmt) throws SQLException{
        try (ResultSet res = stmt.executeQuery("SELECT * FROM Album")) {
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artista"), res.getString("Titolo"), res.getInt("Anno"));
            }
        }
    }

	public static int addUser(Statement stmt, User user) throws SQLException {
		String insertStatement = String.format("INSERT INTO user (id, name, surname, email, password) VALUES (%s,'%s','%s','%s', '%s')", "NULL", user.getName(), user.getSurname(), user.getEmail(), user.getPassword());
		System.out.println(insertStatement);
		return stmt.executeUpdate(insertStatement);
	}
	
}
