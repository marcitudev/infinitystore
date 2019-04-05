package infinitystore.com;

import java.util.List;
import java.util.Scanner;

public class LojaVirtualGer {
	public static void main(String[] args) {
		LojaAdmin admin = new LojaAdmin();
		boolean fechar = false;
		while(fechar != true) {
			Scanner leitor = new Scanner(System.in);
			System.out.print("Nome de usuário: ");
			String nomeDeUsuario = leitor.nextLine();
			System.out.print("Senha: ");
			String senha = leitor.nextLine();
			String entrar = admin.EntrarUsuario(nomeDeUsuario, senha);
			if(entrar.equals("usuario")) {
				boolean sair = false;
				while(sair != true) {
					int escolha = Integer.parseInt(leitor.nextLine());
					switch(escolha) {
					case 1: 
					}
				}
			} else if(entrar.equals("admin")) {
				boolean sair = false;
				while(sair != true) {
					System.out.println("Gerenciamento: \n1. Adicionar usuário \n2. Listar usuários \n3. Procurar usuário");
					int escolha = Integer.parseInt(leitor.nextLine());
					switch(escolha) {
					case 1:
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
					case 2:
						List<Usuario> listaUsuarios = admin.listarUsuarios();
						if(listaUsuarios.size() == 0) {
							System.out.println("Nenhum usuário cadastrado.");
						} else {
							for(Usuario usuario: listaUsuarios) {
								System.out.println(usuario.getNome() + " " + usuario.getSobrenome() + ": " + usuario.getNomeDeUsuario());
							}
						}
						break;
					case 3:
						System.out.print("Nome de usuário: ");
						String encontrarUsuario = leitor.nextLine();
						Usuario usuario = admin.procurarUsuario(encontrarUsuario);
						if(usuario != null) {
							System.out.println(usuario.getNome() + " " + usuario.getSobrenome() + ": " + usuario.getNomeDeUsuario());
						} else {
							System.out.println("Nenhum " + encontrarUsuario + " encontrado.");
						}
						break;
					}
				}
			}
		}
	}
}
