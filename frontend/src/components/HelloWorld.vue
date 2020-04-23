<template>
 <div>{{greetings}}</div>
</template>

<script>
    export default {
     data(){
      return {
       greetings: "Hello World" //не знаю как сюда подсунуть из контролера,
                                // this.$resource('/greetings') чет не хавает
      }
       //        created: function() {
       //  greetingApi.get().then(result =>
       //          result.json().then(data =>
       //                  data.forEach(greeting => self.greetings.push(greeting))
       //          )
       //  )
       // }
      }
     }
    }
</script>

<style>
</style>
