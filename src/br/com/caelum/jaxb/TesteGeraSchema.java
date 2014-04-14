package br.com.caelum.jaxb;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class TesteGeraSchema {
	public static void main(String[] args) throws Exception {
		
		JAXBContext ctx = JAXBContext.newInstance(Livro.class);
		ctx.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName)
					throws IOException {
				StreamResult result = new StreamResult (new File("schema.xsd"));
				
				return result;
			}
		});
	}

}
