#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.visitors;

import org.walkmod.javalang.ast.CompilationUnit;
import org.walkmod.javalang.visitors.VisitorSupport;
import org.walkmod.walkers.VisitorContext;

public class MyFirstPlugin extends VisitorSupport<VisitorContext> {

	@Override
	public void visit(CompilationUnit cu, VisitorContext ctx) {
		System.out.println("Hello compilation unit");
	}
}
