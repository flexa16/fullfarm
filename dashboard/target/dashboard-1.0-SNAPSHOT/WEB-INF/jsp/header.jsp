<%--
  Created by IntelliJ IDEA.
  User: flexa
  Date: 23.09.2019
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Growing farm</title>
</head>
<link rel="shortcut icon" type="image/png"
      href="https://st2.depositphotos.com/1060654/8907/v/950/depositphotos_89077960-stock-illustration-hemp-cannabis-leaf-vector.jpg"/>
<body>

<nav class="navbar navbar-dark bg-dark sticky-top">

    <ul class="nav">

        <li class="nav-item">
            <a class="nav-link active" href="${pageContext.request.contextPath}/home">
                <h5>Home</h5>
            </a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/product-catalog">
                <h5>Device Map</h5>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/devices-list">
                <h5>Device List</h5>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/product-catalog">
                <h5>Device Details</h5>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/product-catalog">
                <h5>Reports</h5>
            </a>
        </li>


    <span class="pull-right">
        <li class="nav-item">
        <a class="nav-link active" href="${pageContext.request.contextPath}/registration">
            <h5>Register</h5>
        </a>
        </li>
    </span>
            <span class="pull-right">
        <li class="nav-item">
        <a class="nav-link active" href="${pageContext.request.contextPath}/login">
            <h5>Log In</h5>
        </a>
        </li>
    </span>

    <span class="pull-right">
        <li class="nav-item">
        <a class="nav-link active" href="${pageContext.request.contextPath}/login?logout">
            <h5>Log Out</h5>
        </a>
        </li>
    </span>



    </ul>

</nav>

