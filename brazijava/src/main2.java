
public class main2 {
	public static void main(String[] args) {
		

		DataBase db = new DataBase();
		db.connect_to_db("JDBC","postgres", "paontri");
		choiceW choicewindow = new choiceW();
	}
}