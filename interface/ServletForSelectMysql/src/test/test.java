package test;

import model.queryShow;
import select.selectSql;

public class test {
    public static  void main(String args[]){
        selectSql  selectSql = new selectSql();

        try{
        queryShow queryShow = selectSql.select("偷");
        System.out.println(queryShow.getTitle() +"\n" + queryShow.getMajorActor()
        +"\n" + queryShow.getVideoUrl() +"\n" + queryShow.getContent());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
