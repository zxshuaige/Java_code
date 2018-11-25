package com.company;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Main {

    public static void shop(){
        ListOfGoods goods = new ListOfGoods();
        ListOfBill bills = new ListOfBill();
        Scanner sc = new Scanner(System.in);
        while(true){
            new Interface().getStartInterface();
            String str = sc.next().toUpperCase();
            switch (str){
                case "A":
                    new Interface().getAboutInterface();
                    break;
                case "S":
                    while(true){
                        new Interface().getSetInterface();
                        String stru = sc.next().toUpperCase();
                        switch (stru){
                            case "A":
                                goods.getListOfGoodsInfo();
                                continue;
                            case "U":
                                goods.inputGoods(sc);
                                continue;
                            case "D":
                                goods.outputGoods(sc);
                                continue;
                            case "Q":
                                break;
                            default:
                                System.out.println("输入错误。请重新输入！！");
                        }
                        break;
                    }
                    break;
                case "U":
                    while(true){
                        new Interface().getUseInterface();
                        String strs = sc.next().toUpperCase();
                        switch (strs){
                            case "A":
                                goods.getListOfGoodsInfo();
                                continue;
                            case "U":
                                bills.inputBill(goods, sc);
                                continue;
                            case "D":
                                bills.outputBill(sc);
                                continue;
                            case "Q":
                                break;
                            case "L":
                                bills.getListOfBill();
                                continue;
                            default:
                                System.out.println("输入错误，请重新输入！！");
                        }
                        break;
                    }
                    break;
                case "Q":
                    new Interface().getEndInterface();
                    return;
                default:
                    System.out.println("输入错误，请按要求输入！！");
            }
        }
    }

    public static void main(String[] args) {
        shop();
    }
}
