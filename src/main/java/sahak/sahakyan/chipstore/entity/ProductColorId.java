package sahak.sahakyan.chipstore.entity;

import java.io.Serializable; // Import Serializable interface
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductColorId implements Serializable { // Implement Serializable interface
    private Long product;
    private Long color;
}
