public class Primes {
    public static void main(String[] args) {
    int maxnumber = Integer.parseInt(args[0]);
    boolean [] numarr= new boolean[maxnumber+1];
    
    int p_num=2;
    int count_p=0;

    numarr[0]=false;
    numarr[1]=false;

    for (int i = 2; i <numarr.length ; i++) {  
         numarr[i] = true;
    }
    
    while (p_num<Math.sqrt(maxnumber)) { 
        if (numarr[p_num]==true) {
            for (int j = 2; j <numarr.length; j++) {
                if (j == p_num) {
                    numarr[j]= true;
                }
                else if (j % p_num==0) {
                    numarr[j]= false;
                }
   
            }
        }
        p_num++;
    }

    System.out.println("Prime numbers up to " + maxnumber + ":");
    for (int j = 2; j < numarr.length; j++) {
        if (numarr[j]== true) {
            count_p++; 
            System.out.println(j);
  
        } 
    }

        int per = (int)(((double)count_p/maxnumber)*100);
        System.out.print("There are" +" "+ count_p +" "+ "primes between 2 and" + " " + maxnumber + " (" + per + "% are primes)");
        
    }
}
