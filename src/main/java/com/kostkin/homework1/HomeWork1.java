package com.kostkin.homework1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@WebServlet(name = "homework1", urlPatterns = "/hw1")
public class HomeWork1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<Integer, String> products = new HashMap<>();
        products.put(0, "АРБУЗ");
        products.put(1, "ДЫНЯ");
        products.put(2, "ВИНОГРАД");
        products.put(3, "ЯБЛОКО");
        products.put(4, "АПЕЛЬСИН");
        products.put(5, "ГРУША");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            Product product = new Product(i, products.get(r.nextInt(products.size() - 1)), 150 + r.nextInt(products.size()));
            String format = String.format("Продукт: %s, стоимость: %d", product.getTitle(), product.getCost());
            resp.getWriter().printf("<h1>" + format + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
    }


}
