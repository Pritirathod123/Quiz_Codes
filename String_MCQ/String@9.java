import java.util.StringTokenizer;
class Demo9{
        public static void main(String [] args){

                String str1 = "Core2Web@biencaps";
                StringTokenizer st = new StringTokenizer(str1,"");
                while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
        }
}
