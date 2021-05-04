package example.domain;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
public class Test100 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String family;
    private String family100;
    private String family200;
}
