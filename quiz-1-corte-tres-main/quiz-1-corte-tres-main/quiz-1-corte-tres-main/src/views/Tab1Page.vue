<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>Quiz</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Vista</ion-title>
        </ion-toolbar>
      </ion-header>


      <InputComponent id = "Nombre" value = "Ingresa Nombre" label = "Nombre:" type = "text"></InputComponent>
      <InputComponent id = "Fecha" label = "Fecha Nacimiento:" type= "date" ></InputComponent>
      <InputComponent id = "Celular" value = "#" label = "Número:" type = "text"></InputComponent>
      <InputComponent id = "Correo" value = "Correo Electronico" label = "Correo:" type = "text"></InputComponent>
      <ion-list>

        

<ButtonComponent id = "btnAgregar" value="agregar"/>
<ButtonComponent id = "btnModificar" value="modificar"/>
<ButtonComponent id = "btnEliminar" value="eliminar"  color = "danger"/>
<ButtonComponent id = "btnConsultar" value="consultar"/>



  </ion-list>
  <div>
    <CardComponent id = "mensaje" value = "Caja de Mensaje" subtitulo="Escribenos tu opinion" content= "" ></CardComponent>
  </div>
  
    </ion-content>
  </ion-page>

</template>

<script setup lang="ts">
import { IonPage, IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/vue';
import ButtonComponent from '@/components/ButtonComponent.vue';
import InputComponent from '@/components/InputComponent.vue';
import CardComponent from '@/components/CardComponent.vue';

</script>
