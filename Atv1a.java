package Matriz;
public class Atv1a {

	public static void main(String[] args) {
		char matrizA[][] = {
				{'a','b','c','d'},
				{'e','f','g','h'},
				{'i','j','k','l'},
				{'m','n','o','p'}
		};

		for(char[]letra:matrizA) {
			for(char coluna: letra) {
				System.out.println(coluna + "\t");
			}
			System.out.println();
		}

	}

}
