package sampleGit;

public class exm {

	public static void main(String[] args) {
		System.out.println("hello world!");
		
		String [] hello = {"1","2","3",null,"5"};
		
		for(String hi : hello){
			System.out.print(hi);
			System.out.print("\t");
			
		}
		System.out.println();
		System.out.println("master");
		
		newPrint np = new newPrint();
		boolean result = np.isExt(hello);
		System.out.println("is All String ? : "+Boolean.toString(result));

	}

}
