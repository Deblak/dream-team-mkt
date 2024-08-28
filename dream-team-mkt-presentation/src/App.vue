<script setup>
import { RouterView } from 'vue-router'
</script>

<template>

  <header>
    <nav class="ontainer text-center navbar navbar-expand-lg bg-primary p-3 text-white d-flex justify-content-between">

      <div class="d-flex justify-content-between">

        <div>
          <router-link to="/edit" class="btn btn-primary">Edit page</router-link>
        </div>
        
        <div>
          <p class="collapse navbar-collapse navbar-brand text-white" id="navbarNav">DreamTeam</p>
        </div>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
          aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <router-link to="/" class="btn btn-primary">Home</router-link>
            </li>
          </ul>
        </div>

      </div>
    </nav>
  </header>
  <RouterView />
</template>

<style scoped></style>
