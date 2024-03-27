package sahak.sahakyan.chipstore.entity;

import javax.persistence.*;
import lombok.*;
@Data
@Entity
@Table(name = "colors")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long colorId;

    @Column(unique = true)
    private String colorName;
}