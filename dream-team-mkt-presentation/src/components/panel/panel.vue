<script setup></script>
<template>
    <section class="container">
        <span>Multiline message is:</span>
        <p style="white-space: pre-line;">{{ message }}</p>
        <label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>

        <div class="row row-cols-lg-2">
            <div class="mb-3">
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="4"></textarea>
            </div>
            <div class="mb-3">
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="4"></textarea>
            </div>
        </div>
    </section>
</template>