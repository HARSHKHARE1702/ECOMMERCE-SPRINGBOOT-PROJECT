@RestController
public class CategoryController{
 @Autowired
 private CategoryService categoryService
  private List<Category> categories = new ArrayList<>();//Storing a category in a list
 //Get all Category from List
 @GetMapping("/api/public/categories")
  public List<Category> getAllCategories{
  return categories;
}
 //Post all Category from List
@PostMapping("/api/public/categories")
 public String createCategory(@RequestBody Category category){
 categories.add(Category)
 return "Category added Sucessfully"
}
@DeleteMapping("api/admin/categories/{CategoryId})
 public ResponseEntity<String>deleteCategory(@PathVariable Long categoryId){
  try{
   String status = categoryService.deleteCategory(categoryId);
   return new ResponseEntity<>(Status,HttpsStatus.OK);
  }
  Catch(ResponseStatusException e){
   return new ResponseEntity<>(e.getReason(),e.getStatusCode());
  }
 }
}
    
