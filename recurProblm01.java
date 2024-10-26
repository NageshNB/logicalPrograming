package logicalPrograming;

class recurProblm01 {

    public static void main(String ars[]){
        int num = 5;
        int tot = 1;
        
        // sumOfNum(0,num);

        
        calcFactorial(tot,num);

    }

    static void calcFactorial(int tot,int num){
        if(num == 0 || num == 1){
            tot *= 1;
            System.out.println(tot);
            return;
        }
        tot *= num;
        calcFactorial(tot, num-1);
    }

    static void sumOfNum(int sum,int num){
if(num ==1) {
    sum += num;
System.out.println(sum);
return;
}

sum += num;
sumOfNum(sum, num-1);
    }
}