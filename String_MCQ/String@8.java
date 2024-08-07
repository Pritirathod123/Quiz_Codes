import java.util.StringTokenizer;
class Demo8{
        public static void main(String [] args){

                String str1 = "Core2Web";
                StringTokenizer st = new StringTokenizer(str1,"Core2Web");
                System.out.println(st.nextTokens());
        }
}
