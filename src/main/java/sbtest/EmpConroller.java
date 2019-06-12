package sbtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sbtest.Emp.Emp;
import sbtest.Emp.EmpRepo;

import java.util.List;

@RestController
class EmpController {

    @Autowired
    EmpRepo empRepo;

    @RequestMapping("/employees")
    public List<Emp> getAllNotes() {
        return empRepo.findAll();
    }

    /*@GetMapping("/employees/{id}")
    public Emp getNoteById(@PathVariable(value = "id") Integer id) {
        return empRepo.findById(id);
    }
*/

}
