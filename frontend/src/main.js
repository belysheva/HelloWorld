var greetingApi = Vue.resource('greeting');

Vue.component('hello-world', {
    props:['greetings'],
    template: '<div>test</div>',
    created: function() {
        greetingApi.get().then(result =>
            result.json().then(data =>
                data.forEach(greeting => this.greetings.push(greeting))
            )
        )
    }
});


var app = new Vue({
    el: '#app',
    template: '<hello-world :greetings="greetings" />',
    data: {
        greetings: []
    }
});