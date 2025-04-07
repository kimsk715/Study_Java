package objectTest;

public class Student {
	private static int seq;
	private int id;
	private String name;
	private int score;
	
	static
	{
		seq=0;
	}
	
	{
		++seq;
	}
	
	public Student() {;}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
// alt shift s+s
 	@Override 
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
 	@Override
 	public boolean equals(Object obj) {
 		// TODO Auto-generated method stub
 		return super.equals(obj);
 	}
	
}
