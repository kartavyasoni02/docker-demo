package com.docker.DockerApp.resource;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DockerController {


  @PostConstruct
  void init(){

  }

  @GetMapping("apicalling")
  private String callApi(){
    Map<Integer,String> map1 = new HashMap<>();
    Map<Integer,String> map = new HashMap<>();
    map.put(0,"Italy");
    map.put(1,"China");
    map.put(2,"Iran");

    System.out.println(map.entrySet().stream().map(Function.identity()).collect(Collectors.toMap(t->t.getKey()+1,t->t.getValue())));
    return "DockerApp Running";
  }

}
