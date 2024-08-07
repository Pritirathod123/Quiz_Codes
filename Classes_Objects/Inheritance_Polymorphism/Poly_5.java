class Demo1{

        Demo1(){
                System.out.println("Demo1 - constructor");
        }
}
class Demo2 extends Demo1{

}
class Demo3 extends Demo2{

        Demo3(){
                super();
                System.out.println("Demo3 - constructor");
        }
}
class Client1{

        public static void main(String[] args){

                Demo1 Obj = new Demo3();
        }
}
