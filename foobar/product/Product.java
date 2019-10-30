package foobar.product;

import foobar.product.product_interface.*;

public abstract class Product {
    public abstract Plant getPlant(String plant);
    public abstract Animal getAnimal(String animal);
}