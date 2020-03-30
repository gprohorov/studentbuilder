package pro.edu;

public class Student {

    private String name;
    private  String group;
    private  int age;
    private  int height;
    private int weight;
    private  boolean gender;


    public Student(String name, String group, int age, int height, int weight, boolean gender) {
        this.name = name;
        this.group = group;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
/*

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }
*/

    public static class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        public Builder setSimilarTo(Student student){
            this.studentToBuild.name = student.name;
            this.studentToBuild.group = student.group;
            this.studentToBuild.age = student.age;
            this.studentToBuild.height = student.height;
            return this;
        }

        public Builder setName(String name){
            studentToBuild.setName(name);
            return this;
        }

        public Builder setGroup(String group){
            studentToBuild.setGroup(group);
            return this;
        }
        public Builder setHeight(int height){
            studentToBuild.setHeight(height);
            return this;
        }

        public Builder setWeight(int weight){
            studentToBuild.setWeight(weight);
            return this;
        }

        public Student build(){
            return studentToBuild;
        }








    }




}
