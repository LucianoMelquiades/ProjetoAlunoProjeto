package ifal.edu.pw2.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifal.edu.pw2.demo.modelo.Aluno;
import ifal.edu.pw2.demo.repositorios.AlunoRepository;



@RestController
@RequestMapping("aluno")
public class AlunoResource {
	

	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping
	public List<Aluno> get(){
		return alunoRepository.findAll();
	}
	@GetMapping("{id}")
	public Aluno get(@PathVariable("id") Integer id) {
		return alunoRepository.getOne(id);
		
	}
	@PostMapping
	public Aluno save(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
		
	}
	@PostMapping
	public Aluno update(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@DeleteMapping("{id}")
	public void delete (@PathVariable("id") Integer id) {
		alunoRepository.deleteById(id);
	}
	

}
