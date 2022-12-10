public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
       /*
        * iterate through sizes
        Case 1: the integer in size is 0 and you do nothing 
        Case 2: the file is less than or the exact same size as the cluster size, so you just add the cluster size to the sum 
        Case 3: The file is greater than the clustersize so you divide the size by the cluster size and if the mod division of the 
        file's int value is greater than 
        */
long sum = 0; 
        for(int num: sizes){
            if(num>0){

                if(num<=clusterSize){
                    sum+=clusterSize;
                }

                long remainder = (long)num%clusterSize;

                if((num>clusterSize)&&(remainder == 0.0)){
                    long mult = (long)num/clusterSize;
                    sum += clusterSize*mult;
                }

                if((num>clusterSize)&&(remainder != 0.0)){
                    long mult = (long)num/clusterSize;
                    sum += clusterSize*mult;
                    sum+= clusterSize;
                }


            }
        }

        return sum; 
    }
 }