package phonebok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Bosses Ivan = new Bosses("Ivan",3344 , Post.chief );

        Bosses Den = new Bosses("Den",131434,Post.ChiefBoogaleter );

        Bosses Oleg = new Bosses("Oleg",374734,Post.Master );

        Bosses Dima = new Bosses("Dima",47334,Post.Engineer );

        Bosses Sergey = new Bosses("Sergey",277234,Post.deputychief );

        List<Bosses> bossesList = Arrays.asList(Ivan,Den,Oleg,Dima,Sergey);
        System.out.println("____________________Руководство_______________________");
        Print.PrintListBosses(bossesList);

        Worker _dimaS = new Worker("_Dima",252626);
        Worker _olegS = new Worker("_Oleg",43256);
        Worker _denS = new Worker("_Den",253526);
        Worker _ivanS = new Worker("_Ivan",345625);
        Worker _olgaS = new Worker("_Olga",363235);

        List<Worker> workerList = new ArrayList<>();
        workerList.add(_ivanS);
        workerList.add(_olegS);
        workerList.add(_denS);
        workerList.add(_dimaS);

        System.out.println("____________________Работники_______________________");
        Print.PrintListWorker( workerList);

        System.out.println("___________________________________________________");
        Сompany classmaster = new Сompany(Oleg,Post.Master, workerList);
        Print.PrintСompany(classmaster);
        System.out.println("___________________________________________________");


        classmaster.getWorker().remove(_ivanS);
        classmaster.getWorker().add(_olgaS);
        Print.PrintСompany(classmaster);
    }
}