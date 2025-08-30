@RestController
public class CategoryController{
 
  private List<Category> categories = new ArrayList<>();
  @GetMapping("/api/public/categories")
  public List<Category> getAllCategories{
  return categories;
}
@PostMapping("/api/public/categories")
 public String createCategory(@RequestBody Category category){
 categories.add(Category)
 return "Category added Sucessfully"
}
