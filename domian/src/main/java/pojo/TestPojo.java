package pojo;

public class TestPojo {
    private String name;
    private String adress;

    @Override
    public String toString() {
        return "TestPojo{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
