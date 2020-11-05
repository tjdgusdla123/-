package 알고리즘1031;

public class JavaPractice {

	public static void main(String[] args) {
//해결찝찝하게
//		int a[] = new int [5];
//		int i ;
//		for (i=0; i<5; i++) {
//			a[i] = i+10;
//	
//	       for(i=0; i<5; i++) 
//	 			
//				System.out.printf("%4d",a[i]);
		
//=================================================================	
//		//문자열 거꾸로 출력
//		String str = "Information!";
//		int n =str.length();
//		System.out.println(str.length());
//		char [] st = new char[n];
//		n--;
//		for(int k = n; k >=0; k--) {
//			st[n-k] = str.charAt(k);//charAt문장중에 인덱스 위치에 해당되는 문자 추출
		//이해잘안감
//			System.out.println(st[n-k] = str.charAt(k));
//		}
//			for(char k : st) {
//				System.out.println(k);
//			}
		
//==========================================================================
	//이부분도 이해가안갔지만 해결
//		int [] [] a = {{11,12,13,14},{21,22,23,24}};
//		int hap =0;
//		for(int i[] :a) {
//			System.out.println();
//			
//			for(int j: i) {
//				System.out.println(hap);
//				hap = hap +j;
//			}
//		}
//		System.out.println(hap);
//		==========================================
//		String str ="Programming";
//		int n = str.length();
//		char[] st = new char[n];
//		n--;
//		for (int k = n; k >= 0; k--) {
//			st[n-k] = str.charAt(k);
//		}
//		for (char k : st) {
//			System.out.printf("%c",k);
//		}
//=======================================
		//이해안갔지만 해결했음 
//		int [][] a = new int [3][5];
//		
//		for(int i=0; i<3; i++) {
//			for(int j =0; j<5; j++) {
//				 a[i][j]= i+j;
//				// System.out.println(a[i][j]);
//				// System.out.println("i"+i);
//				// System.out.println("j"+j);
//				//System.out.println("i+j"+i+j);
//				// System.out.println("a[0][1]"+a[0][1]);
//				 System.out.printf("%d",a[i][j]);
//			}
//		System.out.println();
//		}
		//=====================================
//		int i,j =0;
//		for (i =0;i<8; i++) {
//			j+=i;
//			System.out.println(j);
//		}
//		System.out.printf("%d,%d\n",i,j);
	//	==========================================
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				if(j*i==18 ) {
//					System.out.println("출력");
//				}
//				
//				System.out.println(i+"x"+j+"="+i*j);
//				
//				}
//				
//	=================================		
//		}
//		int  i ,hap=0;
//		for(i=1; i<=10; i++) {
//			hap+=i;
//			
//		}
//		System.out.printf("%d,%d\n",i,hap);
		//====================================
		
//		int hap1, hap2;
//		hap1 = 10+10%4-10%9;
//		hap2 = 10*10%4-10%9+5;//10*10%4는 100%4가 되어 0이되고,10%9는 1이니, 결국 식은0 - 1 + 5.(답은 나왔지만 이해가안감)
//		System.out.printf("%d,%d\n",hap1,hap2);
//		
		//==============================================================
//		
//		String str;
//		str = "dkxkgh98!";
//		
//	System.out.printf("%9.6s\n",str);9자리를 확보한후 앞에서 6자리까지만 출력해라는 뜻
		//==============================================================
//           int ch = 'A';
//           System.out.printf("%c,%d\n",ch,ch); %c는 유니코드 문자를 출력한다
		//==============================================================
//		int i=0, hap=0;
//		for(i = 1; i<=5; ++i,hap+=i);//;이게있고 없고에서 차이가난다  ;있으면  6,20을출력하지만(최종값)		
//		1,0이런식으로 쭉계산해서 5,14까지만 출력된다.(최종값의 전값)
		//	System.out.printf("합은%d %4d입니다.\n",i,hap);
		    //System.out.println(hap);

		//======================================================================
		
//		int a, hap=0;
//		for(a=0; a<10; ++a,hap+=a);
//		System.out.printf("합은%d %4d입니다.\n",a,hap);
//		
//======================================
		//1부터100까지 더하기
//		int i=0,hap=0;
//		for( i=0; i<100; ++i,hap+=i); 
//			
//		System.out.println(hap);
		
		//=========================================
//		내가 이해한 방법이 맞는지 확인하기
//		int numAry[] = {0,0,0,0,3};
//		int i,j;
//		for(j =4; j>=0; --j) {
//			for(i=4;i>j; --i) {
//				numAry[j]+=numAry[i];
//			}
//		}
//		for(j=0;j<5; ++j) {
//			System.out.println(numAry[j]);
//		}
//		System.out.println(numAry[3]);
//		
		//====================================
//		int i =0, hap =0;
//		for(i=1; i<=100; ++i)
//			hap = hap+i;
//			System.out.printf("%d, %d입니다\n",i,hap);
//		
		//===================================================
	
//		float hap ,a,d;
//		hap =1; 
//		a=1;
//       do {
//    	   d= 1/a;
//    	   hap +=d;
//    	   a++;
//    	   System.out.println("d :"+d);
//    	   System.out.println(hap);
//       }while(a<=10); 
//    	   System.out.printf("%f",hap);
//       
//===========================================================		
	}
          
}