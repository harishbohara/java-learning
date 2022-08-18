package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.gitbub.devlibx.easy.helper.json.JsonUtils;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello World!");

        ObjectMapper objectMapper = new ObjectMapper();
        Pojo pojo = new Pojo();
        pojo.setId(1);
        pojo.setName("harish");

        System.out.println(objectMapper.writeValueAsString(pojo));
        System.out.println(JsonUtils.asJson(pojo));


    }
}
