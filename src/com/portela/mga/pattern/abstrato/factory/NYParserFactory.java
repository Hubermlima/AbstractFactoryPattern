package com.portela.mga.pattern.abstrato.factory;

public class NYParserFactory implements AbstractParserFactory{

	/*
	 * Aprendizado: O metodo retorna um entidade tipo interface em sua assinatura, porém,
	 * lembrar que o retorno do método é a implementação da mesma (interface)!!!!!
	 */
	@Override
	public XMLParser getParserInstance(String parserType) {
		switch(parserType) {
		    case "NYERROR" : 
		    	 return new NYErrorXMLParser();
		
		}
		return null;
	}
	

}
