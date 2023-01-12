package com.driver;

public class Main {
    Product p = new Product();
    int x = p.product(3, 5);
    int y = p.product(2,3,4);
    double z = p.product(2.0, 3.0);


}
class Product{

    public int product(int x, int y){ return x*y; }
    public int product(int x, int y, int z) { return x*y*z; }
    public double product(double x, double y) { return x*y; }

}