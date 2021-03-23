/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author shegavala
 */
class BurgerOrder {
    
        private int numHamburgers = 0;
        private int numCheeseburgers = 0;
        private int numVeggieburgers = 0;
        private int numSodas = 0;
        private boolean orderTogo = false;
        private int orderNum = 5;

    public BurgerOrder(int _numHamburgers,int _numCheeseburgers,int _numVeggieburgers,int _numSodas,boolean _orderTogo,int _orderNum) 
    {
        
        this.numHamburgers = _numHamburgers;
        this.numCheeseburgers = _numCheeseburgers;
        this.numVeggieburgers =  _numVeggieburgers;
        this.numSodas = _numSodas;
        this.orderTogo = _orderTogo ;
        this.orderNum = _orderNum; 
    } 
        /**
         * Get the value of numHamburgers
         *
         * @return the value of numHamburgers
         */
    public int getNumHamburgers() 
    {
            return numHamburgers;
    }
        /**
         * Set the value of numHamburgers
         *
         * @param numHamburgers new value of numHamburgers
         */
    public void setNumHamburgers(int numHamburgers) 
    {
            this.numHamburgers = numHamburgers;
            if (numHamburgers <0){
                System.out.println("Error");
            }

    }
        /**
         * Get the value of numCheeseburgers
         *
         * @return the value of numCheeseburgers
         */
    public int getNumCheeseburgers() 
    {
            return numCheeseburgers;
    }
         /**
         * Set the value of numCheeseburgers
         *
         * @param numCheeseburgers new value of numCheeseburgers
         */
    public void setNumCheeseburgers(int numCheeseburgers) 
    {
            this.numCheeseburgers = numCheeseburgers;
            if (numCheeseburgers <0){
                System.out.println("Error");

            }
    }
        /**
         * Get the value of numVeggieburgers
         *
         * @return the value of numVeggieburgers
         */
    public int getNumVeggieburgers() 
    {
            return numVeggieburgers;
    }
        /**
         * Set the value of numVeggieburgers
         *
         * @param numVeggieburgers new value of numVeggieburgers
         */
    public void setNumVeggieburgers(int numVeggieburgers) 
    {
            this.numVeggieburgers = numVeggieburgers;
            if (numVeggieburgers <0)
            {
                System.out.println("Error");
            }
    }
        /**
         * Get the value of numSodas
         *
         * @return the value of numSodas
         */
    public int getNumSodas() 
    {
            return numSodas;
    }
        /**
         * Set the value of numSodas
         *
         * @param numSodas new value of numSodas
         */
    public void setNumSodas(int numSodas) 
    {
            this.numSodas = numSodas;

            if (numSodas <0){
                System.out.println("Error");

            }
    }
        /**
         * Get the value of orderTogo
         *
         * @return the value of orderTogo
         */
    public boolean isOrderTogo() 
    {
            return orderTogo;
    }
        /**
         * Set the value of orderTogo
         *
         * @param orderTogo new value of orderTogo
         */
    public void setOrderTogo(boolean orderTogo) 
    {
            this.orderTogo = orderTogo;
    }
        /**
         * Get the value of orderNum
         *
         * @return the value of orderNum
         */
    public int getOrderNum() 
    {
            return orderNum;
    }
        /**
         * Set the value of orderNum
         *
         * @param orderNum new value of orderNum
         */
        public void setOrderNum(int orderNum) {
            this.orderNum = orderNum;
        }

    @Override
    public String toString() {
        return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheeseburgers=" + numCheeseburgers + ", numVeggieburgers=" + numVeggieburgers + ", numSodas=" + numSodas + ", orderTogo=" + orderTogo + ", orderNum=" + orderNum + '}';
    }

    
}
