class DemoC{
        DemoC(){
                System.out.println("In constructor");
                System.out.println(this);
                System.out.println("--/--");
        }
        public static void main(String[] args){

                Demo obj = new Demo();
                System.out.println("In main");
                System.out.println(obj);

        }
}

