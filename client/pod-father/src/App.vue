<template >
<div align="center">
 <h1>PODFather App</h1>
    <item-filter class="form-control"></item-filter>
    <item-table class="table" id="item-list" :items="filteredItems"></item-table>
  </div>
</template>

<script>
import ItemTable from './assets/components/ItemTable'
import ItemFilter from './assets/components/ItemFilter'
import { eventBus } from './main';
import Vue from 'vue'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'



export default {
  name: 'app',
  data(){
    return{
      items: [],
      searchTerm: ""
    }
  },
  components: {
    "item-table": ItemTable,
    "item-filter": ItemFilter

  },
  computed: {
    filteredItems: function () {
      if (!this.searchTerm.length) return this.items;
      return this.items
      .filter(item => item.customer.toLowerCase()
      .includes(this.searchTerm.toLowerCase()));
    }
  },
  mounted(){
    fetch('http://localhost:8080/items?page=0&size=41')
    .then(res => res.json())
    .then(items => this.items = items._embedded.items);

    eventBus.$on('item-search', searchTerm => this.searchTerm = searchTerm)
  },
   

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
