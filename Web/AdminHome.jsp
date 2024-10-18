<html>
<head>
<title>Add Student</title>
<link rel='stylesheet' href='resources/bootstrap.min.css'/>
<link rel='stylesheet' href='style.css'/>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="feereport.jsp">FeeReport</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="index.html">Home</a></li>
        <li><a href="addstudent.html">Add Student</a></li>
        <li><a href="ViewServlet">View Student</a></li>
        <li><a href="searchstudent.html">View Fee</a>
        <li><a href="SearchStudentForm">Search Student</a></li>
        <li><a href="searchteacher.html">View Feedback</a></li>
        <li><a href="index.html">Logout</a></li>
        </ul>

    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav><div class='container'>
<h1>Accountant Logout!</h1>
<form action="AccountantLogin1.jsp" method="post">
<table>
<tr><td>Email:</td><td><input type="email" name="email" required/></td></tr>
<tr><td>Password:</td><td><input type="password" name="password" required/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Logout"/></td></tr>
</table>
</form></div>
<div class="container-fluid footer">
<p><h1>Welcome To THDC-IHET</h1></p>
<p><h1>Student Department</h1></p>
</div>
  <script src="resources/jquery.min.js"></script>
  <script src="resources/bootstrap.min.js"></script>
</body>
</html>
