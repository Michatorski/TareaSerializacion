package org.iesfm.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {

        ObjectMapper om = new ObjectMapper();
        Shop shop = om
                .readValue(
                        new File(
                                Main.class.getResource("/tienda.json").toURI()
                        ),
                        Shop.class
                );
        
        System.out.println(shop.getCatalog().size());
    }
}
