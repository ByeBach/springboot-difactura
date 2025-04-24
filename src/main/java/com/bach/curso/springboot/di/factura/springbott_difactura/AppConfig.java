package com.bach.curso.springboot.di.factura.springbott_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.bach.curso.springboot.di.factura.springbott_difactura.models.Item;
import com.bach.curso.springboot.di.factura.springbott_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {
    
    @Bean 
    List<Item> itemsInvoice(){
        Product p1 = new Product("camare sony", 1000);
        Product p2 = new Product("camara canon", 2000);
        Product p3 = new Product("camara nikon", 3000);
        List<Item> items = Arrays.asList(new Item(p1,2), new Item(p2,3), new Item(p3,4));
        return items;
    }
    
    @Primary
    @Bean 
    List<Item> itemsInvoiceOffice(){
        Product p1 = new Product("word", 10);
        Product p2 = new Product("windows pro", 50);
        Product p3 = new Product("microsoft keep", 2);
        List<Item> items = Arrays.asList(new Item(p1,2), new Item(p2,3), new Item(p3,4));
        return items;
    }


}
