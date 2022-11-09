package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		/* oi professor(a) tentei ao maximo porem o finalzinho com a funcao dos turnos e aparecer (morreu) no final quando o campeao morre estava
		 * tirando muito do tempo de estudo, entao achei melhor continuar o curso pois visto que provavelmente estou conseguindo entender o conceito
		 * que foi dado, outra coisa, nao usei o metodo status e talvez esse tenha sido o problema, usei construtor padrao porque quando usava construtor 
		 * com mais atributos o programa bugava!
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		Champion champion1 = new Champion();
		Champion champion2 = new Champion();

		System.out.println("Digite os dados do primeiro campeao: ");
		System.out.print("Nome: ");
		String name = sc.next();
		champion1.setName(name);
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		champion1.setLife(life);
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		champion1.setAttack(attack);
		System.out.print("Armadura: ");
		int armour = sc.nextInt();
		champion1.setArmour(armour);

		System.out.println("Digite os dados do segundo campeao: ");
		System.out.print("Nome: ");
		name = sc.next();
		champion2.setName(name);
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		champion2.setLife(life);
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		champion2.setAttack(attack);
		System.out.print("Armadura: ");
		armour = sc.nextInt();
		champion2.setArmour(armour);

		System.out.print("Quantos turnos voce deseja executar? ");
		int N = sc.nextInt() + 1;

		for (int i = 1; i < N; i++) {
			if (champion1.getLife() > 0) {
				System.out.println("Resultado do turno " + i + ":");
				System.out.println(champion1.getName() + ": " + champion1.getLife() + " de vida");
				champion2.takeDamage(attack);
				System.out.println(champion2.getName() + ": " + champion2.getLife() + " de vida");
				champion1.takeDamage(attack);
				System.out.println();
			} else

				i = N;

		}

		sc.close();

	}

}
