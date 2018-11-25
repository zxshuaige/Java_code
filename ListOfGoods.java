package com.company;

import java.util.Scanner;

/**
 * Author:xixixi
 * Created: $[Date()]
 **/
public class ListOfGoods {
    private Goods[] goods = new Goods[20];

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(int id, String name, double price){

    }

    public void getListOfGoodsInfo(){
        System.out.println(new Goods().getHeaderInfo());;
        if(goods == null)
            return;
        for(int i = 0; i < goods.length; ++i){
            if(goods[i] == null)
                goods[i] = new Goods();
            System.out.println(goods[i].getGoodsInfo());
        }
    }

    public void inputGoods(Scanner sc){
        System.out.println("请输入要上架的商品，如：1 娃哈哈 2.9");
        if(goods == null){
            goods = new Goods[20];
        }
        int id = sc.nextInt();
        String name = sc.next();
        double price = sc.nextDouble();
        for(int i = 0; i < goods.length; ++i){
            if(goods[i] == null){
                goods[i] = new Goods(id, name, price);
                System.out.println("上架成功1");
                return;
            }
            if(goods[i].getId() == 0){
                goods[i] = new Goods(id, name, price);
                System.out.println("上架成功2");
                return;
            }
            if(goods[i].getId() == id){
                goods[i].setName(name);
                goods[i].setPrice(price);
                System.out.println("上架成功3");
                return;
            }
            if(goods[i].getName() == name){
                goods[i].setId(id);
                goods[i].setPrice(price);
                System.out.println("上架成功4");
                return;
            }
        }
        System.out.println("商品架已满！");
        return;
    }

    public void outputGoods(Scanner sc){
        System.out.println("请输入要下架的商品编号，如：1");
        int id = sc.nextInt();
        if(goods == null){
            System.out.println("商品架为空！");
            return;
        }
        for(int i = 0; i < goods.length; ++i){
            if(goods[i] == null){
                System.out.println("无该编号商品！");
                return;
            }
            if(goods[i].getId() == id){
                for(int j = i; j < goods.length-1; ++j){
                    goods[j] = goods[j + 1];
                    goods[j + 1] = new Goods();
                }
                System.out.println("下架成功！！");
                return;
            }
        }
        System.out.println("无该编号商品！");
        return;
    }
}
