package com.company;

/**
 * Author:xixixi
 * Created: $[Date()]
 **/
public class Interface {
    //开始页面
    public void getStartInterface(){
        System.out.println();
        System.out.println("****************************************");
        System.out.println("*******  welcome to Simple Shop  *******");
        System.out.println("选择: [S]:设置 [U]:使用 [A]:关于 [Q]:退出");
        System.out.println("****************************************");
        System.out.println();
    }
    //结束页面
    public void getEndInterface(){
        System.out.println();
        System.out.println("*******************************************");
        System.out.println("*******  Thank you use Simple Shop  *******");
        System.out.println("*        开发者：周鑫                     *");
        System.out.println("*        版本：shop1.0                    *");
        System.out.println("*        时间：2018-11-16                 *");
        System.out.println("***********  bye ** bye ** bye  ***********");
        System.out.println("*******************************************");
        System.out.println();
    }
    //设置页面
    public void getSetInterface(){
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("*****  welcome to manage your Shop  *****");
        System.out.println("*****************************************");
        System.out.println("选择: [A]:查看 [U]:上架 [D]:下架 [Q]:退出");
        System.out.println("*****************************************");
        System.out.println();
    }

    //创建使用页面
    public void getUseInterface(){
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("*****  welcome to manage your Shop  *****");
        System.out.println("*****************************************");
        System.out.println("选择: [A]:查看 [U]:下单 [D]:退单 [Q]:退出");
        System.out.println("***********  [L]:查看当前发票  **********");
        System.out.println("*****************************************");
        System.out.println();
    }
    //关于页面
    public void getAboutInterface(){
        System.out.println();
        System.out.println("*******************************************");
        System.out.println("*******  Thank you use Simple Shop  *******");
        System.out.println("*        开发者：周鑫                     *");
        System.out.println("*        版本：shop1.0                    *");
        System.out.println("*        时间：2018-11-16                 *");
        System.out.println("*******************************************");
        System.out.println();
    }

}
