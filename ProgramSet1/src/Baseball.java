import java.util.LinkedList;

public class Baseball {
    public int calPoints(String[] operations) {
        LinkedList<Integer>records=new LinkedList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                records.remove(0);
            }
            else if(operations[i].equals("D")){
                int score=records.get(0) *2;
                records.add(0,score);
            }
            else if(operations[i].equals("+")){
                int score=records.get(0)+records.get(1);
                records.add(0,score);
            }
            else{
                try{
                    int score=Integer.parseInt(operations[i]);
                    records.add(0,score);
                }catch(NumberFormatException e){
                    System.out.println("Invalid input");
                }
            }
        }
        int sum=0;
        for(int i=0;i<records.size();i++){
            sum+=records.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Baseball base=new Baseball();
        System.out.println(base.calPoints(new String[]{"5","2","C","D","+"}));
        System.out.println(base.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }









}
