package com.company;

import java.util.Scanner;

/**
 * Author:xixixi
 * Created: $[Date()]
 **/
public class ListOfBill {
    private Bill[] bills = new Bill[10];
    private double total;
    //计算总价格
    public void setTotal() {
        this.total = 0;
        if(bills == null)
            this.total = 0;
        for(int i = 0; i < bills.length; ++i){
            if(bills[i] == null){
                return;
            }
            this.total = this.total + bills[i].getPrice()*bills[i].getNum();
        }
    }

    public double getTotal() {
        this.setTotal();
        return this.total;
    }

    //获取账单信息
    public void getListOfBill(){
        System.out.println(new Bill().getListOfHeaderInfo());
        if(bills == null){
            System.out.println(this.getListTotal());
            return;
        }
        for(int i = 0; i < bills.length; ++i){
            if(bills[i] == null)
                break;
            System.out.println(bills[i].getListOfGoodsInfo());
        }
        System.out.println(this.getListTotal());
    }
    //获取总价格信息
    public String getListTotal(){
        return "---------------------------\n"+"总计："+this.getTotal()+" 元";
    }
    //下单
    public void inputBill(ListOfGoods listOfGoods, Scanner sc){
        if(bills == null){
            bills = new Bill[10];
        }
        System.out.println("请输入你要下单的商品编号和数量，如：2 3 ");
        int j = 0;
        int id = sc.nextInt();
        int num = sc.nextInt();
        for(int i = 0; i < listOfGoods.getGoods().length; ++i){
            if(listOfGoods.getGoods()[i] == null){
                System.out.println("无商品可下单！");
                return;
            }
            if(listOfGoods.getGoods()[i].getId() == id){
                for(j = 0; j < bills.length; ++j){
                    if(bills[j] == null) {
                        bills[j] = new Bill();
                        bills[j].setId(id);
                        bills[j].setName(listOfGoods.getGoods()[i].getName());
                        bills[j].setNum(num);
                        bills[j].setPrice(listOfGoods.getGoods()[i].getPrice());
                        System.out.println("下单完成！！");
                        return;
                    }
                    if(bills[j].getId() == id){
                       bills[j].setNum(bills[j].getNum()+num);
                        System.out.println("下单完成！！");
                        return;
                    }
                }
                if(j == bills.length){
                    System.out.println("商品单已满！！");
                    return;
                }
            }
        }
        System.out.println("无该编号的商品！！");
        return;
    }
    //退单
    public void outputBill(Scanner sc){
        if(bills == null){
            System.out.println("账单为空！！");
            return;
        }
        System.out.println("请输入要退单的商品编号，如：3 ");
        int id = sc.nextInt();
        for(int i = 0; i < bills.length; ++i){
            if(bills[i] == null){
                System.out.println("无此编号商品！！");
                return;
            }
            if(bills[i].getId() == id){
                for(int j = i; j < bills.length-1; ++j){
                    bills[j] = bills[j+1];
                    bills[j+1] = new Bill();
                }
                System.out.println("退单成功！");
                return;
            }
        }
        System.out.println("无此编号商品！！");
        return;
    }
}
