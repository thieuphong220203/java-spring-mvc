<%@page contentType="text/html" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Home Page</title>

      <!-- Latest compiled and minified CSS -->
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

      <!-- Latest compiled JavaScript -->
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    </head>

    <body>
      <div class="container mt-5">
        <div class="row">
          <div class="col-12 mx-auto">
            <div class="d-flex justify-content-between align-items-center mb-3">
              <h3>Tables Users</h3>
              <a href="/admin/user/create" class="btn btn-primary btn-lg">
                Create a User </a>
            </div>

            <hr>

            <table class="table table-bordered table-hover table-striped">
              <thead class="thead-dark">
                <tr class="text-center">
                  <th>ID</th>
                  <th>Email</th>
                  <th>Full Name</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="user" items="${users}">
                  <tr>
                    <td>${user.id}</td>
                    <td>${user.email}</td>
                    <td>${user.fullName}</td>
                    <td class="text-start">
                      <a href="/admin/user/${user.id}" class="btn btn-success">View</a>
                      <a href="#" class="btn btn-warning mx-2">Update</a>
                      <a href="#" class="btn btn-danger">Delete</a>
                    </td>
                  </tr>
                </c:forEach>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </body>

    </html>