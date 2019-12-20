<template>
<div>
 <h1>PODFather App</h1>
    <item-table id="item-list" :items="items"></item-table>
  </div>
</template>

<script>
import ItemTable from './assets/components/ItemTable'
import ItemFilter from './assets/components/ItemFilter'

export default {
  name: 'app',
  data(){
    return{
      items: []
    }
  },
  components: {
    "item-table": ItemTable
  },
  mounted(){
    fetch('http://localhost:8080/items')
    .then(res => res.json())
    .then(items => this.items = items._embedded.items);
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
