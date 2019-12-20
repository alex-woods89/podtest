<template>
<div>
    <h3>Item Table</h3>
    <item-list-item v-for="(item, index) in items" :item="item" :key="index"></item-list-item>  
</div>
  
</template>

<script>
import ItemListItem from './ItemListItem'
  
export default {
    name: "item-table",
    props: ["items"],
    components: {
        "item-list-item": ItemListItem
    }

}
</script>

<style>

</style>