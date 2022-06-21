<%-- 
    Document   : newSP
    Created on : Jun 20, 2022, 4:49:25 PM
    Author     : Phuong78
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
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
                 Hàng hóa -Thêm mới
            </div>
            
            <div class="formthem">
                <form action ="newSP" method="get">
                    <div class="demuc">
                        Tên sản phẩm <br>                 
                    <input class="nhap" type="text" name="tenSP" >
                    </div>
                    <div class="demuc">
                        Mã sản phẩm <br>
                        <input class="nhap" type="text" name="id">
                    </div>
                    <div class="demuc">
                        Hãng điện thoại <br>
                        <input class="nhap" type="text" name="hang">
                    </div>
                    <div class="demuc">
                        pin <br>
                        <input class="nhap" type="text" name="pin">
                    </div>
                    <div class="demuc">
                        Ram <br>
                        <input class="nhap" type="text" name="ram">
                    </div>
                    <div class="demuc">
                        Rom <br>
                        <input class="nhap" type="text" name="rom">
                    </div>
                    <div class="demuc">
                        Cpu <br>
                        <input class="nhap" type="text" name="cpu">
                    </div>
                    <div class="demuc">
                        Kích thước màn hình <br>
                        <input class="nhap" type="text" name="KTmanhinh">
                    </div>
                    <div class="demuc">
                        Camera trước <br>
                        <input class="nhap" type="text" name="cameraTruoc">
                    </div>
                    <div class="demuc">
                        Camera sau <br>
                        <input class="nhap" type="text" name="cameraSau">
                    </div>
                    <div class="demuc">
                        Giá <br>
                        <input class="nhap" type="text" name="gia">
                    </div>
                    <div class="demuc">
                        link ảnh <br>
                        <input class="nhap" type="url" name="linkAnh">
                    </div>
                    <div>
                        mô tả hình ảnh<br>
                        <input class="nhap" type="text" name="moTa">
                    </div>
                    <h5> ${requestScope.error}</h5>
                    <div>
                        <input class="submit" type="submit"  value="thêm mới">
                        <input class="submit" type="reset" value="nhập lại">
                        <a href="list.jsp"><input class="submit" type="button" value="danh sách"></a>
                    </div>
                </form>
            </div>
        
    
    </header>


</body>


</html>
