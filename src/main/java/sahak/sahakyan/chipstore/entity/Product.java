package sahak.sahakyan.chipstore.entity;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private Integer price;
    private Integer discount;
    private String description;

    @Lob
    @Column(name = "f_image")
    private byte[] fImage;

    @Lob
    @Column(name = "image_1")
    private byte[] image1;

    @Lob
    @Column(name = "image_2")
    private byte[] image2;

    @Lob
    @Column(name = "image_3")
    private byte[] image3;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Transient
    private String base64Image;
}
