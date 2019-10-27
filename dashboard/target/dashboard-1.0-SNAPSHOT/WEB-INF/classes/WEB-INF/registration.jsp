<%--
  Created by IntelliJ IDEA.
  User: flexa
  Date: 17.10.2019
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"/>
<form method="POST" action="${pageContext.request.contextPath}/registration" enctype="multipart/form-data">
    <div class="form-group">
        <label for="firstName">First name</label>
        <input type="text" name="firstName" class="form-control" id="firstName" aria-describedby="firstName"
               placeholder="Enter first name">
        <small id="firstName1" class="form-text text-muted">Please enter first name</small>
    </div>
    <div class="form-group">
        <label for="lastName">Last name</label>
        <input type="text" name="lastName" class="form-control" id="lastName" aria-describedby="lastName"
               placeholder="Enter last name">
        <small id="lastName1" class="form-text text-muted">Please enter last name</small>
    </div>
    <div class="form-group">
        <label for="email">Email name</label>
        <input type="email" name="email" class="form-control" id="email" aria-describedby="email"
               placeholder="Enter email">
        <small id="email1" class="form-text text-muted">Please enter email</small>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" name="password" class="form-control" id="password" aria-describedby="password"
               placeholder="Enter password">
        <small id="password1" class="form-text text-muted">Please enter password</small>
    </div>


    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<jsp:include page="footer.jsp"/>