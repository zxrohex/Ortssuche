import java.util.ArrayList;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Ort> orte = DBService.liesAlles();
		
		for (int i = 0; i < orte.size(); i++) {
			Ort ort = orte.get(i);
			
			System.out.println(ort);
		}
	}

}
