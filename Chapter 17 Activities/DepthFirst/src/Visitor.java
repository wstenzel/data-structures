/**
    A visitor whose visit method is called for each
    visited node during a tree traversal.
*/
public interface Visitor
{
    /**
        This method is called for each visited node.
        @param data the data of the node
        @return true if traversal should continue.
    */
    boolean visit(Object data);
}
