<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Evento</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">login</ion-title>
        </ion-toolbar>
      </ion-header>
      <div id="login-container">

      
        <div id="login-form">
          <InputComponent id="nombre" name="nombre" label="Nombre del Evento: " />
          <InputComponent type="date" id="fecha" name="fecha" label="Fecha: " />
          <ButtonComponent id="agendar" value="Agendar" fill="outline" />
        </div>

      </div>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonPage, IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/vue';
import InputComponent from '@/components/InputComponent.vue';
import ButtonComponent from '@/components/ButtonComponent.vue';
</script>
