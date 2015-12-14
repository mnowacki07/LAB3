package dad;

public class Pack implements Comparable {
	private int id;
	private String level;

	public Pack(int id, String level) {
		this.id = id;
		this.level = level;
	}

	@Override
	public String toString() {
		return "Pack [id=" + id + ", level=" + level + "]";
	}

	public int getId() {
		return id;
	}

	

	public String getLevel() {
		return level;
	}

	
	@Override
	public int compareTo(Object object) {
		Pack pack = (Pack) object;
		if (level.equals(pack.level)) {
			return 0;
		} else {
			if (id < pack.id) {
				return -1;
			} else if (id > pack.id) {
				return 1;
			} else {

				return level.compareTo(pack.level);
			}
		}
	}

}
