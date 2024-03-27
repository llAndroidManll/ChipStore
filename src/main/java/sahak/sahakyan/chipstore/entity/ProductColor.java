package sahak.sahakyan.chipstore.entity;

import java.io.Serializable; // Import Serializable interface
import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "product_colors")
@IdClass(ProductColorId.class) // Use @IdClass to specify composite primary key
public class ProductColor implements Serializable { // Implement Serializable interface
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;
}
