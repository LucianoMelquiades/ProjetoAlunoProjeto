package ifal.edu.pw2.demo.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Projeto{
	
	@Id
	@GeneratedValue
	private Integer id; 
	@Column
	private String orgaoFinanciador;
	
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	private Date dataFinal;
	 
	@Column
	private Double orcamento; 
	
	@ManyToOne
	private Professor professor;
	
	@ManyToMany
    private java.util.List<Aluno>  aluno;
	
	
	public Projeto() {
		
	}

	public Projeto(Integer id, String orgaoFinanciador, Date dataInicio, Date dataFinal, Double orcamento,
			Professor professor, java.util.List<Aluno> aluno) {
		super();
		this.id = id;
		this.orgaoFinanciador = orgaoFinanciador;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.orcamento = orcamento;
		this.professor = professor;
		this.aluno = aluno;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getOrgaoFinanciador() {
		return orgaoFinanciador;
	}


	public void setOrgaoFinanciador(String orgaoFinanciador) {
		this.orgaoFinanciador = orgaoFinanciador;
	}


	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}

	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public java.util.List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(java.util.List<Aluno> aluno) {
		this.aluno = aluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orcamento == null) ? 0 : orcamento.hashCode());
		result = prime * result + ((orgaoFinanciador == null) ? 0 : orgaoFinanciador.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (dataFinal == null) {
			if (other.dataFinal != null)
				return false;
		} else if (!dataFinal.equals(other.dataFinal))
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orcamento == null) {
			if (other.orcamento != null)
				return false;
		} else if (!orcamento.equals(other.orcamento))
			return false;
		if (orgaoFinanciador == null) {
			if (other.orgaoFinanciador != null)
				return false;
		} else if (!orgaoFinanciador.equals(other.orgaoFinanciador))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}

	
	
	   
	
}
