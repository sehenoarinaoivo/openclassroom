function calculator() {
    that= this;
    this.field="input#number";
    this.bouton="#body .bouton";
    this.init = false;
    
    this.run = function() {

        $(this.bouton).click(function(){
            var value = $(this).html();

            if(that.init==false) {
                $(that.field).val("");
                that.init = true;
            }  if(value!="=") {
                $(that.field).val($(that.field).val()+value);
            }
            that.dispatcher(value);

           
        });
    };
    this.dispatcher= function(value) {
        if($(this.field).val().indexOf("/")!=-1) {
            this.operation(value,"/");
        }
        if($(this.field).val().indexOf("*")!=-1) {
            this.operation(value,"*");
        }
        if($(this.field).val().indexOf("+")!=-1) {
            this.operation(value,"+");
        }
        if($(this.field).val().indexOf("-")!=-1) {
            this.operation(value,"-");
        }
     }
     this.operation=function(value,symbole){
        var numbers = $(this.field).val().split(symbole), result;
        if(symbole=="/"){
            result= numbers[0]/numbers[1];
        }
        if(symbole=="*"){
            result= numbers[0]*numbers[1];
        }
        if(symbole=="+"){
            result= parsefloat(numbers[0])+parsefloat(numbers[1]);
        }
        if(symbole=="-"){
            result= numbers[0]-numbers[1];
        }
        var resultat= Math.round((resultat)*100/100);
        if(numbers.length>1) {
            if(value=="=") {
                $(this.field).val(result);
            } 
        } else if(numbers.length>2) {
                $(this.field).val(result+symbole);
            }
    }

}