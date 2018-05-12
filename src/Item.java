import java.util.Objects;

public class Item {
    private String r030;
    private String txt;
    private double rate;
    private String cc;
    private String exchangeDate;

    public Item() {
    }

    public Item(String r030, String txt, double rate, String cc, String exchangeDate) {
        this.r030 = r030;
        this.txt = txt;
        this.rate = rate;
        this.cc = cc;
        this.exchangeDate = exchangeDate;
    }

    public String getR030() {
        return r030;
    }

    public void setR030(String r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(String exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.rate, rate) == 0 &&
                Objects.equals(r030, item.r030) &&
                Objects.equals(txt, item.txt) &&
                Objects.equals(cc, item.cc) &&
                Objects.equals(exchangeDate, item.exchangeDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(r030, txt, rate, cc, exchangeDate);
    }

    @Override
    public String toString() {
        return "Item{" +
                "r030='" + r030 + '\'' +
                ", txt='" + txt + '\'' +
                ", rate=" + rate +
                ", cc='" + cc + '\'' +
                ", exchangeDate='" + exchangeDate + '\'' +
                '}';
    }
}
