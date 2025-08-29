@RestController
public class CategoryController{
 
  private List<Category> categories = new ArrayList<>();
  @GetMapping("/api/public/categories")
  public List<Category> getAllCategories{
  return categories;
}
}
