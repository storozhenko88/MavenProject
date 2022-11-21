package lesson15.pascal_triangle;

import lesson15.pascal_triangle.PascalTriangle;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PascalTriangleTest {


    @Test
    public void creatPascalTriTest (){
        int rowNumber = 5;
        PascalTriangle triangle = new PascalTriangle();
        List<List<Integer>> valuesTriangle = Arrays.asList(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3,3,1),
                List.of(1,4,6,4,1));

        Assert.assertEquals(valuesTriangle, triangle.creatPascalTri(rowNumber));
    }
}
