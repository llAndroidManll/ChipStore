package sahak.sahakyan.chipstore.entity;



import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "This input cannot be empty.")
    @Size(min = 3, max = 20)
    @Column(name = "full_name")
    private String fullName;

    @NotBlank
    @Pattern(regexp = "\\+\\d{3}-\\d{2}-\\d{3}-\\d{3}", message = "Please use pattern +XXX-XX-XXX-XXX")
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotBlank
    @Column(name = "email", unique = true)
    private String email;

    @NotBlank
    @Column(name = "password")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(name = "enabled")
    private boolean enabled;
}