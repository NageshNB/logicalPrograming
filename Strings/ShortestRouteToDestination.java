package Strings;

public class ShortestRouteToDestination {

    static void findShortestRoute(String route){
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        for(int i = 0; i < route.length(); i++){
            switch (route.charAt(i)) {
                case 'E':
                    x2++;
                    break;
                case 'W':
                    x2--;
                    break;
                case 'N':
                    y2++;
                    break;
                case 'S':
                    y2--;
                    break;
            
                default:
                    break;
            }
        }

        int xaxis = (int)Math.pow(x2 -x1 , 2);
        int yaxis = (int)Math.pow(y2-y1, 2);

        int shortestRoute = (int)Math.sqrt(xaxis+yaxis);
        System.out.println(shortestRoute);
    }
    
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        findShortestRoute(str);
    }
}
