/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * Person goes to work and then comes home at night and turns the light on.
 * 
 * @Gina Hyde Test 2
 * 
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;
    private Person person;
    private Square door;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        door = new Square();
        roof = new Triangle();  
        sun = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(30);
            window.makeVisible();
            
            door.changeColor("magenta");
            door.moveHorizontal(-100);
            door.moveVertical(90);
            door.changeSize(50);
            door.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-60);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
            
            person.makeVisible();
            person.changeColor("black");
            person.moveHorizontal(30);
            person.moveVertical(50);
            person.changeSize(30,15);
            person.slowMoveHorizontal(200);
            sun.slowMoveHorizontal(-600);
            person.slowMoveHorizontal(-260);
            person.makeInvisible();
            window.changeColor("yellow");

        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
    public void resetPosition()
    {
        drawn=false;
        
        wall.makeInvisible();
        window.makeInvisible();
        roof.makeInvisible();
        sun.makeInvisible();
        person.makeInvisible();
        door.makeInvisible();
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        door = new Square();
        person = new Person();

    }
}
