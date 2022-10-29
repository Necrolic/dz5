package phonebok;

public abstract class Person  implements Skill {

   private String name;
   private Integer num;


   @Override
    public String toString() {
      return name;
}


  public Person(String name, Integer num){

      this.name = name;
      this.num = num;

  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getnum() {
        return num;
    }

    public void setnum(Integer num) {
        this.num = num;
    }

 
}