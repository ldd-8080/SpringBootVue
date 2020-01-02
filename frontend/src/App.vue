<template>
  <div id="app">
    <header>
      <headerCom></headerCom>
    </header>
    <main>
      <br>
      <router-link to="/">/</router-link>
      <br>
      <router-link to="/testCom">/testCom</router-link>
      <br>
      <br>
      <router-view/>
    </main>
  </div>
</template>

<script>
import headerCom from '@/components/header'

export default {
  name: 'App',
  components: {
    headerCom
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
