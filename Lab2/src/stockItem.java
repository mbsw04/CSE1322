class stockItem {
    String description;
    int id;
    static int next_id = 0;
    float price;
    int quantity;

    stockItem(){
        id = next_id;
        next_id++;
        description = "";
        price = 0.00f;
        quantity = 0;
    }

    stockItem(String set_description,float set_price,int set_qty){
        id = next_id;
        next_id++;
        description = set_description;
        price = set_price;
        quantity = set_qty;
    }

    @Override
    public String toString() {
      return "Item number: " + id + " is " + description + " has price " + price + " we currently have " + quantity + " in stock";
    }
    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(float x){
        if (x < 0) {
            System.out.println("set price invalid");
        }else{
            price = x;
        }
    }

    public void lower_Qty(int x){
        if ((quantity-x)<0){
            System.out.println("Not enough stock");
        }else{
            quantity -= x;
        }
    }

    public void raise_Qty(int x){
        if (x < 0){
            System.out.println("Invalid input");
        }else{
            quantity += x;
        }
    }
}

