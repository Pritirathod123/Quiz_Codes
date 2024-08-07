import java.util.StringTokenizer;
class Demo4{
        public static void main(String [] args){

                String str1 = "Core2Web@biencaps";
                StringTokenizer st = new StringTokenizer(str1,"2@");
                System.out.println(st.countTokens());
        }
}


            

