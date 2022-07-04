package bean;

public class Competitors {
    private String name;
    private String surName;
    private static bean.Competitors competitors = null;

    private Competitors() {
    }

    public Competitors(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getfullInfo() {
        String var10000 = this.getName();
        return var10000 + " " + this.getSurName();
    }
}


