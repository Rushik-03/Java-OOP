package EnumsPackg;

public class EnumsEverything {
    // for a class if we need a particular objects only then we use Enums.
    enum Week implements A{// all enums extend java.lang.enum class.
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        // defaultly public static and final
        // abstract not allowed.
        // since its final we cant create child enums.
        // type of these is Week(enum name).
        Week(){ // this is not public or protected. only private or default.
            // why? We dont want to create new objects.-> next line
            // bcoz this is not enum concept
            System.out.println("Constructor called for "+this);

            //internally : public static final Week Monday = new Week();
        }

        @Override // enum can implement as many interfaces as we want but cannot extend classes.
        public void hello() {
            System.out.println("Hello hw r u ");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Wednesday;
//        for(Week day: Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());

    }
}
