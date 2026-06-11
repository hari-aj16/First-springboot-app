package com.example.HelloWorld;

import org.springframework.stereotype.Component;

@Component
public class TodoRepository {
    String gettodos(){
        return "Todos";
    }
}