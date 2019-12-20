<template>
<form v-on:submit.prevent class="">
   <input type="text" v-model="searchTerm" placeholder="search for a customer">
</form>
  
</template>

<script>
import {eventBus} from '../../main'
export default {
    name: "item-filter",
    data(){
        return{
            searchTerm:""
        }
    },

    watch: {
        searchTerm: function(val){
            this.searchForItem()
        }
    },

    methods: {
        searchForItem(){
            eventBus.$emit('item-search', this.searchTerm)
        },
    }

}
</script>

<style>

</style>