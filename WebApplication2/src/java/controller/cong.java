/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author LAPTOP
 */
@WebServlet(name = "cong", urlPatterns = {"/cong"})
public class cong extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cong</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cong at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        String num1_raw = request.getParameter("num1");
        String num2_raw = request.getParameter("num2");
        String phepTinh = request.getParameter("pheptinh");
        try {
            int num1 = Integer.parseInt(num1_raw);
            int num2 = Integer.parseInt(num2_raw);
            int total = 0;
            switch(phepTinh){
                 case "cong":
                    total = num1 + num2;
                    pw.println(total);
                    break;
                case "tru":
                    total = num1 - num2;
                    pw.println(total);
                    break;
                default:
                    pw.println("phep tinh khong hop le");
                    return;
            }
        } catch (Exception e) {
            pw.println("nhap lai em nhe");
        }
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        String num1_raw = request.getParameter("num1");
        String num2_raw = request.getParameter("num2");
        String phepTinh = request.getParameter("pheptinh");
        try {
            int num1 = Integer.parseInt(num1_raw);
            int num2 = Integer.parseInt(num2_raw);
            int total = 0;
            switch(phepTinh){
                 case "cong":
                    total = num1 + num2;
                    pw.println(total);
                    break;
                case "tru":
                    total = num1 - num2;
                    pw.println(total);
                    break;
                default:
                    pw.println("phep tinh khong hop le");
                    return;
            }
        } catch (Exception e) {
            pw.println("nhap lai em nhe");
        }
    }
}
