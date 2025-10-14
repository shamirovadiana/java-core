package lessons.lesson03;

import java.util.HashMap;
import java.util.Map;

public class OnlineStore {
    private final Map<String,Integer> productAmountMap;
    private final Map<String, Product> productMap;
    public OnlineStore(){
        productMap = new HashMap<>();
        productAmountMap = new HashMap<>();
    }
    public void addProduct(String code, Product product, Integer quantity){
        productMap.putIfAbsent(code, product);
        Integer quant = productAmountMap.getOrDefault(code, 0);
        productAmountMap.put(code, quant + quantity);
    }
    private void buyProduct(final String code, final Integer count){
        subtractProduct(code, count);
        getProductInfo(code);
        System.out.println("Спасибо за покупку!");
    }

    private void subtractProduct(final String productCode, final Integer count){
        Integer quantity = productAmountMap.get(productCode);
        if(quantity <= count){
            System.out.println("Недостаточно товаров");
            throw new RuntimeException("Недостаточно товаров");
        }else{
            productAmountMap.replace(productCode, quantity - count);
        }
    }


    private void getProducts(){
        for (String code : productMap.keySet()){
            Integer quantity = productAmountMap.get(code);
            String name = productMap.get(code).getName();
            long price = productMap.get(code).getPrice();
            System.out.printf("Код продукта: %s | Название: %s | Цена: %s | Количество: %s", code, name, price, quantity);
        }
    }
    public void getProductInfo(final String code){
        Product product = productMap.get(code);
        System.out.printf("Код продукта: %s | Название: %s | Цена: %s", product.getCode(), product.getName(), product.getPrice());
    }

}

