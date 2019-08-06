public class Converter {

    public static Double course;

    public static Double convertDollarsToHrn(Double dlrs){
        return dlrs*course;
    }

    public static Double convertEurossToHrn(Double euro){
        return euro*(course+5);
    }

}