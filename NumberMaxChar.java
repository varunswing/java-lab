import java.util.*;
class NumberMaxChar{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=s1.toLowerCase();
		char ch[]=s2.toCharArray();
		int a[]=new int[ch.length];
		for (int n=0;n<ch.length ;n++ ) {
			a[n]=0;
		}
		int k=0;
		for (int i=0;i<ch.length ;i++ ) {
			for (int j=0;j<ch.length ;j++ ) {
				if(ch[i]==ch[j]){
					a[k]+=1;
				}
			}
			k++;
		}
		int m=0,max=a[0];
		for (int i=0;i<ch.length ;i++ ) {
			if(a[0]<a[i]){
				max=a[i];
				m=i;
			}
		}
		System.out.println(ch[m]);
	}
}