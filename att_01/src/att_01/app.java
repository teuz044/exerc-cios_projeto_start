package att_01;

public class app {

	public static void main(String[] args) {

		String[] nomesAlunos = {"Alice", "Bob", "Carlos", "Daniela", "Eduardo", "Fabiana", "Gustavo", "Helena", "Isabel", "João", "Karine", "Leonardo", "Mariana", "Natália", "Otávio", "Paula", "Rafael", "Sabrina", "Thiago", "Vitória"};

		for (int i = 0; i < nomesAlunos.length; i++) {
		    System.out.println("Aluno "+ (i+1) + " " +nomesAlunos[i]);
		}
	}

}
