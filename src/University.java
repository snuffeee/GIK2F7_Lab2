public class University {

    private String location;
    private String name;
    private int regNum;
    private String url;

    public University(String location, String name, int regNum, String url) {
        this.location = location;
        this.name = name;
        this.regNum = regNum;
        this.url = url;


    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
