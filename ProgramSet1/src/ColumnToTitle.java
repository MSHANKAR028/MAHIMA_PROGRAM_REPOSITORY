import java.util.LinkedList;

public class ColumnToTitle {
    public String columnTotitle(int column) {
        int divisor = 26;
        LinkedList<Integer> list = new LinkedList<>();
        while (column != 0) {
            list.addFirst(column % divisor);
            column /= divisor;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();


    }
    public static void main(String[] args) {
        ColumnToTitle obj = new ColumnToTitle();
        System.out.println(obj.columnTotitle(1));
        System.out.println(obj.columnTotitle(2));
    }

}
