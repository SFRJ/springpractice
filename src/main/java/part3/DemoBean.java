package part3;

public class DemoBean {

    private String valueA;
    private String valueB;

    public DemoBean(String valueA, String valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    @Override
    public String toString() {
        return valueA + " " + valueB;
    }
}
