package recursion___type__2__printing;

public class climbing__stairs {

	public static void main(String[] args) {
		climb(4, "", 0);

	}
	public static void climb(int stairs , String path ,int start) {
		if(stairs==start) {
			System.out.println(path);
			return ;
			}
		if(stairs<start) {
			return ;
		}
		climb(stairs,path+"1",start+1) ;
		climb(stairs,path+"2",start+2) ;
		
	}

}
