package testes;

import code.Recurso;
import controllers.RecursoController;

public class testeBanco {

	public static void main(String[] args) {
		Recurso r = new Recurso("Notebook", "P","Computador", 6, 24, 12);
		RecursoController control = new RecursoController();
		
		control.salvar(r);

	}

}
