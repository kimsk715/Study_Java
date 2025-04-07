package classTest;

public class CategoryA {
	String categoryAname;
	CategoryB[] categoryB;

	public CategoryA() {;}

	public CategoryA(CategoryB[] categoryB, String categoryAname ) {
		this.categoryB = categoryB;
		this.categoryAname = categoryAname;
	}
	
}
