<%-- 
    Document   : update
    Created on : Jun 21, 2022, 2:17:52 PM
    Author     : Phuong78
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/sanphamAdmin.css">
</head>
<body>
    <header>
        <div class="thanhdautien">
            <div class="tieude">
                <h1>admin</h1>
            </div>
            <div class="menu">
                <ul>
                    <li><a href="#">Trang chủ</a></li>
                    <li><a href="#">Danh mục</a></li>
                    <li><a href="#">Hàng hóa</a></li>
                    <li><a href="#">Khách hàng</a></li>
                    <li><a href="#">Bình luận</a></li>
                    <li><a href="#">Thống kê</a></li>
                </ul>
            </div>


        </div>
        
            <div class="tentrang_header">
                 Hàng hóa -Sửa thông tin sản phẩm
            </div>
            <c:set var="c" value="${requestScope.category}"/>
            <div class="formthem">
                <form action="update" method="post">
                    <div class="demuc">
                        Tên sản phẩm <br>                 
                    <input class="nhap" type="text" name="tenSP" value="${c.tenSP}" >
                    </div>
                    <div class="demuc">
                        Mã sản phẩm <br>
                        <input class="nhap" type="text" name="idSanPham" value="${c.idSanPham}">
                    </div>
                    <div class="demuc">
                        Hãng điện thoại <br>
                        <input class="nhap" type="text" name="hang" value="${c.hang}">
                    </div>
                    <div class="demuc">
                        pin <br>
                        <input class="nhap" type="text" name="pin" value="${c.pin}" >
                    </div>
                    <div class="demuc">
                        Ram <br>
                        <input class="nhap" type="text" name="ram" value="${c.ram}" >
                    </div>
                    <div class="demuc">
                        Rom <br>
                        <input class="nhap" type="text" name="rom" value="${c.rom}" >
                    </div>
                    <div class="demuc">
                        Cpu <br>
                        <input class="nhap" type="text" name="CPU" value="${c.CPU}" >
                    </div>
                    <div class="demuc">
                        Kích thước màn hình <br>
                        <input class="nhap" type="text" name="KTmanhinh" value="${c.KTmanhinh}">
                    </div>
                    <div class="demuc">
                        Camera trước <br>
                        <input class="nhap" type="text" name="cameraTruoc" value="${c.cameraTruoc}">
                    </div>
                    <div class="demuc">
                        Camera sau <br>
                        <input class="nhap" type="text" name="cameraSau" value="${c.cameraSau}">
                    </div>
                    <div class="demuc">
                        Giá <br>
                        <input class="nhap" type="text" name="gia" value="${c.gia}">
                    </div>
                    <div class="demuc">
                        link ảnh <br>
                        <input class="nhap" type="url" name="linkAnh" value="${c.linkAnh}">
                    </div>
                    <div>
                        mô tả hình ảnh<br>
                        <input class="nhap" type="text" name="moTa" value="${c.moTa}">
                    </div>
                    <div>
                        <input class="submit" type="submit"  value="Xác nhận">
                        <a href="list"><input class="submit" type="button" value="quay lại"></a>
                    </div>

                </form>
            </div>
        
    
    </header>


</body>


</html>
