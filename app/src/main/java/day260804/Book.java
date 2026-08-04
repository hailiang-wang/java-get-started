package day260804;

/**
 * Book 类
 */
class Book {
    public String name;
    public String author;
    public String isbn;
    public double price;

    // 实例化方法
    protected Book(){
        this.name = "张三";
        this.price = 1.0;
    }

    public Book(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

}
