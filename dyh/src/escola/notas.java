//Gustavo Margotti 3-52

package escola;

public class notas {
	
		public static void main(String[] args) {
			
			alunos a1 = new alunos();
			a1.nome = "Dyanna";
		    a1.disciplina = "teste de software";
			a1.n1= 10.0f;
			a1.n2= 8.0f;	
			a1.n3= 5.0f;
			a1.n4= 10.0f;
			a1.media = (a1.n1+a1.n2+a1.n3+a1.n4)/4;
			
			System.out.println (a1.nome + " teve media " + a1.media + " na disciplina de " + a1.disciplina);
			
			
		}
		
		
}


