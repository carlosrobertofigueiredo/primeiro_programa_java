package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	/* Main e um metodo auto excutavel em Java*/
	public static void main(String[] args) {
		
		/* new Aluno() é uma instância (Criação de objeto)*/
		/* aluno1 é uma referência para o bjeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Qual o nome da Mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do Pai?");
		String dataMatricula = JOptionPane.showInputDialog("Data de Matricula?");
		String escola = JOptionPane.showInputDialog("Nome da Escola?");
		String serie = JOptionPane.showInputDialog("Série Matriculado?");
		String nota1 = JOptionPane.showInputDialog("nota 1 ?");
		String nota2 = JOptionPane.showInputDialog("nota 2 ?");
		String nota3 = JOptionPane.showInputDialog("nota 3 ?");
		String nota4 = JOptionPane.showInputDialog("nota 4 ?");
		
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setResgitoGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		
		/*Aluno aluno2 = new Aluno();  Aqui será o Pedro*/
		
		/* Aluno aluno3 = new Aluno();  Aqui será o Carlos*/
		
		//Aluno aluno4 = new Aluno("Maria"); 
		
		//Aluno aluno5 = new Aluno("Jose", 52);
	}


}
