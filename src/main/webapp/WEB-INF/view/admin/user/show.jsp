<%@page contentType="text/html" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>User Details ${id}</title>

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
              <h3>User detail with id ${id}</h3>
              <a href="/admin/user/create" class="btn btn-primary btn-lg">
                Create a User </a>
            </div>
            <hr>

            <div class="card mx-auto" style="width: 60%;">
              <div class="card-header">
                User Information
              </div>
              <ul class="list-group list-group-flush">
                <li class="list-group-item">ID: ${user.id}</li>
                <li class="list-group-item">Email: ${user.email}</li>
                <li class="list-group-item">Full Name: ${user.fullName}</li>
                <li class="list-group-item">Address: ${user.address}</li>
              </ul>
            </div>
            <div class="d-flex justify-content-center">
              <a href="/admin/user" class="btn btn-success mt-3">Back</a>
            </div>

          </div>
        </div>
      </div>
    </body>

    </html>