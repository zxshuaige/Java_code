package com.company;

/**
 * Author:xixixi
 * Created: $[Date()]
 **/
public class Goods {
    private int id;
    private String name = "未上架";
    private double price;
    private class GoodsHeader{
        final private String ID = "编号";
        final private String Name = "产品名称";
        final private String Price = "单价";
        public String getHeaderInfoO(){
            return this.ID+"  "+this.Name+"    "+this.Price;
        }
    }
    //构造方法
    public Goods(){};
    public Goods(int id) {
        this.id = id;
    }
    public Goods(int id, String name){
        this(id);
        this.name = name;
    }
    public Goods(int id, String name, double price){
        this(id, name);
        this.price = price;
    }

    //get set 方法

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHeaderInfo(){
        return new GoodsHeader().getHeaderInfoO();
    }
    public String getGoodsInfo(){
        return " "+this.id+"    "+name+"      "+this.price+"元";
    }
}
