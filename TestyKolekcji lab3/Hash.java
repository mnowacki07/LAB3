package dad;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Random;
import java.util.Set;

public class Hash extends MyAbstract {
	Set<Pack> hashSet = new HashSet<Pack>();
	Random rndm = new Random();
	Randoom randoom = new Randoom();

	final int N1 = 555555;

	public double testRemove() {
		final double startTime = System.currentTimeMillis();
		hashSet.clear();
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);

	}

	public double testTimeGet() {
		final double startTime = System.currentTimeMillis();
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			iterator.next();
		}
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);

	}

	public double testSort() {

		return 0;
	}

	public double testTimeAdd() {
		final double startTime = System.currentTimeMillis();
		for (int i = 0; i < N1; i++) {
			hashSet.add(new Pack(rndm.nextInt(1001), randoom
					.generateRandomString()));
		}
		final double endTime = System.currentTimeMillis();
		return (endTime - startTime);

	}

}
