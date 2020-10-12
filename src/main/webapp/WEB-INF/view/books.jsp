<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Books</title>
    <style>
        table, th, td
        {
            border: 1px solid black;
        }
        table
        {
            width: 40%;
            border-collapse: collapse;
        }
        th, td
        {
            height: 40px;
            text-align: center;
            font-size: 1.5rem;
        }
    </style>
</head>
<body>
<h1>Books</h1>

<br/>

<div>
    <table >
        <tr>
            <th>id</th>
            <th>Title</th>
            <th>Price</th>
        </tr>
        <jsp:useBean id="book" scope="request" type="java.util.List"/>
        <c:forEach  items="${book}" var ="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>