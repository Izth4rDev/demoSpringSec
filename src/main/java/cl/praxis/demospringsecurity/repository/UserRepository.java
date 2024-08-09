package cl.praxis.demospringsecurity.repository;
import cl.praxis.demospringsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
