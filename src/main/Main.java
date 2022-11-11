package main;
import dao.ProductDao;
import entity.Brand;
import entity.Category;

public class Main {
    public static void main(String[] args) {
        ProductDao item=new ProductDao();
        // to add product
        item.addProduct(new Product("QWER",95874,Brand.HUAWEI, Category.PHONE,"GOLD",12000,15,1200,true));
        item.addProduct(new Product("RTYU",1324,Brand.APPLE,Category.NOTEBOOK,"GRAY",15000,5,100,true));
        item.addProduct(new Product("ZXCF",1235,Brand.CASPER,Category.NOTEBOOK,"PINK",5000,20,500,true));
        item.addProduct(new Product("ZXCF",1235,Brand.ASUS,Category.NOTEBOOK,"PINK",5000,20,500,true));
        item.addProduct(new Product("ZXCF",1235,Brand.CASPER,Category.PHONE,"PINK",5000,20,500,true));

        // listing by category
        System.out.println(item.getProductByCategory(Category.NOTEBOOK));

        //to remove product
        item.deleteProductById(1324);

        //listing by brand
        System.out.println(item.getProductByBrand(Brand.CASPER));

        // to list all products
        System.out.println(item.getProducts());









    }
}
