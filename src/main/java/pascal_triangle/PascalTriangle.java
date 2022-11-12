package pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> creatPascalTri(int rowNumber) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        if(rowNumber <= 1)
            return triangle;

        for (int i = 1; i < rowNumber; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++)
                row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));

            row.add(1);
            triangle.add(row);
            }
        return triangle;
    }
}
