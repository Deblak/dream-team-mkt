<script setupt></script>
<template>
  <footer class="text-center bg-primary">
    <ul class="d-lg-flex justify-content-center p-0">
      <li class="list-group-item p-2">
        <router-link to="/" class="text-bg-primary nav-link">{{ $t('homePage') }}</router-link>
      </li>
      <li class="list-group-item p-2">
        <router-link to="/edit-home" class="text-bg-primary nav-link">{{ $t('editPage') }}</router-link>
      </li>
    </ul>
    <small class="mt-2">
      <router-link to="/edit-terms" class="text-bg-primary nav-link">Legal informations</router-link>
    </small>
  </footer>
</template>
