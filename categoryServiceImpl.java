  @Service
  public class CategoryServiceImpl implements CategoryService{
  private List<Category> categories = new ArrayList<>();
  private CategoryService categoryService;
  @Override
  public list<Category> getAllCategories(){
    return categories;
  }
  @Override
  public void createCategory(Category category){
  categories.add(category);
  }

}
