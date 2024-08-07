class C2W{

        void C2W(){

                System.out.println("In C2W");
        }
}
class ClientA{

        public static void main(String[] args){

                C2W obj = new C2W();
                obj.C2W();
        }

}
