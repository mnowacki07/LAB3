package dad;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Linked extends MyAbstract {

	List<Pack> linkedList = new LinkedList<Pack>();
	Random rndm = new Random();
	Randoom randoom = new Randoom();

	final int N1 = 555555;

	public double testTimeGet() {
		final double startTime = System.currentTimeMillis();
		for (int i = 0; i < N1; i++) {
			linkedList.get(i);
		}
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);

	}

	public double testRemove() {
		final double startTime = System.currentTimeMillis();
		linkedList.clear();
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);

	}

	public double testTimeAdd() {
		final double startTime = System.currentTimeMillis();
		for (int i = 0; i < N1; i++) {
			linkedList.add(new Pack(rndm.nextInt(1001), randoom
					.generateRandomString()));
		}
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);

	}

	public double testSort() {
		final double startTime = System.currentTimeMillis();
		Collections.sort(linkedList, new Comparator() {

			public int compare(Object object1, Object object2) {

				Integer var = ((Pack) object1).getId();
				Integer var2 = ((Pack) object2).getId();
				int comp = var.compareTo(var2);

				if (comp != 0) {
					return comp;
				} else {
					String var3 = ((Pack) object1).getLevel();
					String var4 = ((Pack) object2).getLevel();
					return var3.compareTo(var4);
				}
			};
		});
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);
	}
}
