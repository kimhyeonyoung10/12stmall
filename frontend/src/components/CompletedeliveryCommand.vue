<template>

    <v-card outlined>
        <v-card-title>
            Completedelivery
        </v-card-title>

        <v-card-text>
            <String label="Courier" v-model="value.courier" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="completedelivery"
            >
                Completedelivery
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CompletedeliveryCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.courier = '';
        },
        watch: {
        },
        methods: {
            completedelivery() {
                this.$emit('completedelivery', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

