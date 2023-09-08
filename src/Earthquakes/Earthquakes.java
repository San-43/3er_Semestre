public class Earthquakes {
    private int day;
    private String month;
    private String locality;
    private double[] hour = new double[24];

    public Earthquakes(int day, String month, String locality) {
        this.day = day;
        this.month = month;
        this.locality = locality;

        for (int i = 0; i < 24; i++) {
            this.hour[i] = 0.0;
        }
    }

    public Earthquakes() {
        this(0, null, null);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }
    public void setHour(int hour, double eq) {
        this.hour[hour] = eq;
    }

    public double getHour(int hour) {
        return this.hour[hour];
    }

    public String getDatos() {
        StringBuilder temp = new StringBuilder("\n Mes   | Eq Scale\n" +
                "------------------------------\n");
        for (int i = 0; i < 24; i++) {
            temp.append(" ").append(i + 1).append("   | ").append(hour[i]).append("\n");
        }

        return "---Earthquakes---" +
                "\n Day: " + getDay() +
                "\n Month: " + getMonth() +
                "\n Locality: " + getLocality() +
                temp;
    }
}
