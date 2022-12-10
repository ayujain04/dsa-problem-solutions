import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class MedalTable {
    public String[] generate(String[] results) {
         HashMap<String, MedalCountry> map = new HashMap<>(); 
        for(String s: results){
            String[] data = s.split(" ");
            for(int i = 0; i<data.length; i++){
                if(!map.containsKey(data[i])){
                    map.put(data[i], new MedalCountry(data[i]));
                }
                if(i==0){
                    map.get(data[i]).wonGold(); 
                }
                if(i==1){
                    map.get(data[i]).wonSilver(); 
                }
                if(i==2){
                    map.get(data[i]).wonBronze(); 
                }
            }
        }
        ArrayList<MedalCountry> list = new ArrayList<>(map.values());
        Comparator<MedalCountry> gold = Comparator.comparing(MedalCountry::getGold).reversed(); 
        Comparator<MedalCountry> silver = Comparator.comparing(MedalCountry::getSilver).reversed(); 
        Comparator<MedalCountry> bronze = Comparator.comparing(MedalCountry::getBronze).reversed(); 
        Comparator<MedalCountry> country = Comparator.comparing(MedalCountry::getName); 
        Comparator<MedalCountry> comp = gold.thenComparing(silver).thenComparing(bronze).thenComparing(country);
        Collections.sort(list,comp); 

        String[] ans = new String[list.size()];
        for(int i = 0; i<ans.length; i++){
            ans[i] = list.get(i).toString();
        }   
        return ans; 
    }
    private class MedalCountry{
        String myName; 
        int myGold; 
        int mySilver; 
        int myBronze; 
        MedalCountry(String name){
            myName = name; 
            myGold = 0; 
            mySilver = 0; 
            myBronze = 0; 
        }
        public void wonGold(){
            myGold++; 
        }
        public void wonSilver(){
            mySilver++; 
        }
        public void wonBronze(){
            myBronze++; 
        }
        public int getGold(){
            return myGold; 
        }
        public int getSilver(){
            return mySilver; 
        }
        public int getBronze(){
            return myBronze; 
        }
        public String getName(){
            return myName; 
        }
        @Override
        public String toString(){
            return String.format("%s %d %d %d", 
            myName, myGold, mySilver, myBronze);
        }
    }
  }
 