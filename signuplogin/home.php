<?php
    session_start();
    if(!isset($_SESSION['username'])){
        header('location:login.php');
    }
?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.rtl.min.css" 
    integrity="sha384-WJUUqfoMmnfkBLne5uxXj+na/c7sesSJ32gI7GfCk4zO4GthUKhSEGyvQ839BC51" crossorigin="anonymous">
    <title>Welcome page</title>
  </head>
  <body>
    <h1 class="text-center text-success mt-5">Welcome
    <?php echo $_SESSION['username'];?>
    </h1>

    <div class="container">

    <a href="logout.php" class="btn btn-primary mt-5">Logout</a>

    </div>

  </body>
</html>