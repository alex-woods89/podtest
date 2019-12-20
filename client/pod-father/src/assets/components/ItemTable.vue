<template>
<div>
    <h3>Item Table</h3>
<table>
  <tr>
    <th>Customer</th>
    <th>Site</th>
    <th>Year</th>
    <th>Month</th>
    <th>Waste Type</th>
    <th>Estimated Quantity</th>
    <th>Actual Quantity</th>

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