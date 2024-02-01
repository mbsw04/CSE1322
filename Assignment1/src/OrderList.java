class OrderList {
   private Order[] orderList = new Order[1];

   void addOrder(Order x){

      boolean space_found = false;

      for (int i = 0;i < orderList.length;i++){
         if(orderList[i]==null){
            space_found = true;
            orderList[i] = x;
            break;
         }
      }

      if(!space_found){
         Order[] temp = orderList;
         orderList = new Order[(orderList.length)*2];
         for(int i = 0;i < temp.length;i++){
            orderList[i] = temp[i];
         }
         orderList[temp.length] = x;
      }

   }

   void removeOrder(int x){
      for (int i = 0;i < orderList.length;i++){
         if(orderList[i]==null){
            continue;
         }else if(orderList[i].getId()==x){
            orderList[i] = null;
            System.out.println("Order has been removed.");
            System.out.println();
            break;
         }
      }
   }

   void readyOrder(int x){
      for (int i = 0;i < orderList.length;i++){
         if(orderList[i]==null){continue;}else if(orderList[i].getId()==x){
            orderList[i].ready = true;
            System.out.println("Order has been set to \"Ready\".");
            System.out.println();
            break;
         }
      }
   }

   private void sortOrders(){
      int num_null=0;

      for(int i = 0; i < orderList.length; i++){
         if (orderList[i] == null){
            num_null++;
         }
      }

      Order[] temp = new Order[orderList.length - num_null];

      int j = 0;

      for(int i = 0; i < orderList.length; i++){

         if(orderList[i] != null){
            temp[j] = orderList[i];
            j++;
         }
      }

      boolean change = true;
      while(change) {
         change = false;
         for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i].getId() > temp[i + 1].getId()) {
               Order temp_1 = temp[i + 1];
               temp[i + 1] = temp[i];
               temp[i] = temp_1;
               change = true;
            }
         }
      }

      for(int i = 0; i < num_null;i++){
         orderList[i] = null;
      }

      for(int i = 0; i < temp.length; i++){
         orderList[i+num_null] = temp[i];
      }

   }

   String printOrder(int x){
      String y = "";

      for (int i = 0;i < orderList.length;i++){
         if (orderList[i] == null){
            continue;
         }else if(orderList[i].getId()==x){
            y = orderList[i].toString();
            return y;
         }
      }
      return "No such order found \n";
   }

   void printOrders(){
      sortOrders();
      String Ready = "";
      String NotReady = "";

      for (int i = 0;i < orderList.length;i++) {
         if (!(orderList[i] == null)) {
            if (orderList[i].ready) {
               Ready += orderList[i].getId()+"\n";
            }else{
               NotReady += orderList[i].getId()+"\n";
            }
         }
      }
      System.out.println("Ready\n"+Ready+"Preparing\n"+NotReady);
   }
}
