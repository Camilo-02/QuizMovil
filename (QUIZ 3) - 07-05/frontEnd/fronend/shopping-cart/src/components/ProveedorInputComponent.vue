<template>
    <div id="login-container">
        <div id="login-form">
            <InputComponent id="codigo" name="codigo" label="Ingresa el Codigo:"></InputComponent>
            <InputComponent id="name" name="nombre" label="Ingresa el Nombre: "></InputComponent>
            <InputComponent id="direccion" name="direccion" label="Ingresa la Direccion"></InputComponent>
        </div>
    </div>

</template>

<script setup lang="ts">
    import InputComponent from '@/components/InputComponent.vue';


</script>