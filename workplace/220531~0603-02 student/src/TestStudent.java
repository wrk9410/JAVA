
public class TestStudent {
	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 100, 90, 80);
		Student student2 = new Student("둘리", 60, 70, 80);
		Student student3 = new Student("도우너");
		
		ClassRoom room = new ClassRoom(
				student1
				, student2
				, student3);
		
		
//		System.out.println
//			(room.getStu1().getName());
		room.printNames();
		int avg = room.getTotalAvg();
		System.out.println(avg);
		
		Student top = room.getTop();
		System.out.println("1등: " + top.getName());
		
		
		
// 
		/*int avg1 = student1.getAverage();
		System.out.println("홍길동 평균: "+avg1);
		

		int avg2 = student2.getAverage();
		
		int avg3 = student3.getAverage();
		
		int sum = avg1 + avg2 + avg3;
		int totalAvg = sum / 3;
		
		System.out.println("3명의 학생 평균: "+totalAvg);
		*/
	}
}
