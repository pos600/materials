<?php

$login = 0;
$invalid = 0;
$missing = 0;

if($_SERVER['REQUEST_METHOD'] == 'POST'){
    include 'connect.php';

    $username=$_POST['username'];
    $password=$_POST['password'];

    $sql="SELECT * FROM `registration` where username='$username'";  
    $result=mysqli_query($con, $sql);

    while($row = $result->fetch_assoc()){
        $hashed_password = $row["password"];
        $verify = password_verify($password, $hashed_password);

        if ($verify){
            if($result){
                $num=mysqli_num_rows($result);
                if($num>0){
                    $login=1;
                    session_start();
                    $_SESSION['username']=$username;
                    header('location:home.php');
                }else{
                    $invalid=1;
                }
            }else{
                $missing=1;
            }
        } else{
            $invalid=1;
        }

    }

}

?>


<!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
            <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
            <!-- <link rel="stylesheet" href="style.css"> -->
            <title>LOGIN</title>
        </head>
        <body class="p-3 m-0 border-0 bd-example">

<?php
if($login){
    echo'<div class="alert alert-success alert-dismissible fade show" role="alert">
    <strong>Welcome back!</strong> Login successful.
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>';
}elseif($invalid){
    echo'<div class="alert alert-danger alert-dismissible fade show" role="alert">
    <strong>Woops!</strong> Something went wrong.
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>';
}elseif($missing){
    echo'<div class="alert alert-danger alert-dismissible fade show" role="alert">
    <strong>Woops!</strong> Account does not exist!
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>';
}

?>
            <div class="container mt-2">
                <h1 class="text-center">LOGIN</h1>
                <form action="login.php" method="post">
                    <div class="mb-3">
                        <label for="username" class="form-label">Username:</label>
                        <input type="text" class="form-control" id="username" name="username"
                            placeholder="Enter your username here">
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password:</label>
                        <input type="password" class="form-control" id="password" name="password"
                            placeholder="Enter your password here">
                    </div>
                    <button type="submit" class="btn btn-primary w-100 mb-2">Login</button>
                    <a href="sign.php" class="btn btn-primary w-100">Signup</a>
                </form>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
        </body>
    </html>