<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>MASACH</th>
                <th>TUASACH</th>
                <th>TACGIA</th>
                <th>NHAXUATBAN</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="sach" items="${listSach}">
                <tr>
                    <td>${sach.masach}</td>
                    <td>${sach.tuasach}</td>
                    <td>${sach.tacgia}</td>
                    <td>${sach.nhaxuatban}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    
</body>
</html>