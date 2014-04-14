package br.com.caelum.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class TesteUnmarshal {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext ctx = JAXBContext.newInstance(Livro.class);
		Unmarshaller unmarshaller = ctx.createUnmarshaller();
		
		Livro livro = (Livro) unmarshaller.unmarshal(new File("livro.xml"));
		System.out.println(livro.getTitulo());
		System.out.println("Categoria: "+ livro.getCategoria().getNome());
		
	}
}
