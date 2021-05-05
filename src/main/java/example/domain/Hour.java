package example.domain;
import javax.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
public class Hour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double Time;

    private Double Open;
    private Double High;
    private Double Low;
    private Double Close;
}
