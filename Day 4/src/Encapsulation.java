class Human
{
    //int age;
    //private int age=11;
    private int age;
    //String name;
    //private String name="Navin";
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        if(age == 0) {
//            throw new Exception("Please give some valid value");
//        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
  public static void main(String[] args) {
      Human obj = new Human();
      obj.setAge(25);

      obj.setName("ABC");
      // obj.age =  11;

      System.out.println(obj.getName()+" : "+obj.getAge());
  }
}
