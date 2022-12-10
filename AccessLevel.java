public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
           char[] clearance = new char[rights.length]; 

           for(int i=0; i<rights.length; i++){
                if (rights[i]>=minPermission){
                    clearance[i] = 'A';
                }
                if (rights[i]<minPermission){
                    clearance[i] = 'D';
                }
           }

            String solution = new String (clearance);

            return solution; 
    }
 }