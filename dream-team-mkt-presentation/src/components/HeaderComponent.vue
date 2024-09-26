<script setupt></script>

<template>
  <header class="container">
    <nav class="fixed-top navbar navbar-expand-lg bg-body-tertiary">
      <div class="container-fluid text-bg-primary">
        <div class="collapse navbar-collapse justify-content-center">
        <router-link to="/" class="navbar-brand text-white">{{$t('dreamTeam')}}</router-link>
        </div>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="d-flex">
          <router-link  to="/pricing" href="#" class="btn btn-primary dropdown-item p-2">{{$t('pricingPage')}}</router-link>
          <router-link  to="/edit" href="#" class="btn btn-primary dropdown-item p-2">{{$t('editPage')}}</router-link>
        </div>
        <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-auto">
          <li class="nav-item dropdown">
            <ul class="dropdown-menu dropdown-menu-end" aria-controls="navbarSupportedContent">
              <li>
                <router-link  to="/edit" href="#" class="btn btn-primary dropdown-item">{{$t('editPage')}}</router-link>
              </li>
              <li>
                <a class="dropdown-item" href="#">Action</a>
              </li>
              <li>
                <a class="dropdown-item" href="#">Another action</a>
              </li>
              <li>
                <hr class="dropdown-divider">
              </li>
              <li>
                <a class="dropdown-item" href="#">Something else here</a>
              </li>
            </ul>
        </li>
        </ul>
      </div>
    </nav>
  </header>
  <RouterView />
</template>
