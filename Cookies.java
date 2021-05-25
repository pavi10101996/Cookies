
import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Cookies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// code 
		try {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				String[] arr = new String[n];
				for(int i=0; i<arr.length; i++) {
					arr[i] = sc.next();
				}
				
				boolean flag = true;
				
				if(n==1 && arr[0].equals("cookie") || arr[n-1].equals("cookie")) {
					flag = false;
				}
				
				for(int i=0; i<arr.length-1; i++) {
					if(arr[i].equals("cookie") && !arr[i+1].equals("milk")) {
						flag = false;
						break;
					}
				}
				
				if(!flag) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}
			}
		}catch(Exception e) {
			return;
		}
	}
}