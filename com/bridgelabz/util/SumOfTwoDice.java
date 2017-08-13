

 class RollTheDice {
   
   public static void main(String[] args) {
    
        int die1;   
        int die2;   
        int sum;   
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        sum = die1 + die2;
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total sum is " + sum);

    }  
 
}  
