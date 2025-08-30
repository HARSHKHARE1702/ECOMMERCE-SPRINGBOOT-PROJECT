public class CategoryServiceImpl implements CategoryService{
  private CategoryService categoryService;
  
  
  
  
  private List<Category> categories = new ArrayList<>();
  @Override
  public list<Category> getAllCategories(){
    return categories;
  }
  @Override
  public void createCategory(Category category){
  categories.add(category);
  }

}
