package worker;

abstract class Worker implements Comparable<Worker> {
    private int id;
    private String name;

    Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    abstract double getAveragePayment();

    @Override
    public String toString() {
        return "#" + id + " " + name;
    }

    @Override
    public int compareTo(Worker another) {
        double d = this.getAveragePayment() - another.getAveragePayment();
        if (d > 0.0)
            return -1;
        else if (d < 0.0)
            return 1;
        else {
            int n = this.getName().compareTo(another.getName());
            return (n != 0) ? n : this.getId() - another.getId();
        }
    }
}


