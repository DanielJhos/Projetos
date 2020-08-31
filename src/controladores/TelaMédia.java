package controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaMédia {

	@FXML
	private TextField txtAluno;

	@FXML
	private TextField txtNota1;

	@FXML
	private TextField txtNota2;

	@FXML
	private TextField txtNota3;

	@FXML
	private Label lblMedia;

	@FXML
	private Label lblSituacao;

	@FXML
	void calculaMedia() {

		String nome = (txtAluno.getText());
		Double nota1 = Double.parseDouble(txtNota1.getText());
		Double nota2 = Double.parseDouble(txtNota2.getText());
		Double nota3 = Double.parseDouble(txtNota3.getText());
		Double media = (nota1 + nota2 + nota3) / 3;
		String situacao = "";

		if (media >= 7) {
			situacao = "Aprovado";
		} else if (media <= 3) {
			situacao = "Reprovado";
		} else {
			situacao = "Recuperação";

		}
		lblMedia.setText("Aluno: " + nome + ". Média: " + media);
		lblSituacao.setText("Situação: " + situacao);

	}

}
