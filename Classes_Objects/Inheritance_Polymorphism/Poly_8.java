class Core2Web{
        void Core2Web(){
            System.out.println("In Core2Web");
        }
        
        Core2Web(){

                System.out.println("In Core2Web Constructor");
        }
}
class C2W1{

        public static void main(String[] args){

                Core2Web obj = new Core2Web();
                obj.Core2Web();                
        }
}
/*Output:
In Core2Web Constructor
In Core2Web
*/
