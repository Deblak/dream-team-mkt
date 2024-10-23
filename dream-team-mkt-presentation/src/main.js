import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import { createI18n } from 'vue-i18n';
import French from './i18n/fr.json';
import English from './i18n/en.json';

const app = createApp(App)

const i18 = createI18n({
  locale: navigator.language,
  fallbackLocale: 'en',
  legacy: false,
  globalInjection: true,
  messages: {
    fr: French,
    en: English
  }
})

app.use(router)
app.use(i18)
app.mount('#app')
