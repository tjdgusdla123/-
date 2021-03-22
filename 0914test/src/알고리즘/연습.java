package 알고리즘;
public class 연습 {
//순서바꾸기
	
	static class AAclass{		
	 
 int i;
 int j;

}
	public static void main(String[] args) {
       AAclass myVar = new AAclass();
       myVar.i = 10;
       myVar.j = 20;
       myVar = change(myVar);
       
       System.out.printf("i=%d, j=%d\n",myVar.i,myVar.j);

	}
	 static AAclass change(AAclass myVar) {
		int temp;
		
		temp =myVar.i;
		System.out.println(temp);
		myVar.i =myVar.j;
		System.out.println(myVar.i);
		myVar.j = temp;
		System.out.println(myVar.j);
		System.out.println(myVar);
		return myVar;
		
	}

}
