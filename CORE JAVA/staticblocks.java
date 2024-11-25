class AttackOnTitan{
    static String nameOfSeries;
    int season;
    static String authorName;

    // static{
    //     nameOfSeries="AOT";
    //     System.out.println("one");
    // }

    public AttackOnTitan(int season){
        this.season=season;
        System.out.println("two");
    }
    
    static {
        authorName="Isayama";
        System.out.println("three");
    }
    static{
        nameOfSeries="AOT";
        System.out.println("one");
    }
}
public class staticblocks{
    public static void main(String[] args) throws ClassNotFoundException {
        //AttackOnTitan s1=new AttackOnTitan(1);

        int a=5;
        Class.forName("AttackOnTitan");//loads class without creating its first object

    }
}
