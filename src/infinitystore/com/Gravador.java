package infinitystore.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Gravador {
	public void gravaUsuarios(List<Usuario> usuarios) throws IOException{
		ObjectOutputStream gravadorUsuarios = new ObjectOutputStream(new FileOutputStream("usuarios.txt"));
		try {
			gravadorUsuarios.writeObject(usuarios);
		} catch(FileNotFoundException e) {
			throw new IOException("Não foi encontrado o arquivo usuarios.txt", e);
		} catch(IOException e) {
			throw e;
		} finally {
			if(gravadorUsuarios != null) {
				gravadorUsuarios.close();
			}
		}
	}
	
	public List<Usuario> recuperaUsuarios() throws IOException{
		ObjectInputStream usuarioLido = new ObjectInputStream(new FileInputStream("usuarios.txt"));
		try {
			List<Usuario> readObject = (List<Usuario>) usuarioLido.readObject();
			return readObject;
		} catch(FileNotFoundException e) {
			throw new IOException("Não foi encontrado o arquivo usuarios.txt", e);
		} catch(IOException e) {
			throw e;
		} catch(ClassNotFoundException e) {
			throw new IOException("Classe do objeto não encontrada", e);
		}
		finally {
			if(usuarioLido != null) {
				usuarioLido.close();
			}
		}
	}
	
	public void gravaProdutos(List<Produto> produtos) throws IOException{
		ObjectOutputStream gravadorProdutos = new ObjectOutputStream(new FileOutputStream("produtos.txt"));
		try {
			gravadorProdutos.writeObject(produtos);
		} catch(FileNotFoundException e) {
			throw new IOException("Não foi encontrado o arquivo produtos.txt", e);
		} catch(IOException e) {
			throw e;
		} finally {
			if(gravadorProdutos != null) {
				gravadorProdutos.close();
			}
		}
	}
	
	public List<Produto> recuperaProdutos() throws IOException{
		ObjectInputStream produtoLido = new ObjectInputStream(new FileInputStream("produtos.txt"));
		try {
			List<Produto> readObject = (List<Produto>) produtoLido.readObject();
			return readObject;
		} catch(FileNotFoundException e) {
			throw new IOException("Não foi encontrado o arquivo produtos.txt", e);
		} catch(IOException e) {
			throw e;
		} catch(ClassNotFoundException e) {
			throw new IOException("Classe do objeto não encontrada", e);
		}
		finally {
			if(produtoLido != null) {
				produtoLido.close();
			}
		}
	}
}
