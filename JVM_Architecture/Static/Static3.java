class TestDemo3{
           static void main(){
                System.out.println("only void Main");

        }
        public static void main(String[] args){

                System.out.println("Inside Original Main");
               main();
        }
}
