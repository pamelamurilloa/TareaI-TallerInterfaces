/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tc1_diccionariosylistas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author pamelamurillo
 */
public class TC1_DiccionariosYListas {

    public static boolean IsEven (int number) {
        return number % 2 == 0;
    }
    
    
    //ArrayList Zone
    public static ArrayList makeArrayList() {
        ArrayList<Integer> randomNumberList = new ArrayList();
        int maxNumber = 25, newNumber;
        for (int i = 0; i < maxNumber; i++) {
            newNumber = (int)(Math.random() * maxNumber);
            randomNumberList.add(newNumber);
        }
        return randomNumberList;
    }
    
    public static ArrayList changeArrayList(ArrayList<Integer> numberArray) {
        ArrayList<String> changedArray = new ArrayList<>();
        String newString = "";
        for (int index = 0; index < numberArray.size(); index++) {
            if ( IsEven( numberArray.get(index) ) ) {
                newString = "$";
            } else {
                newString = "#";
            }
            changedArray.add(newString);
        }
        
        return changedArray;
    }
    
    //End ArrayList Zone
    
    //HashMap Zone
    
    public static HashMap makeHashMap() {
        HashMap<Integer, Integer> randomNumberHashMap = new HashMap<>();
        int maxNumber = 25, newNumber;
        for (int i = 0; i < maxNumber; i++) {
            newNumber = (int)(Math.random() * maxNumber);
            randomNumberHashMap.put(i, newNumber);
        }
        return randomNumberHashMap;
    }
    
    
    public static HashMap changeHashMap(HashMap<Integer, Integer> numberHashMap) {
        HashMap<Integer, String> changedHashMap = new HashMap<>();
        String newString = "";
        for (int index = 0; index < numberHashMap.size(); index++) {
            if ( IsEven( numberHashMap.get(index) ) ) {
                newString = "$";
            } else {
                newString = "#";
            }
            changedHashMap.put(index, newString);
        }
        
        return changedHashMap;
    }
    
    //End HashMap Zone
    
    public static void main(String[] args) {
        ArrayList<Integer> originalArray = makeArrayList();
        ArrayList<String> newArray = changeArrayList( originalArray );
        System.out.println( originalArray + "\n" + newArray );
        
        HashMap<Integer, Integer> originalHashMap = makeHashMap();
        HashMap<Integer, String> newHashMap = changeHashMap( originalHashMap );
        System.out.println( originalHashMap + "\n" + newHashMap );
    }
    

    
}
