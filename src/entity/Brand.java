package entity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum Brand {
    SAMSUNG(0),
    LENOVO(1),
    APPLE(2),
    HUAWEI(3),
    CASPER(4),
    ASUS(5),
    HP(6),
    XIOMI(7),
    MONSTER(8);

    int id;
    Brand(int id){
        this.id=id;
    }

    static List<String> brandNames = new ArrayList<>();
    public static void showList(){
        for(Brand b: Brand.values()){
            brandNames.add("- "+b.toString().charAt(0)+b.toString().substring(1).toLowerCase());
        }
        brandNames = brandNames.stream().sorted().collect(Collectors.toList()); //önce stream e cevirip sıraladık.sonra tekrar listeye cevirdik
        brandNames.forEach(System.out::println); // ekrana bastık
    }
}
