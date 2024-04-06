package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try{
//            System.out.println(10/0);
//            divide(10,0);
//            once an exception is caught other lines of try dont run so other catch blocks are also ignored.
            String name = "kunal";
            if(name.equals("kunal")){
                throw new MyException("This is kunal");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){ // more strict or specific exceptions should be mentioned before the less specific exceptions.
            System.out.println(e.getMessage());
        }
        catch(Exception e){ // here refernce can be of type the exact expection that u think will occur(in this case ArithmeticException) or
            // it can be of type of its parent classes(RuntimeException-> Exception-> Throwable).
            System.out.println(e.getMessage());
        }
//        Multiple catch blocks for single try block allowwed but multiple try blocks not allowed without catch blocks for each one of them individually.
        finally{
            System.out.println("This executes irrespective of exception"); //will execute only then will the exception is thrown.
        }// there cant be multiple finally blocks only one is possible.
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Dont divide by zero");
        }
        return a/b;
    }
}
