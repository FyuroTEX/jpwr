import java.util.Objects;

public class AwesomeObject {

    String a = "1";
    static String b;

    public static String getB() {
        return b;
    }

    public static void setB(String b) {
        AwesomeObject.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "AwesomeObject{" +
                "a='" + a + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AwesomeObject)) return false;
        AwesomeObject that = (AwesomeObject) o;
        return Objects.equals(a, that.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
