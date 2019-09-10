package worker;
import java.util.*;

public class WorkPayment {
    public static void main(String[] args) {
        int id = 0;

        Set<Worker> workers = new TreeSet<>();

        workers.add(new FixPaymentWorker(++id, "Петрович", 800));
        workers.add(new FixPaymentWorker(++id, "Семён", 2000));
        workers.add(new PerHourPaymentWorker(++id, "Снежана", 150));
        workers.add(new PerHourPaymentWorker(++id, "Элеонора", 100));
        workers.add(new FixPaymentWorker(++id, "Йохтан Палыч", 25000));
        workers.add(new PerHourPaymentWorker(++id, "Анжела", 150));
        workers.add(new FixPaymentWorker(++id, "Снежана", 24960));

        for ( Worker w : workers )
            System.out.println(w);

    }
}
