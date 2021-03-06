/**
 * Created by zhiminhe on 11/7/16.
 */
public class DemoRecord {


    long imsi;
    GPS gps;
    int servingMcc;
    String region;
    String app;
    String phoneBrand;

    public DemoRecord() {

    }

    public DemoRecord(String str) {
        String[] parts = str.split(",");
        imsi = Long.parseLong(parts[0]);
        gps = new GPS(parts[1] + "," + parts[2]);
        servingMcc = Integer.parseInt(parts[3]);
        region = parts[4];
        app = parts[5];
        phoneBrand = parts[6];
    }

    public long getImsi() {
        return imsi;
    }

    public void setImsi(long imsi) {
        this.imsi = imsi;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public int getServingMcc() {
        return servingMcc;
    }

    public void setServingMcc(int servingMcc) {
        this.servingMcc = servingMcc;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String toString() {
        return "" + imsi + "," + gps + "," + servingMcc + "," + region + "," + app + "," + phoneBrand;
    }
}
