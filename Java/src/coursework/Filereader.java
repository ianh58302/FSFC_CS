package coursework;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Filereader {

	public static void main(String[] args) {
		List<Contacts> contactsList = new ArrayList<Contacts>();
		BufferedReader br = null;
		String Line="";
		try {

			

			br = new BufferedReader(new FileReader("C:\\Users\\CompUser\\Documents\\Contact manager\\Test.txt"));

			while ((Line = br.readLine()) != null) {
				System.out.println(Line);
				String[] myList = Line.split(",");
				Contacts c1 = new ContactsImpl(myList[0],myList[1],myList[2]);
				contactsList.add(c1);
			
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			
			}
			
		}
	
	}
}
