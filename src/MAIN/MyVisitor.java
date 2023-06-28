package MAIN;

import java.util.*;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import ANTLR.LexerT;
import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;

public class MyVisitor extends ParserTBaseVisitor<Integer> {

	public String tokenName(Object nodo) {
		if (nodo instanceof TerminalNodeImpl) {
			TerminalNodeImpl nodoTerminal = ((TerminalNodeImpl) nodo);
			return LexerT.VOCABULARY.getSymbolicName(nodoTerminal.getSymbol().getType());
		}
		RuleContext nodoTerminal = (RuleContext) nodo;
		String nombre = nodoTerminal.getClass().getSimpleName();
		return nombre.substring(0, nombre.length() - 7);
	}

	Map<String,String> variables = new HashMap<String,String>();

	@Override
	public Integer visitVarDeclaracion(ParserTParser.VarDeclaracionContext ctx) {
		//System.out.println(ctx.getChild(0));
		//for(int i = 0;i < ctx.getChildCount();i++){
		//	System.out.println(ctx.getChild(i).getText());
		//	System.out.println(tokenName(ctx.getChild(i)));
		//}


		return visitChildren(ctx);
	}

	@Override
	public Integer visitSuma(ParserTParser.SumaContext ctx) {

		//String inicioSuma = ctx.getChild(0).getText();

		/*System.out.println(ctx.getText());
		System.out.println(ctx.getChildCount());
		System.out.println(ctx.getChild(0).getText());

		for(int i = 0;i < ctx.getChildCount();i++){
			System.out.println(ctx.getChild(i).getText());
			System.out.println(tokenName(ctx.getChild(i)));
		}*/

		return visitChildren(ctx); 
	}



}
