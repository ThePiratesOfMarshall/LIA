<!doctype html>
<html lang="it">
<head>
    <title>Light It App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <link href="style.css" rel="stylesheet">
</head>
<body>
<nav class="navbar bg-light py-20 fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
        <img src="luci.jpg" width="60" height="60">
    Light It App</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
      <div class="offcanvas-header">
        <h5 class="offcanvas-title" id="offcanvasNavbarLabel">Light It App</h5>
        <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
      </div>
      <div class="offcanvas-body">
        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="index.php">Home</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              DJ Page
            </a>
            <ul class="dropdown-menu">
              <li><a class="dropdown-item" href="eventsPage.php">Events</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </div>
</nav>
<p class="text-center"><h3>Visita e scarica la nostra app per poter godere di un'esperienza unica!</h3></p>
 
<a class="btn btn-primary" href="#" role="button">Download Now!</a><!--in href link poi per scaricare app-->
    
</body>
</html>   