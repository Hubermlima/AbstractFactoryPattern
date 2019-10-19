package com.portela.mga.pattern.abstrato.factory;

public interface AbstractParserFactory {
        public XMLParser getParserInstance(String parserType);
}
