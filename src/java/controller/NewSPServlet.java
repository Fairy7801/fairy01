/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DsAdminDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.category;

/**
 *
 * @author Phuong78
 */
@WebServlet(name = "NewSPServlet", urlPatterns = {"/newSP"})
public class NewSPServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewSPServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewSPServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tenSP = request.getParameter("tenSP");
//        String id = request.getParameter("id");
        String hang = request.getParameter("hang");
        String pin = request.getParameter("pin");
        String ram = request.getParameter("ram");
        String rom = request.getParameter("rom");
        String cpu = request.getParameter("cpu");
        String KTmanhinh = request.getParameter("KTmanhinh");
        String cameraTruoc = request.getParameter("cameraTruoc");
        String cameraSau = request.getParameter("cameraSau");
        String gia = request.getParameter("gia");
        String linkAnh = request.getParameter("linkAnh");
        String moTa = request.getParameter("moTa");
        int idSanPham = 1;
        DsAdminDAO ds = new DsAdminDAO();
        
        try {
//            idSanPham =  Integer.parseInt(id);
            category c = ds.getCategoryById(idSanPham);
            if (c == null) {
                category cNew = new category(1, tenSP, hang, pin, ram, rom, cpu, KTmanhinh, cameraTruoc, cameraSau, gia, linkAnh, moTa);
                System.out.println(cNew);
                //ds.insert(cNew);
                response.sendRedirect("list");    
            }else{
                request.setAttribute("error", tenSP + "exited!");
                request.getRequestDispatcher("newSP.jsp").forward(request, response);
            }
            
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
