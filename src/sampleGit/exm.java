package sampleGit;

public class exm {

	public static void main(String[] args) {
		System.out.print("hello world!");
		
		String [] hello = {"1","2","3",null,"5"};
		
		for(String hi : hello){
			System.out.println(hi);
			
		}
		System.out.println("master");
		
		newPrint np = new newPrint();
		boolean result = np.isExt(hello);
		System.out.println(Boolean.toString(result));

	}

}
