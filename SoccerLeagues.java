public class SoccerLeagues {
    public int[] points(String[] matches) {
       //W = 3 points, D = 1 point, L = 0 points
       //
       int[] answer = new int[matches.length]; 

       for(int a: answer ){
        a = 0; 
       }

      for(int z = 0; z<matches.length; z++){
        for(int i = 0; i<matches[z].length(); i++){
            String c1 = matches[z].substring(i,i+1); 

            if(!(c1.equals("-"))){
                if(c1.equals("W")){
                    answer[z]+=3; 
                }
                if(c1.equals("L")){
                    answer[i]+=3; 
                }
                if(c1.equals("D")){
                    answer[z]++;
                    answer[i]++; 
                }
            }

        }
      }
        return answer; 
       
    }
}