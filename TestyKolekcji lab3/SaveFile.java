package dad;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveFile {

	public void saveFile() throws FileNotFoundException {
		Array array = new Array();
		Linked linked = new Linked();
		Hash hash = new Hash();
		Tree tree = new Tree();
		LinkedHash linkedHash = new LinkedHash();

		PrintWriter save = new PrintWriter("test.txt");
		save.println("Testowanie array:");

		save.println("Dodawanie  " + array.testTimeAdd());
		save.println("Pobieranie  " + array.testTimeGet());
		save.println("Sortowanie  " + array.testSort());
		save.println("Usuwanie  " + array.testRemove());

		save.println("Testowanie linked:");

		save.println("Dodawanie  " + linked.testTimeAdd());
		/* zapis.println("Pobieranie  "+linked.testTimeGet()); */
		save.println("Sortowanie  " + linked.testSort());
		save.println("Usuwanie  " + linked.testRemove());

		save.println("Testowanie hashset:");

		save.println("Dodawanie  " + hash.testTimeAdd());
		save.println("Pobieranie  " + hash.testTimeGet());
		save.println("Brak sortowania wynik 0  " + hash.testSort());
		save.println("Usuwanie  " + hash.testRemove());

		save.println("Testowanie TreeSet:");
		save.println("Dodawanie  " + tree.testTimeAdd());
		save.println("Pobieranie  " + tree.testTimeGet());
		save.println("Sortowanie  " + tree.testSort());
		save.println("Usuwanie  " + tree.testRemove());

		save.println("Testowanie LinkedHashSet:");
		save.println("Dodawanie  " + linkedHash.testTimeAdd());
		save.println("Pobieranie  " + linkedHash.testTimeGet());
		save.println("Sortowanie  " + linkedHash.testSort());
		save.println("Usuwanie  " + linkedHash.testRemove());

		save.close();
	}
}
