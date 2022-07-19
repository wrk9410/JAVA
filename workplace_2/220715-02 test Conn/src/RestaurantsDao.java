import java.sql.SQLException;
import java.util.List;

public interface RestaurantsDao {
	int create(String name, String phoneNumber, String address) throws SQLException;
	
	List<Restaurants> read() throws SQLException;
	Restaurants read(int id) throws SQLException;
	
	int update(int id, String name, String phoneNumber, String address) throws SQLException;
	
	int delete(int id) throws SQLException;
	
}
