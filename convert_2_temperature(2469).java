class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15;
        double f=celsius*1.80+32.00;
        double[] ret=new double[2];
        ret[0]=kelvin;
        ret[1]=f;
        return ret;
    }
}
