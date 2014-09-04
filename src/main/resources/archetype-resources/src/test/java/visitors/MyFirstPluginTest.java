#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.visitors;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import ${package}.visitors.MyFirstPlugin;
import org.walkmod.javalang.ASTManager;
import org.walkmod.javalang.ast.CompilationUnit;
import org.walkmod.walkers.VisitorContext;

public class MyFirstPluginTest {

	@Test
	public void testParsing() throws Exception {
		File f = new File("src/test/resources/source1.7.txt");
		CompilationUnit cu = ASTManager.parse(f);
		Assert.assertNotNull(cu);
		MyFirstPlugin visitor = new MyFirstPlugin();
		visitor.visit(cu, new VisitorContext());
	}
}
