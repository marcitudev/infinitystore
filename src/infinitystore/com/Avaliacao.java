package infinitystore.com;

public class Avaliacao {
	private Usuario usuarioComentou;
	private int nota;
	private String comentario;
	
	public Avaliacao(Usuario usuario, int nota, String comentario) {
		this.usuarioComentou = usuario;
		this.nota = nota;
		this.comentario = comentario;
	}

	public Usuario getUsuarioComentou() {
		return usuarioComentou;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
