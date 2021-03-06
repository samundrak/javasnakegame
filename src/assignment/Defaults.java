package assignment;

import java.awt.Color;

/**
 *
 * @author samundrak
 */
public class Defaults {

    // Total number of tiles(Button) in game
    public static final int TOTAL_TILES = 400;
    //Total number of players in game
    public static final int TOTAL_PLAYERS = 2;
    //Game name
    public static final String GAME_NAME = "Snake Game ";
    //Onload buttons color
    public static final Color BUTTON_DEFAULT_COLOR = Color.ORANGE;
    //Defaults Colors
    public static final Color[] COLORS = {Color.GRAY, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.RED, Color.WHITE};
    //Default x 
    public static final int FRAME_X = 800;
    //Default y
    public static final int FRAME_Y = 600;
    //Poision
    public static final String POISION = "poision";
    //Poision Color
    static final Color POISION_COLOR = Color.RED;
    //Highlight Color
    static final Color HIGHLIGHT_COLOR = Color.ORANGE;
    //Chain counter
    static int CHAIN_COUNTER = 9;

    public static int[] getSideCordinates(int x) {
        
        int top, left, bottom, right, topLeft, topRight, bottomLeft, bottomRight;
        top = x - 20;
        topRight = x - 19;
        right = x + 1;
        bottomRight = x + 21;
        bottom = x + 20;
        bottomLeft = x + 19;
        left = x - 1;
        topLeft = x - 21;

        int[] e = {top, left, bottom, right, topLeft, topRight, bottomLeft, bottomRight};

        return e;
    }
}
