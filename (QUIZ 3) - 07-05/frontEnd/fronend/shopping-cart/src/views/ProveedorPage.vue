<template>
    <ion-page>
      <ion-header :translucent="true">
        <ion-toolbar>
          <ion-title>Carrito de compra</ion-title>
        </ion-toolbar>
      </ion-header>  
      <ion-content>       
        <div id="login-container">  
          <div id="login-form">
            <ProveedorInputComponent ></ProveedorInputComponent>
          
          </div>  

          <div>
          <!-- Traer el componente de los botones de la crud -->
          <CrudButtonComponent @findAllRecords="findAllRecords" @createRecord="createRecord" @updateRecord="updateRecord" @deleteRecordPhysical="deleteRecordPhysical" />
        </div>          
        </div>
      </ion-content>
    </ion-page>
  </template>
  
  <script setup lang="ts">
  import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
  import CrudButtonComponent from '@/components/CrudButtonComponent.vue';
  import ProveedorInputComponent from '../components/ProveedorInputComponent.vue';
  import axios from 'axios';


  
  const baseURL = 'http://localhost:9000/shopping-car/api/proveedor';
// Métodos para interactuar con la API
// Obtener todos los registros
async function findAllRecords() {
  try {
    const response = await axios.get(baseURL);
    return response.data;
  } catch (error) {
    console.error('Error al obtener todos los registros:', error);
    throw error;
  }
}

/* Obtener por ID
async function fetchRecordById(id) {
  try {
    const response = await axios.get(`${baseURL}/${id}`);
    return response.data;
  } catch (error) {
    console.error('Error al obtener el registro por ID:', error);
    throw error;
  }
} */

// Crear registro
async function createRecord() {
  const data = {
    codigo: codigo.value,
    nombre: name.value,
    direccion: direccion.value
    
  };

  try {
    const response = await axios.post(baseURL, data);
    console.log('Registro creado exitosamente:', response.data);
  } catch (error) {
    console.error('Error al crear el registro:', error);
  }
}


// Actualizar registro
async function updateRecord(id, data) {
  try {
    const response = await axios.put(`${baseURL}/${id}`, data);
    return response.data;
  } catch (error) {
    console.error('Error al actualizar el registro:', error);
    throw error;
  }
}

// Eliminar registro físico
async function deleteRecordPhysical(id) {
  try {
    const response = await axios.delete(`${baseURL}/${id}`);
    return response.data;
  } catch (error) {
    console.error('Error al eliminar el registro físico:', error);
    throw error;
  }
}

/* Eliminado lógico
async function deleteRecordLogical(id) {
  try {
    const response = await axios.put(`${baseURL}/delete-logical/${id}`);
    return response.data;
  } catch (error) {
    console.error('Error al realizar el eliminado lógico:', error);
    throw error;
  } 
} */
  </script>
  