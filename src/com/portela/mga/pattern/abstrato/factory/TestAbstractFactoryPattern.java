package com.portela.mga.pattern.abstrato.factory;

public class TestAbstractFactoryPattern {

	public static void main(String[] args) {
		AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
		XMLParser parser = parserFactory.getParserInstance("NYERROR");
		
		//XMLParser parser = ParserFactoryProducer.getFactory("NYFactory").getParserInstance("NYERROR");
		
		String msg = parser.parse();
        System.out.println(msg);
	}

}
