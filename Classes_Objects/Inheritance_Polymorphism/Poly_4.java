class Demo2 extends Demo1 {

}

class Demo3 extends Demo2 {

    Demo3() {
        super();
        System.out.println("Demo3 - constructor");
    }
}

class Client {

    public static void main(String[] args) {
        Demo1 obj = new Demo3();
    }
}

