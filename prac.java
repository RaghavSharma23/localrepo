import java.util.*;
public class prac{
    public static void hollowRec(int totalRow,int totalColumn){
        for(int i=1; i<=totalRow; i++){
            for(int j=1;j<=totalColumn; j++){
                if(i==1 || i==totalRow || j==1 || j==totalColumn){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }System.out.println();
    }
    public static void main(String[] args){
        hollowRec(4,5);
    }
}