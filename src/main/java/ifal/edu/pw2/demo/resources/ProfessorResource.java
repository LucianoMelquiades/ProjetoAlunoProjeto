package ifal.edu.pw2.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifal.edu.pw2.demo.modelo.Professor;
import ifal.edu.pw2.demo.repositorios.ProfessorRepository;

@RestController
@RequestMapping("professor")
public class ProfessorResource {
	
	@Autowired
	ProfessorRepository professorRepository;
	
	@GetMapping
	public List<Professor> get(){
		return professorRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Professor get(@PathVariable ("id") Integer id ) {
		return professorRepository.getOne(id);
	}
	@PostMapping 
	public Professor save(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
	
	@PutMapping
	public Professor update(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
	
	@DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id) {
          professorRepository.deleteById(id);
    }
	
	
}
