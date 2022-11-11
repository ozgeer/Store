package dao;
import entity.Category;
import entity.Brand;
import main.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductDao {
    private List<Product> products=new ArrayList<>();
    
    public List<Product> getProducts(){
        return products;
//        return products.stream()
//                .filter(x -> x.isActive==isActive)
//                .collect(Collectors.toList());
    }

    public void deleteProductById(int productId){
        Optional<Product> stuff = products.stream()
                .filter(x->x.getProductId()==productId)
                .findFirst();
        System.out.println("it is gonna delete by "+productId);
//        stuff.map(x->x.isActive==false);
        stuff.ifPresent(product->products.remove(product));

    }

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProductByCategory(Category category){
        return products.stream()
                .filter(x->x.getCategory()==category)
                .collect(Collectors.toList());
    }

    public List<Product> getProductByBrand(Brand brand){
        return products.stream()
                .filter(x->x.getBrand()==brand)
                .collect(Collectors.toList());

    }
    
}
