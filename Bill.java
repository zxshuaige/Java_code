package com.company;
import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * Author:xixixi
 * Created: $[Date()]
 **/
public class Bill extends Goods {
    private int idoflist = 1;
    private int num;
    private class HeaderOfList{
        final private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final private String ID = "编号";
        final private String Name = "产品名称";
        final private String Num = "数量";
        final private String Price = "单价";
        public String getHeaderInfoO(){
            return "日期："+this.df.format(new Date())+
                    "\n---------------------------\n"+
                    this.ID+"  "+this.Name+"    "+this.Num+"  "+this.Price;
        }
    }
    //构造方法
    public Bill(){};
    public Bill(int idoflist){
        this.idoflist = idoflist;
    }

    //get set方法
    public int getIdoflist() {
        return idoflist;
    }

    public int getNum() {
        return num;
    }

    public void setIdoflist(int idoflist) {
        this.idoflist = idoflist;
    }

    public void setNum(int num) {
        this.num = num;
    }
    //////////
    public String getListOfHeaderInfo(){
        return "订单编号："+this.idoflist+"\n"+
                new HeaderOfList().getHeaderInfoO();
    }
    public String getListOfGoodsInfo(){
        return " "+this.getId()+"    "+this.getName()+"      "+this.num+"    "+this.getPrice()+"元";
    }
}
