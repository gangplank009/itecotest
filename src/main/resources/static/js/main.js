let messageApi = Vue.resource('/message{/id}');

Vue.component('message-form', {
    data: function() {
        return {
            text: ''
        }
    },
    template:
        '<div>' +
            '<input type="text" placeholder="Write new message" v-model="text"/>' +
            '<input type="button" value="Send" v-on:click="send"/>' +
        '</div>',
    methods: {
        send: function() {
            var message = {text: this.text};
            messageApi.save(message);
            this.text = '';
        }
    }
});

let app = new Vue({
    el: '#app',
    template: '<message-form/>',
    data: {
        message: 'Привет, Vue!'
    }
});