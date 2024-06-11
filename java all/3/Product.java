class Product{
    private int productID;
    private String productName;
    private float price;
    Product(){
        productID = 0;
        productName = "";
        price= 0.0f;
    }
    Product(int x, String y){
        productID = x;
        productName = y;
        price= 0.0f;
    }
    Product(int x, String y, float z){
        productID =x;
        productName = y;
        price = z;
    }
    void display(){
        System.out.println("ProductId: "+productID);
        System.out.println("productName: "+productName);
        System.out.println("price: "+price);
    }
    public static void main(String args[]){
        Product p1 = new Product();
        p1.display();
        Product p2 = new Product(101,"Mobile");
        p2.display();
        Product p3 = new Product(101,"Laptop",32000.50f);
        p3.display();
    }
}