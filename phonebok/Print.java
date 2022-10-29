package phonebok;

import java.util.List;

public class Print {
    public static void PrintListBosses( List<Bosses> list) {
        for (Person person : list) {
            person.printSkill();
        }
    }
    public static void PrintListworker(List<Worker> list) {
        for (Person person : list) {
            person.printSkill();
        }
    }
    public  static  void PrintСompany(Сompany сompany){
        System.out.println(" Мастер - "+сompany.getBosses().getName()+" Работники: ");
        for (Worker worker : сompany.getWorker()) {
            System.out.println(worker.getName()+"  "+worker.getnum() );
        }
    }
    public static void PrintListWorker(List<Worker> workerList) {
    }


}