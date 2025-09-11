public class Category{

  private Long CategoryId;
  private String CategoryName;

  public Category(long categoryId, String CategoryName){
          this.categoryId = categoryId;
          this.categoryName = categoryName;
}
  @Entity(name="categories")
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public class Category{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;
    @NotBlank
    @Size(min=5,message="Category name must contain atleast 5 character";
    private String CategoryName;
    
  }
  
    
    
