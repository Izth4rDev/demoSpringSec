package cl.praxis.demospringsecurity.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role", nullable = false)
    private Long idRole;

    @Column(name = "rol_name", nullable = false)
    private String rolName;

    @OneToMany(mappedBy = "role")
    private Set<User> users;
}