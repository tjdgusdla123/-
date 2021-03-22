package 알고리즘;

public class 알고리즘1014 {

	public static void main(String[] args) {
	 
		int [] exint = {2,4,2,47,6,4,7,2,3,4,5};
	 
	 int value =0;
	  for (int i=0; i<exint.length; i++) {
		  System.out.println("i : " + i);
		  System.out.println("exint["+i+"] : " + exint[i]);
		  System.out.println("if문 진입합니다.");
		  if(exint[i] ==2) {
			  System.out.println("if문 들어옴");
			  value++;
			  System.out.println("value : " + value);
		  }
		  
		  System.out.println("---------------------------------");
	  }
	  System.out.println(value);
	}

}
