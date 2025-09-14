public class intanceVariable {

    int a = 10;  //intance variable : variable that is inside class and outside function. 
    
    public int myFun(){
        return a * a;
    }
    public static void main(String[] args) {
        intanceVariable  obj1 = new intanceVariable ();
        int result = obj1.myFun();   
        System.out.println(result);
    }
}