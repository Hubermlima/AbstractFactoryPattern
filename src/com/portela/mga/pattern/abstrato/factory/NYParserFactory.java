package com.portela.mga.pattern.abstrato.factory;

public class NYParserFactory implements AbstractParserFactory{

	/*
	 * Aprendizado: O metodo retorna um entidade tipo interface em sua assinatura, por�m,
	 * lembrar que o retorno do m�todo � a implementa��o da mesma (interface)!!!!!
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
