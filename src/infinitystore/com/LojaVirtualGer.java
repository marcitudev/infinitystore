//package infinitystore.com;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class LojaVirtualGer {
//	public static void main(String[] args) {
//		LojaAdmin admin = new LojaAdmin();
//		admin.recuperaDados();
//		Scanner leitor = new Scanner(System.in);
//		
//		//Login dos usuários ou administradores
//		boolean fechar = false;
//		while(fechar != true) {
//			System.out.print("Nome de usuário: ");
//			String nomeDeUsuario = leitor.nextLine(); //Entrada do nome de usuário
//			System.out.print("Senha: ");
//			String senha = leitor.nextLine(); //Entrada da senha
//			String entrar = admin.EntrarUsuario(nomeDeUsuario, senha);
//			
//			//Modo usuário
//			if(entrar.equals("usuario")) {
//				boolean sair = false;
//				while(sair != true) {
//					int escolha = Integer.parseInt(leitor.nextLine());
//					switch(escolha) {
//					case 1: 
//					}
//				}
//			} 
//			
//			//Modo administrador
//			else if(entrar.equals("admin")) {
//				boolean sair = false;
//				while(sair != true) {
//					int escolha;
//					System.out.println("\nModo administrador: \n\nUsuário: (1) Adicionar \n         (2) Listar "
//							+ "\n         (3) Procurar \n         (4) Remover \n\nProduto: "
//							+ "(5) Adicionar \n         (6) Procurar \n         (7) Remover \n\n         (8) Sair");
//					try {
//						escolha = Integer.parseInt(leitor.nextLine());
//					} catch(NumberFormatException e){
//						System.out.println("Entrada inválida. Tente novamente\n");
//						escolha = 0;
//					}
//					switch(escolha) {
//					case 1: //Adiciona usuário
//						System.out.print("\nNome: ");
//						String nomeUsuario = leitor.nextLine();
//						System.out.print("Sobrenome: ");
//						String sobrenome = leitor.nextLine();
//						System.out.print("Nome de usuário: ");
//						String nUsuario = leitor.nextLine();
//						System.out.print("Senha: ");
//						String sUsuario = leitor.nextLine();
//						String status = admin.addUsuario(nomeUsuario, sobrenome, nUsuario, sUsuario);
//						System.out.println(status);
//						break;
//					case 2: //Lista usuários cadastrados
//						System.out.println("");
//						List<Usuario> listaUsuarios = admin.listarUsuarios();
//						if(listaUsuarios.size() == 0) {
//							System.out.println("Nenhum usuário cadastrado.");
//						} else {
//							for(Usuario usuario: listaUsuarios) {
//								System.out.println(usuario.getNome() + " " + usuario.getSobrenome() + ": " + usuario.getNomeDeUsuario());
//							}
//						}
//						break;
//					case 3: //Procura por determinado usuário a partir do username
//						System.out.print("\nNome de usuário: ");
//						String encontrarUsuario = leitor.nextLine();
//						Usuario usuario = admin.procurarUsuario(encontrarUsuario);
//						if(usuario != null) { //Algum usuário foi encontrado
//							System.out.println("\n" + usuario.getNome() + " " + usuario.getSobrenome() + ": " + usuario.getNomeDeUsuario());
//						} else { //Nenhum usuário foi encontrado
//							System.out.println("\nNenhum " + encontrarUsuario + " encontrado.");
//						}
//						break;
//					case 4: //Remove usuário
//						System.out.print("\nNome de usuário: ");
//						String nomeUsuarioRemover = leitor.nextLine();
//						System.out.println("\n" + admin.removerUsuario(nomeUsuarioRemover));
//						break;
//					case 5: //Adiciona produto
//						System.out.print("\nTipo de objeto: ");
//						String objeto = leitor.nextLine();
//						System.out.print("Nome do produto: ");
//						String nomeProduto = leitor.nextLine();
//						System.out.print("Marca: ");
//						String marca = leitor.nextLine();
//						System.out.print("Categoria: ");
//						String categoria = leitor.nextLine();
//						boolean entradaValida = false;
//						while(entradaValida == false) {
//							try {
//								System.out.print("valor: ");
//								double valor = Double.parseDouble(leitor.nextLine());
//								Produto produto = new Produto(nomeProduto, marca, categoria, "/home/marcio/Documents/KDfjklsdjf.png", valor);
//								System.out.println("\n" + admin.addProduto(produto) + ", no valor de R$ " + valor + ".");
//								entradaValida = true;
//							} catch(NumberFormatException e) {
//								System.out.println("\nValor deve ser informado em números, e pontos, caso necessário. Tente novamente, por favor.\n");
//							}
//						}
//						break;
//					case 6: //Procura produto
//						System.out.print("\nNome do produto(s): ");
//						String procurar = leitor.nextLine();
//						List<Produto> produtoAchado = admin.procurarProduto(procurar);
//						if(produtoAchado.size() == 0) {
//							System.out.println("\nNenhum produto encontrado.");
//						} else {
//							for(Produto p: produtoAchado) {
//								System.out.printf("\n" + p.getNome() + "\n" + p.getMarca() + "\nR$ %.2f %n", p.getValor());
//							}
//						}
//						break;
//					case 7: //Remover produto
//						System.out.print("\nNome do produto(s): ");
//						String procurarRemover = leitor.nextLine();
//						System.out.println("");
//						List<String> produtosRemover = admin.analiseDeRemocao(procurarRemover);
//						if(produtosRemover.size() > 0) {
//							for(String nomePro: produtosRemover) {
//								System.out.println(nomePro);
//							}
//							boolean entradaV = false;
//							while(entradaV == false) {
//								try {
//									System.out.print("\nRemova o produto digitando sua referência. Remova: ");
//									int indice = Integer.parseInt(leitor.nextLine());
//									if(indice >= 0 && indice < produtosRemover.size()) {
//										String produtoRemovido = admin.removerProduto(indice);
//										System.out.println(produtoRemovido + " removido com sucesso!");
//										entradaV = true;
//									} else {
//										System.out.println("\nEntrada não válida.");
//									}
//								} catch(NumberFormatException e) {
//									System.out.println("Entrada inválida. Tente novamente.");
//								}
//							}
//						} else {
//							System.out.println("Nenhum produto encontrado.");
//						}
//						break;
//					case 8:
//						sair = true;
//						System.out.println("\nLogout admin.\n");
//						break;
//					}
//					admin.gravaDados();
//				}
//			} else {
//				System.out.println("\nVerifique o nome de usuário e senha e tente novamente.\n");
//			}
//		}
//		leitor.close();
//	}
//}
