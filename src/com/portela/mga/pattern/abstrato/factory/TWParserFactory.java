package com.portela.mga.pattern.abstrato.factory;

public class TWParserFactory implements AbstractParserFactory{

	@Override
	public XMLParser getParserInstance(String parserType) {
		switch(parserType) {
		case "TWERROR" : 
	    	 return new TWErrorXMLParser();
	
		}
		return null;
	}
	

}
