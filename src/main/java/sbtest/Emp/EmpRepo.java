package sbtest.Emp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sbtest.Emp.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
