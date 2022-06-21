<%-- 
    Document   : list
    Created on : Jun 20, 2022, 12:08:03 PM
    Author     : Phuong78
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" href="css/danhsachAdmin.css">
    <script type="text/javascript">
        function doDelete(idSanPham){
            if(confirm("Bạn có muốn xoá không")){
                window.location = "delete?idSanPham="+idSanPham;
            }
        }
    </script>
</head>
<body>
    <header>
        <div class="thanhdautien">
            <div class="tieude">
                <h1>ADMIN</h1>
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
        <form class="formthem">
            <div class="tentrang_header">
                Hàng hóa-Danh sách
            </div>

            <div class="danhsachloai">
                <table>
                    <tr>

                        <th>Mã sản phẩm</th>
                        <th>Tên điện thoại</th>
                        <th>Action</th>                       
                    </tr>
                    <c:forEach items ="${requestScope.data}" var="c">
                        <c:set var="idSanPham" value="${c.idSanPham}"/>
                        <tr>
                            <td>${idSanPham}</td>
                            <td>${c.tenSP}</td>
                            <td> <a href="update.jsp?id=${idSanPham}"><input type="button" value="Sửa" class="sua"></a>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <a href="#" onclick="doDelete('${idSanPham}')"><input type="button" value="Xoá" class="xoa"></a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div>

                <input class="submit" type="reset" value="bỏ chọn tất cả">
                <input class="submit" type="button" value="xóa các mục đã chọn">
                <a href="newSP.jsp"><input class="submit" type="button" value="Nhập thêm"></a>
            </div>
        </form>
    </header>


</body>


</html>