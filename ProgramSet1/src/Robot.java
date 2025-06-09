public class Robot {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            switch (ch) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
                    break;
            }
        }

        return x == 0 && y == 0;

    }
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.judgeCircle("UD"));
        System.out.println(robot.judgeCircle("UL"));
    }
}
