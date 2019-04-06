package infinitystore.com;

import java.util.List;
import java.util.Scanner;

public class LojaVirtualGer {
	public static void main(String[] args) {
		LojaAdmin admin = new LojaAdmin();
		
		//Login dos usuários ou administradores
		boolean fechar = false;
		while(fechar != true) {
			Scanner leitor = new Scanner(System.in);
			System.out.print("Nome de usuário: ");
			String nomeDeUsuario = leitor.nextLine(); //Entrada do nome de usuário
			System.out.print("Senha: ");
			String senha = leitor.nextLine(); //Entrada da senha
			String entrar = admin.EntrarUsuario(nomeDeUsuario, senha);
			
			//Modo usuário
			if(entrar.equals("usuario")) {
				boolean sair = false;
				while(sair != true) {
					int escolha = Integer.parseInt(leitor.nextLine());
					switch(escolha) {
					case 1: 
					}
				}
			} 
			
			//Modo administrador
			else if(entrar.equals("admin")) {
				boolean sair = false;
				while(sair != true) {
					int escolha;
					System.out.println("Gerenciamento: \n1. Adicionar usuário \n2. Listar usuários \n3. Procurar usuário \n4. Remover usuário "
							+ "\n5. Adicionar produto \n6. Procurar produto");
					try {
						escolha = Integer.parseInt(leitor.nextLine());
					} catch(NumberFormatException e){
						System.out.println("Entrada inválida. Tente novamente\n");
						escolha = 0;
					}
					switch(escolha) {
					case 1: //Adiciona usuário
						System.out.print("Nome: ");
						String nomeUsuario = leitor.nextLine();
						System.out.print("Sobrenome: ");
						String sobrenome = leitor.nextLine();
						System.out.print("Nome de usuário: ");
						String nUsuario = leitor.nextLine();
						System.out.print("Senha: ");
						String sUsuario = leitor.nextLine();
						String status = admin.addUsuario(nomeUsuario, sobrenome, nUsuario, sUsuario);
						System.out.println(status);
						break;
					case 2: //Lista usuários cadastrados
						List<Usuario> listaUsuarios = admin.listarUsuarios();
						if(listaUsuarios.size() == 0) {
							System.out.println("Nenhum usuário cadastrado.");
						} else {
							for(Usuario usuario: listaUsuarios) {
								System.out.println(usuario.getNome() + " " + usuario.getSobrenome() + ": " + usuario.getNomeDeUsuario());
							}
						}
						break;
					case 3: //Procura por determinado usuário a partir do username
						System.out.print("Nome de usuário: ");
						String encontrarUsuario = leitor.nextLine();
						Usuario usuario = admin.procurarUsuario(encontrarUsuario);
						if(usuario != null) { //Algum usuário foi encontrado
							System.out.println(usuario.getNome() + " " + usuario.getSobrenome() + ": " + usuario.getNomeDeUsuario());
						} else { //Nenhum usuário foi encontrado
							System.out.println("Nenhum " + encontrarUsuario + " encontrado.");
						}
						break;
					case 4: //Remove usuário
						System.out.println("Nome de usuário: ");
						String nomeUsuarioRemover = leitor.nextLine();
						System.out.println(admin.removerUsuario(nomeUsuarioRemover));
						break;
					case 5: //Adiciona produto
						System.out.println("Tipo de objeto: ");
						String objeto = leitor.nextLine();
						System.out.println("Nome do produto: ");
						String nomeProduto = leitor.nextLine();
						System.out.println("Marca: ");
						String marca = leitor.nextLine();
						System.out.println("Categoria: ");
						String categoria = leitor.nextLine();
						System.out.println("valor: ");
						double valor = Double.parseDouble(leitor.nextLine());
						Produto produto = new Produto(objeto, nomeProduto, marca, categoria, valor);
						System.out.println(admin.addProduto(produto));
						break;
					case 6: //Procura produto
						System.out.println("Nome do produto: ");
						String nomeProdutoProcurado = leitor.nextLine();
						List<Produto> produtoAchado = admin.procurarProduto(nomeProdutoProcurado);
						if(produtoAchado.size() == 0) {
							System.out.println("Nenhum produto encontrado.");
						} else {
							for(Produto p: produtoAchado) {
								System.out.println(p.getNome() + "\n" + p.getMarca() + "\nR$ " + p.getValor() + "\n====================");
							}
						}
						break;
					}
				}
			}
		}
	}
}
