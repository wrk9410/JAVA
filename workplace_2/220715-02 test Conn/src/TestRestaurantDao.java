import java.sql.SQLException;
import java.util.Arrays;


// 외래키 만들 수 있을 때 : TABLE을 만들 때, TABLE 수정할 때

/* MySQL : TABLE 만들 때
 * CREATE TABLE zxcv (
 * 	, PRIMARY KEY (asldkfj)
 *  , 
 * 
 * 
 * */

public class TestRestaurantDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDaoImpl();
		
		
		try {
			// Restaurants 추가
//			int result = dao.create("테스트중1", "1234-5555", "부산 어쩌구");
//			System.out.println(result == 1);
			
			// Restaurants 전체 목록 확인
//			System.out.println(dao.read());
//			System.out.println(dao.read(3));
			
			// Restaurants id의 목록 수정
//			int result = dao.update(1, "대대모골", "9874-1235", "부산 진구 어딘가");
//			System.out.println(result == 1);
//			System.out.println(dao.read(1));
			
			// Restaurants id의 목록 삭제
//			int result = dao.delete(4);
//			System.out.println(result == 1);
//			System.out.println(dao.read());
			
			// Restaurants 여러행 추가
			RestaurantsDaoImpl impl = (RestaurantsDaoImpl) dao;
			int[] result = impl.create(Arrays.asList(
					new Restaurants(0, "배치1", "0101-0202", "배치주소1")
					, new Restaurants(0, "배치2", "0201-0202", "배치주소2")
					, new Restaurants(0, "배치3", "0301-0202", "배치주소3")
					, new Restaurants(0, "배치4", "0401-0202", "배치주소4")));
			System.out.println(Arrays.toString(result));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
