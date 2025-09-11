import org.springframework.web.bind.annotation.RestControllerAdvice
@RestControllerAdvice
public class MyGlobalExceptionHandler {
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<Map<String,String>>myMethodArguemtNotValidException(MethodArgumentNotNull)
Map<String,String>response=new HashMap<>();
e.getBindingResult().getAllErrors().forEach(err->{
String fieldName=((FieldError)err).getField();
String message=err.getDefaultMessage();
response.put(fieldname,message);
});
return new ResponseEntity<Map<String,String>(response,HttpStatus.BAD_REQUEST);
}
@ExceptionHnadler(ResourceNotFoundException.class)
  public ResponseEntity<String> myResourceNotFoundExcception(ResourceNotFoundException e );
  String Message = e.getMessage();
  return new ResponseEnity<>(Message,HTTPStatus.NotFound);
