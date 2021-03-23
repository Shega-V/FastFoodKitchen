/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;

/**
 *
 * @author shegavala
 */
public class FastFoodKitchen {
    
   //add an ArrayList of BurgerOrder objects called orderList. Make orderList private.
    private ArrayList<BurgerOrder>orderList = new <BurgerOrder> ArrayList();
    
        private static int nextOrderNum;
        private static int incrementNextOrderNum;
    /**
     * Get the value of nextOrderNum
     *
     */
        
    public FastFoodKitchen() {
        
    orderList.add(new BurgerOrder(3,5,4,10,false,getNextOrderNum()));
    incrementNextOrderNum();
     
    orderList.add(new BurgerOrder(0,0,3,3,true, getNextOrderNum()));
    incrementNextOrderNum();
    
    orderList.add(new BurgerOrder(1,1,0,2,false, getNextOrderNum()));
    incrementNextOrderNum();
   
    }
    

    private static int getNextOrderNum() {
        return nextOrderNum;
    }
   
    /**
     * Get the value of incrementNextOrderNum
     *
     * @return the value of incrementNextOrderNum
     * 
     */
    private static void incrementNextOrderNum(){
        
        nextOrderNum++;
    
    }
    
    private static int getIncrementNextOrderNum() {
        return incrementNextOrderNum;
    }

    /**
     * Set the value of incrementNextOrderNum
     *
     * @param incrementNextOrderNum new value of incrementNextOrderNum
     */
    private static void setIncrementNextOrderNum(int incrementNextOrderNum) {
        FastFoodKitchen.incrementNextOrderNum = incrementNextOrderNum;
    }
   
    /**
     *
     * @param numHamburgers
     * @param numCheeseburgers
     * @param numVeggieburgers
     * @param numSodas
     * @param orderTogo
     * @return
     */
    public int addOrder(int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, boolean orderTogo){
        
        orderList.add(new BurgerOrder(1,2,3,1,true,getNextOrderNum()));
        incrementNextOrderNum();
        
        return nextOrderNum;
    }
    
    /**
     *
     * @param orderID
     * @return
     */
    public boolean isOrderDone(int orderID){
            
        for (int i =0; i <orderList.size();i++) 
        {
            
         if(orderList.size()==nextOrderNum){
             
        return false;
        
        }
        }

        return true;
        }
        private void orderCallOut(){
             
            for (int i = 0; i <orderList.size();i++){
                System.out.println(i);
            }
        }
            
        private void completeSpecificOrder(int orderID){
            
            while(orderList.size() == orderID){
            System.out.println("This order is done !");
            }
            if(isOrderTogo()){
                orderCallOut();
            }
        }

    /**
     *
     * @return
     */
    public int getNumOrdersPending(){
            return orderList.size();
            }

    /**
     *
     */
    public void simulateKitchenActivity() {
             if (orderList.size() == 0) return;
           
           int num = (int)(Math.random()*100);
           if (num < 90) {
                completeNextOrder();
           } else {
               
               int size = orderList.size();
               int id = (int)(Math.random()*size);
               completeSpecificOrder(id);
}     
    }
           public boolean cancelOrder(int orderID){
               for(int i=0; i<orderList.size(); i++){
               
               if(orderList.size()==orderID){
                   orderList.remove(true);
                   
               }
               
        return true;
           
           }
        return false;
           }
 

    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + '}';
    }

    private void completeNextOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isOrderTogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int cancelOrder(int ham, int cheese, int veggie, int sodas, boolean TOGO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
            
            
        }

    
        
            
        

       
            
        
        
        
        
    
    
    



