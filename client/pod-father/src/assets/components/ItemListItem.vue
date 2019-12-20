<template>
  
    <tr>
          <td>  {{item.customer}}  </td>
          <td>  {{item.site}}  </td>
          <td>  {{item.year}} </td>
          <td>  {{item.month}} </td>
          <td> {{item.wasteType}} </td>
          <td>  {{item.estimatedQuantity}} </td>
          <td>  {{item.actualQuantity}} </td>
       
    </tr>
  
</template>

<script>
export default {
    name:"item-list-item",
    props:["item"]

}
</script>

<style>

</style>