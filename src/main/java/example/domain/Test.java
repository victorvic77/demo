package example.domain;
import javax.persistence.*;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Double Date;

    private Double Time;
    private Double Open;
    private Double High;
    private Double Low;
    private Double Close;
    private Double Volume;
    private Double Important;

    public Test() {
    }

    public void setDate (Double Date) {
        this.Date = Date;
    }

    public Double getDate() {
        return Date;
    }


    public void setTime (Double Time) {
        this.Time = Time;
    }

    public Double getTime() {
        return Time;
    }

    public void setHigh (Double High) {
        this.High = High;
    }

    public Double getHigh() {
        return High;
    }

    public void setOpen (Double Open) {
        this.Open = Open;
    }

    public Double getOpen() {
        return Open;
    }

    public void setLow (Double Low) {
        this.Low = Low;
    }

    public Double getLow() {
        return Low;
    }

    public void setClose (Double Close) {
        this.Close = Close;
    }

    public Double getClose() {
        return Close;
    }

    public void setVolume (Double Volume) {
        this.Volume = Volume;
    }

    public Double getVolume() {
        return Volume;
    }

    public void setImportant (Double Important) {
        this.Important = Important;
    }

    public Double getImportant() {
        return Important;
    }
}
