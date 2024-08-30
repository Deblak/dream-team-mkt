<script setupt></script>

<template>
  <header>
    <nav class="fixed-top navbar navbar-expand-lg bg-body-tertiary d-flex justify-content-between">
      <div class="container-fluid text-bg-primary">
        <div class="nav-item d-flex">
          <router-link to="/" class="btn btn-primary">Home</router-link>
        </div>
        <div class="collapse navbar-collapse d-flex justify-content-center">
          <a class="navbar-brand" href="#">DreamTeam</a>
        </div>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-auto">
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false" id="navbarSupportedContent"
            >
              Menu
            </a>
            <ul class="dropdown-menu dropdown-menu-end" aria-controls="navbarSupportedContent">
              <li><router-link  to="/edit" href="#" class="btn btn-primary dropdown-item">Edit page</router-link></li>
              <li><a class="dropdown-item" href="#">Action</a></li>
              <li><a class="dropdown-item" href="#">Another action</a></li>
              <li>
                <hr class="dropdown-divider">
              </li>
              <li><a class="dropdown-item" href="#">Something else here</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <RouterView />
</template>
