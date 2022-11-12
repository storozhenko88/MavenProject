package two_sum;

import org.junit.Assert;
import org.junit.Test;

public class TargetTest {

    @Test
    public void getIndexByTargetTest (){
        Target target = new Target();
        int[] numbers = {2,7,11,15};
        int[] index = {1,2};

        Assert.assertArrayEquals(index, target.getIndexByTarget(numbers, 18));
    }
}
