@RestController
public class HelloController{

    /Users/{userId}
    /Users/1
    @GetMapping("/hello/{name}")
    public  HelloResponse helloParam(@PathVariable_String name){
    return new HelloResponse( "Hello,"+name);
    }
    
    @PostMapping("/hello")
    public String helloPost(@RequestBody String name){
    return "Hello" + name +"!";
     //in Post Mapping you can send some data along with the request.   
    }

}
