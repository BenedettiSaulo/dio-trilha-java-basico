package entidades;

import entidades.interfaces.AparelhoTelefonico;
import entidades.interfaces.NavegadorInternet;
import entidades.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	private String musicaAtual;
	private boolean estaTocando;

	private String numeroLigacao;
	private boolean ligacaoAtiva;

	private String paginaAtual;
	private int totalAbas;

	private String modelo;
	private String sistemaOperacional;
	private int bateria;
	private boolean ligado;

	// TODO Constructors

	@Override
	public void tocar() {

		if (musicaAtual != null) {

			this.estaTocando = true;
		}
	}

	@Override
	public void pausar() {

		if (estaTocando) {

			this.estaTocando = false;
		}
	}

	@Override
	public void selecionarMusica(String musica) {

		this.musicaAtual = musica;
		this.tocar();
	}

	@Override
	public void ligar(String numero) {

		this.numeroLigacao = numero;
		this.ligacaoAtiva = true;
	}

	@Override
	public void atender() {

		this.ligacaoAtiva = true;
	}

	@Override
	public void iniciarCorreioVoz() {

	}

	@Override
	public void exibirPagina(String url) {

		this.paginaAtual = url;
	}

	@Override
	public void adicionarNovaAba() {

		this.totalAbas++;
	}

	@Override
	public void atualizarPagina() {

	}

	public void ligarDesligar() {

		if (this.ligado) {

			this.ligado = false;

			return;
		}

		this.ligado = true;
	}

	public void carregar(int quantidade) {

		this.bateria += quantidade;

		if (this.bateria > 100) {

			this.bateria = 100;
		}
	}

	// TODO getters/setters
}
