/*
 * Sunil Sunichura
 * Student ID: 991 578 383
 * SYST10199 - Web Programming
 */
package beads;

/** This class represents round beads
 *
 * @author sunil
 */
public class RoundBead {
    
    private String color;
    private int radius;
    private char letter;

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }
}
