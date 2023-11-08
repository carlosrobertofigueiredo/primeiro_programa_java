package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	/* Main e um metodo auto excutavel em Java*/
	public static void main(String[] args) {
		
		/* new Aluno() é uma instância (Criação de objeto)*/
		/* aluno1 é uma referência para o bjeto aluno*/
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João");
		aluno1.setIdade(48);
		aluno1.setDataNascimento("10/04/1975");
		aluno1.setResgitoGeral("147555");
		aluno1.setNumeroCpf("03678958798");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/10/2023");
		aluno1.setNomeEscola("Vida");
		aluno1.setSerieMatriculado("5");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é =" + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		
		/*Aluno aluno2 = new Aluno();  Aqui será o Pedro*/
		
		/* Aluno aluno3 = new Aluno();  Aqui será o Carlos*/
		
		//Aluno aluno4 = new Aluno("Maria"); 
		
		//Aluno aluno5 = new Aluno("Jose", 52);
	}


}
