package example.domain;
import javax.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double Day;

    private Double Open;
    private Double High;
    private Double Low;
    private Double Close;
}