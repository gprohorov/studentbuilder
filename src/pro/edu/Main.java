package pro.edu;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello world");

/*         Student john = new Student("john","bbv181",1,1,1, true);


        Student ivan = new Student.Builder()
                .setName("ivan")
                .setGroup("243")
                .setHeight(180)
                .setWeight(80)
                .build();

        System.out.println(ivan);

        Student petro = new Student.Builder()
                .setSimilarTo(ivan)
                .setName("petro")
                .build();
        System.out.println(petro);
*/
      ClassSingleton first = ClassSingleton.getInstance();
        System.out.println(first.getInfo());
        first.setInfo("Hello world");
        System.out.println(first.getInfo());
      ClassSingleton second = ClassSingleton.getInstance();
        System.out.println(second.getInfo());

        System.out.println("--------------------");

 /*         Patient p1 = new Patient("111",11);
*/
    }





}
