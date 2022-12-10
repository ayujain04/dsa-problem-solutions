public class CirclesCountry {
    /**
     * @param x
     * @param y
     * @param r
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
    
    int d1 = 0; 
    int d2 = 0; 
    int borders = 0; 

    for(int i = 0; i<r.length; i++){
        d1 = ((x1-x[i])*(x1-x[i])+(y1-y[i])*(y1-y[i]));
        d2 = ((x2-x[i])*(x2-x[i])+(y2-y[i])*(y2-y[i]));
        if((d1<(r[i]*r[i]))&&!(d2<(r[i]*r[i])))
        {
            borders++;
        }
        if(!(d1<(r[i]*r[i]))&&(d2<(r[i]*r[i])))
        {
            borders++;
        }
    }
    
                          return borders; 
    }
 }
