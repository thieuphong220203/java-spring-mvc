<%@page contentType="text/html" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                <h3>Delete User with id = ${id}</h3>
                <a href="/admin/user/create" class="btn btn-primary btn-lg">
                  Create a User </a>
              </div>
              <hr>
              <div class="alert alert-danger">
                Are you sure to delete this user?
              </div>
              <div class="d-flex align-items-center">
                <form:form method="post" action="/admin/user/delete" modelAttribute="newUser">
                  <div class="mb-3 d-none">
                    <label class="form-label">ID: </label>
                    <form:input path="id" value="${id}" type="text" class="form-control" readonly="true" />
                  </div>
                  <button class="btn btn-danger mt-3">Confirm delete</button>
                </form:form>
                <a href="/admin/user" class="btn btn-success mt-3 mx-2">Back</a>
              </div>

            </div>
          </div>
        </div>
      </body>

      </html>