package com.furnitureapp.entity.stockcontrol;

/**
 * @author @Siba182
 * Description: Entity for ProductCatergory
 */

public class ProductCategory {
    private Long categoryCode;
    private String categoryName;

    private ProductCategory(ProductCategoryBuilder builder) {
        this.categoryCode = builder.categoryCode;
        this.categoryName = builder.categoryName;
    }

    public Long getCategoryCode() {
        return categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public static class ProductCategoryBuilder {
        private Long categoryCode;
        private String categoryName;

        public ProductCategoryBuilder setCategoryCode(Long categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }

        public ProductCategoryBuilder setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        public ProductCategoryBuilder copy(ProductCategory productCategory){
            this.categoryCode = productCategory.categoryCode;
            this.categoryName = productCategory.categoryName;
            return this;
        }

        public ProductCategory build(){
            return new ProductCategory(this);
        }

    }
}