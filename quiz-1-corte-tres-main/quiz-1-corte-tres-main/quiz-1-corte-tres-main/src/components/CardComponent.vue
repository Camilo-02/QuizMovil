<template>
            <ion-card :id="id" :color="color">
                <ion-card-header>
                    <ion-card-title>{{value}}</ion-card-title>
                    <ion-card-subtitle>{{subtitulo}}</ion-card-subtitle>
                    </ion-card-header>

                    <ion-card-content>
                    {{ content }}
                    </ion-card-content>            
            </ion-card>

</template>
  
  <script lang="ts">
  import { IonCard } from '@ionic/vue';
  import { defineComponent } from 'vue';
  
  export default defineComponent({
    components: { IonCard },
    props: {
      subtitulo: String,
      id: {
        type: String
      },
      value: {
        type: String
      },

      
      
      color: String,
      header: String,
      title: String,
      subtitle: String,
      content: String
    }
  });
  </script>
  
  <style scoped>

  </style>