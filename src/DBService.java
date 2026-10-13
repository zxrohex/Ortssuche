import java.sql.*;
import java.util.ArrayList;

public class DBService {
	public static ArrayList<Ort> liesAlles() {
		ArrayList<Ort> orte = new ArrayList<Ort>();
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/orte", "root", "")) {
			Statement stm = con.createStatement();
			
			ResultSet set = stm.executeQuery("SELECT Plz, Ort, Bundesland FROM postleitzahlen");
			
			while (set.next()) {
				for (int i = 1; i < set.getMetaData().getColumnCount(); i += 3) {
					int plz = set.getInt(i);
					
					String ortsname = set.getString(i + 1);
					
					String bundesland = set.getString(i + 2);
					
					Ort ort = new Ort(plz, ortsname, bundesland);
					
					orte.add(ort);
				}
			}
			
			set.close();
			
			stm.close();
			
			return orte;
		}
		catch (SQLException sqlEx) {
			
		}
		
		return null;
	}
}
