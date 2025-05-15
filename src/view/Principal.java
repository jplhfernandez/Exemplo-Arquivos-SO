package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IArquivosController arqCont = new ArquivosController();
		String dirWin = "C:\\Windows";
		String path = "D:\\Downloads\\ISO PSP\\N64\\teste";
//		Para readDir e createFile
//		String nome = "teste"; 
		String nome = "teste.txt";

		
		try {
		//	arqCont.readDir(dirWin);
		//	arqCont.createFile(path, nome);
		//	arqCont.readFile(path, nome);
			arqCont.openFile(path, nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
