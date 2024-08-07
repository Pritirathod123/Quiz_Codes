import java.util.StringTokenizer;
class Demo2{
        public static void main(String [] args){
		
                String str1 = "0,1,2,3,4,5,6,7,8,9";
		StringTokenizer st = new StringTokenizer(str1,",");
		System.out.println(st.countTokens());
	}
}

