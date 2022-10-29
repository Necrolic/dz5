package phonebok;


public class Worker extends Person {


    public Worker(String name, Integer num) {
        super(name, num);
    }

    @Override
    public void printSkill() {
        System.out.println(" "+this.getName()+" "+super.getnum());
    }
}
