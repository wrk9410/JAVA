import java.time.LocalDate;

public interface DiaryMange {
	void add(Diary d);
	void list();
	void edit(LocalDate day, String content);
	void deleteFirst();
	
}

