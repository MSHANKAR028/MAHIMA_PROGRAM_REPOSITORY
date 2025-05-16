public class TriangleType {

    public static String typeTriangle(int[] sides){
        if(sides.length != 3){
            return "Invalid not a triangle";
        }

        if(sides[0]+sides[1]<sides[2] || sides[0] + sides[2] < sides[1] ||sides[1] + sides[2] < sides[0]){
            return "none";
        }


            if(sides[0]==sides[1] && sides[1]==sides[2]){
                return "Equilateral";
            }
            else if(sides[0]==sides[1]||sides[0]==sides[2]||sides[1]==sides[2]){
                return "Isosceles";
            }
            else{
                return "Scalene";
            }


    }
    public static void main(String[] args) {
        //System.out.println(typeTriangle(new int[]{1,2,3,4}));
        System.out.println(typeTriangle(new int[]{1,2,3,}));

    }












}
