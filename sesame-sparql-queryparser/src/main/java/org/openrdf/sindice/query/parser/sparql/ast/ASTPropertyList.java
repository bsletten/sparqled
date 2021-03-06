/* Generated By:JJTree: Do not edit this line. ASTPropertyList.java */

package org.openrdf.sindice.query.parser.sparql.ast;

public class ASTPropertyList extends SimpleNode {

	public ASTPropertyList(int id) {
		super(id);
	}

	public ASTPropertyList(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	@Override
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data)
		throws VisitorException
	{
		return visitor.visit(this, data);
	}

	public Node getVerb() {
		return children.get(0);
	}

	public ASTObjectList getObjectList() {
		return (ASTObjectList)children.get(1);
	}

	public ASTPropertyList getNextPropertyList() {
		if (children.size() >= 3) {
			return (ASTPropertyList)children.get(2);
		}
		return null;
	}
}
