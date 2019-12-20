<template>
  <div>  
    <ul>
        <li>
            {{item.customer}}
        </li>

    </ul>

  </div>
</template>

<script>
export default {
    name:"item-list-item",
    props:["item"]

}
</script>

<style>

</style>