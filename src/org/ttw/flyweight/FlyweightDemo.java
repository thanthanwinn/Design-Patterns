
package org.ttw.flyweight;

public class FlyweightDemo {
	
	public static void main(String[] args) {

		  TreeType appleTree =
	                TreeFactory.getTreeType("apple");


        Tree tree1 =
                new Tree(10,20,appleTree);


        Tree tree2 =
                new Tree(100,200,appleTree);


        Tree tree3 =
                new Tree(300,400,appleTree);


        tree1.render();
        tree2.render();
        tree3.render();


        System.out.println(tree1);
        System.out.println(tree2);
	}

}
