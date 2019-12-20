<template>
<div>
    <h3>Item Table</h3>
<table>
  <tr>
    <th>customer</th>
    <th>site</th>
    <th>year</th>
    <th>month</th>
    <th>waste type</th>
    <th>estimated quantity</th>
    <th>actual quantity</th>

  </tr>
   
    <item-list-item v-for="(item, index) in items" :item="item" :key="index"></item-list-item> 
   
</table> 
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