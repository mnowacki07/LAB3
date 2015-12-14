package dad;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Tree extends MyAbstract {
	Set<Pack> tree = new TreeSet<Pack>();
	Random rndm = new Random();
	Randoom randoom = new Randoom();

	final int N1 = 555555;

	public double testTimeGet() {
		final double startTime = System.currentTimeMillis();
		Iterator iterator = tree.iterator();
		while (iterator.hasNext()) {
			iterator.next();
		}
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);

	}

	public double testRemove() {
		final double startTime = System.currentTimeMillis();
		tree.clear();
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);

	}

	public double testTimeAdd() {
		final double startTime = System.currentTimeMillis();
		for (int i = 0; i < N1; i++) {
			tree.add(new Pack(rndm.nextInt(1001), randoom
					.generateRandomString()));
		}
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);

	}

	public double testSort() {

		return 0;
	}

}
