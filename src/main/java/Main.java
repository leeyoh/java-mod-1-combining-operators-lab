public class Main {
    public static void main(String[] args) {
        boolean[][] logicTable = {{true,true},{true,false},{false,false},{false,true}};
        
        System.out.println("Truth table for && operator");
        for(boolean[] boolPair : logicTable){
            System.out.println(boolPair[0] + " && " + boolPair[1] + " = " + (boolPair[0] && boolPair[1]));
        }

        System.out.println("Truth table for || operator");
        for(boolean[] boolPair : logicTable){
            System.out.println(boolPair[0] + " || " + boolPair[1] + " = " + (boolPair[0] || boolPair[1]));
        }
    }
}
