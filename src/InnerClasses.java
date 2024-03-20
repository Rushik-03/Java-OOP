//public class InnerClasses {//only classes inside a class can be static. Outermost classes can never be static.
//    class Test{//Static here has no effect on members inside, they are still non-static if declared non-static and static if declared static
//        //static String name;//gives output as Hanur Hanur
//        String name;//gives output as Rushik Hanur
//        public Test(String name) {
//            this.name = name;
//        }
//    }
//    static class Test2{//Static here has no effect on members inside, they are still non-static if declared non-static and static if declared static
//        //static String name;//gives output as Badhri badhri
//        String name;//gives output as Shiva Badhri
//        public Test2(String name) {
//            this.name = name;
//        }
//    }

//    public static void main(String[] args) {
//        //cant create an object of non-static class if it is inside another class as it needs the instance of outer class
//        //Test a = new Test("Rushik");//error
//        //Test b = new Test("Hanur");//error
//        //but making the inner class static we can make an object of its own as it doesnt depend on any instance of outer class
//        Test2 c = new Test2("Shiva");//no error
//        Test2 d = new Test2("Badhri");//no error
////        System.out.println(a.name);
////        System.out.println(b.name);
//        System.out.println(c.name);
//        System.out.println(d.name);
//    }
//}
