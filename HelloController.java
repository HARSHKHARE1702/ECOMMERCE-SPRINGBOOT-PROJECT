@RestController
public class HelloController{

    @GetMapping("/hello")
    public String hello(){
    return "Hello World!"
    }
    @PostMapping("/hello")
    public String helloPost(@RequestBody String name){
    return "Hello" + name +"!";
     //in Post Mapping you can send some data along with the request.   
    }

}
