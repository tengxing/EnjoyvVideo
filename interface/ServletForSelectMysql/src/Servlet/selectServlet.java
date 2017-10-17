package Servlet;
import model.queryShow;
import select.selectSql;
import test.ti;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class selectServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        selectSql selectSql = new selectSql();
        queryShow queryShow = new queryShow();
        String name = (String )request.getAttribute("name");
        try{
           queryShow = selectSql.select(name);
        }catch (Exception e){
            e.printStackTrace();
        }
        request.setAttribute("queryShow" , queryShow);
        request.getRequestDispatcher("/show.jsp").forward(request,response);




    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request ,response);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
