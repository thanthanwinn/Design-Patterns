package org.ttw.flyweight;

public class AppleTree  implements TreeType{
	
	private final String name;
    private final String texture;
    private final String color;


    public AppleTree() {
        this.name = "Apple Tree";
        this.texture = "apple.png";
        this.color = "green";
    }
	


    @Override
    public void render(int x, int y) {

        System.out.println(
            name +
            " rendered at (" + x + "," + y + ")" +
            " texture=" + texture +
            " color=" + color
        );
    }

}
