class Demo{

        Demo(){
                System.out.println("in Demo -1");
        }
        Demo(String name){
                System.out.println(name+" in Demo-2");
        }
        Demo(int num){
                System.out.println(num+" in Demo -3");
        }
        public static void main(String[] args){
                Demo obj1 = new Demo();
                Demo obj2 = new Demo(100);
                Demo obj3 = new Demo("Coder");
        }

}
