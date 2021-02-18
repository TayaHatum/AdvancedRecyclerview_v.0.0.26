import org.testng.annotations.Test;

public class RecyclerTest extends TestBase{
    @Test
    public void testHorizontalSwipe() {

        app.recycler().selectItemSwipe();
        app.recycler().selectSwipebleBase();
        //app.recycler().swipeFromLeftToRigth();
        app.recycler().swipeFromRigthToLeft();
    }
    @Test
    public void testDragNDrop() {
        app.recycler().selectSwipebleBase();
        app.recycler().dragDown();
        //app.recycler().dragDownCount(4);
        //app.recycler().dragDownWin();
    }

}
