public class AreaCalculator {
    public static double area(double r) {
        if (r < 0) {
            return -1;
        } else {
            return r * r * 3.1416;
        }
    }
        public static double area(double x, double y){
            if(x<0||y<0){
                return -1;
            }else{
                return x*y;
            }
        }

    public static void main(String[] args) {
        System.out.println(area(5));
    }
     }
