class Demo1{
        Demo1(){
                System.out.println("In Demo1");
        }
}
class Demo2 extends Demo1{

}
class Demo3 extends Demo1{

        Demo3(){
                this();
                System.out.println("In Demo 3");
        }
}
class Demo4 extends Demo3{

        Demo4(){
                super();
        }
}
class Client2{

        public static void main(String[] args){
                Demo4 obj = new Demo4();
        }
}
